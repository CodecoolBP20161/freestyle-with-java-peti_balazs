import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by csyk on 2016.10.24..
 */
public class Exchanger {

    public static BigDecimal exchanger(Currency currency1, Currency currency2, Amount amount){
        BigDecimal result;
        if(currency1.baseCurrency != currency2.baseCurrency && currency1.baseCurrency == "EUR"){
            CurrencyInUsd eur = new CurrencyInUsd("EUR", "USD", BigDecimal.valueOf(0.918476065));
            // result = amount.value * currency1.rate * eur.rate / currency2.rate;
            result = amount.value.multiply(currency1.rate).multiply(eur.rate).divide(currency2.rate, 8,RoundingMode.HALF_UP);
        }
        else if(currency1.baseCurrency != currency2.baseCurrency && currency1.baseCurrency == "USD") {
            CurrencyInUsd usd = new CurrencyInUsd("USD", "EUR", BigDecimal.valueOf(1.08876));
            // result = amount.value * currency1.rate * usd.rate / currency2.rate;
            result = amount.value.multiply(currency1.rate).multiply(usd.rate).divide(currency2.rate, 8,RoundingMode.HALF_UP);
        }
        else{
            // TODO: 2016.10.24. handle ArithmeticException caused by divide()
            // result = amount.value * currency1.rate / currency2.rate;
            result = amount.value.multiply(currency1.rate).divide(currency2.rate, 8,RoundingMode.HALF_UP);
        }
        return result;
    }
}
