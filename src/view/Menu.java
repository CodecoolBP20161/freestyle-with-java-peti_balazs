package view;


import controller.Exchanger;
import model.Amount;
import model.CurrencyInEur;
import model.CurrencyInUsd;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        System.out.println("How much money would you like to exchange? ");
        Amount amount = new Amount(reader.nextBigDecimal()); // Scans the next token of the input as a BigDecimal.

        System.out.println("From which currency? ");
        String currency1 = reader.next().toUpperCase();

        System.out.println("To which currency? ");
        String currency2 = reader.next().toUpperCase();

        Exchanger changer = new Exchanger();

        System.out.println(changer.exchanger(currency1, currency2, amount));
    }
}
