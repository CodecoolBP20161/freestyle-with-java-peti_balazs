package view;


import controller.Exchanger;
import model.Amount;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {

    public void menu() {
        while(true) {
            try {
                Scanner reader = new Scanner(System.in);  // Reading from System.in

                System.out.println("How much money would you like to exchange? ");
                Amount amount = new Amount(reader.nextBigDecimal()); // Scans the next token of the input as a BigDecimal.

                System.out.println("Available currencies: AUD, BGN, BRL, CAD, CHF, CNY, CZK, DKK, GBP, HKD, HRK, HUF, IDR, ILS, " +
                        "INR, JPY, KRW, MXN, MYR, NOK, NZD, PHP, PLN, RON, RUB, SEK, SGD, THB, TRY, USD, ZAR");

                System.out.println("From which currency? ");
                String currency1 = reader.next().toUpperCase();

                System.out.println("To which currency? ");
                String currency2 = reader.next().toUpperCase();

                Exchanger changer = new Exchanger();

                System.out.println(changer.exchanger(currency2, currency1, amount));
                break;
            }
            catch (NullPointerException e) {
                // Catch block
//                System.out.println(e);
                System.out.println("invalid currency");
            }
            catch (InputMismatchException e) {
                // Catch block
//                System.out.println(e);
                System.out.println("invalid amount");
            }
        }
    }
}
