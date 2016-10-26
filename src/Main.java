import view.Menu;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Menu menu = new Menu();
                menu.menu();
                }
            catch (NullPointerException e) {
                // Catch block
//                System.out.println(e);
                System.out.println("invalid currency");
                Menu menu = new Menu();
                menu.menu();
            }
            catch (InputMismatchException e) {
                // Catch block
//                System.out.println(e);
                System.out.println("invalid amount");
                Menu menu = new Menu();
                menu.menu();
            }
            break;
        }
    }
}
