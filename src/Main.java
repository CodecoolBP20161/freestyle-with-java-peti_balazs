import view.Menu;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        while (true) {

            try {
                menu.menu();
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
