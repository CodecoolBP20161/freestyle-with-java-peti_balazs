import controller.Exchanger;
import model.Amount;
import model.CurrencyInEur;
import model.CurrencyInUsd;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by csyk on 2016.10.24..
 */
public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in

        System.out.println("Enter a number: ");
        Amount amount = new Amount(reader.nextBigDecimal()); // Scans the next token of the input as a BigDecimal.

        System.out.println("Enter a currency: ");
        String currencyName1 = reader.next();
        System.out.println("Enter another currency: ");
        String baseCurrency1 = reader.next();

        System.out.println("Enter a currency: ");
        String currencyName2 = reader.next();
        System.out.println("Enter another currency: ");
        String baseCurrency2 = reader.next();

        CurrencyInUsd currency1 = new CurrencyInUsd(currencyName1, baseCurrency1, BigDecimal.valueOf(0.749541));
        CurrencyInEur currency2 = new CurrencyInEur(currencyName2, baseCurrency2, BigDecimal.valueOf(0.00324589441));

        Exchanger changer = new Exchanger();

        System.out.println(changer.exchanger(currency1, currency2, amount));
    }
}
