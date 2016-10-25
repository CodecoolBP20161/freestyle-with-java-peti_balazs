import controller.Exchanger;
import model.Amount;
import model.CurrencyInEur;
import model.CurrencyInUsd;

import java.math.BigDecimal;

/**
 * Created by csyk on 2016.10.24..
 */
public class Main {
    public static void main(String[] args) {
        CurrencyInUsd currency1 = new CurrencyInUsd("CAD", "USD", BigDecimal.valueOf(0.749541));
        CurrencyInEur currency2 = new CurrencyInEur("HUF", "EUR", BigDecimal.valueOf(0.00324589441));
        Amount amount = new Amount(BigDecimal.valueOf(100));

       Exchanger changer = new Exchanger();

        System.out.println(changer.exchanger(currency1, currency2, amount));
    }
}
