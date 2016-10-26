package controller;

import model.Amount;
import model.Currency;
import model.CurrencyInEur;
import model.CurrencyInUsd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;


public class Exchanger {

    String[] eurCurrencies = new String[]{"BGN", "CHF", "CZK", "DKK", "GBP", "HRK", "HUF", "NOK", "PLN", "RON", "RUB", "SEK", "TRY", "USD"};


    public BigDecimal exchanger(String currency1, String currency2, Amount amount){

        BigDecimal result;

        if(Arrays.asList(eurCurrencies).contains(currency1) !=
                Arrays.asList(eurCurrencies).contains(currency2) &&
                Arrays.asList(eurCurrencies).contains(currency1)){

            CurrencyInEur currencyFrom = new CurrencyInEur(currency1);
            CurrencyInUsd currencyTo = new CurrencyInUsd(currency2);
            CurrencyInUsd eur = new CurrencyInUsd("EUR");


            // result = amount.value * currency1.rate * eur.rate / currency2.rate;
            result = amount.value.multiply(currencyFrom.rate).multiply(eur.rate).divide(currencyTo.rate, 8,RoundingMode.HALF_UP);
        }
        else if(Arrays.asList(eurCurrencies).contains(currency2) !=
                Arrays.asList(eurCurrencies).contains(currency1) &&
                Arrays.asList(eurCurrencies).contains(currency2)){

            CurrencyInEur currencyFrom = new CurrencyInEur(currency1);
            CurrencyInUsd currencyTo = new CurrencyInUsd(currency2);
            CurrencyInUsd usd = new CurrencyInUsd("USD");

            // result = amount.value * currency1.rate * usd.rate / currency2.rate;
            result = amount.value.multiply(currencyFrom.rate).multiply(usd.rate).divide(currencyTo.rate, 8,RoundingMode.HALF_UP);
        }
        else if(Arrays.asList(eurCurrencies).contains(currency1) && Arrays.asList(eurCurrencies).contains(currency2)){
            // result = amount.value * currency1.rate / currency2.rate;

            CurrencyInEur currencyFrom = new CurrencyInEur(currency1);
            CurrencyInEur currencyTo = new CurrencyInEur(currency2);

            result = amount.value.multiply(currencyFrom.rate).divide(currencyTo.rate, 8,RoundingMode.HALF_UP);
        }
        else{
            CurrencyInUsd currencyFrom = new CurrencyInUsd(currency1);
            CurrencyInUsd currencyTo = new CurrencyInUsd(currency2);

            result = amount.value.multiply(currencyFrom.rate).divide(currencyTo.rate, 8,RoundingMode.HALF_UP);
        }

        return result;
    }
}
