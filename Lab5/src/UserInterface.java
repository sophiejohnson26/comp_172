import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        System.out.println("How many carats is the diamond? ");
        Scanner theScanner = new Scanner(System.in);
        double userCarats = theScanner.nextDouble();
        while (userCarats < 1) {
            System.out.println("How many carats is the diamond? ");
            userCarats = theScanner.nextDouble();

        }

        theScanner.nextLine();



        System.out.println("What is the color of the diamond? ");
        String userColor = theScanner.nextLine();

        while (!userColor.equalsIgnoreCase("K") && !userColor.equalsIgnoreCase("D") && !userColor.equalsIgnoreCase("T")) {
            System.out.println("What is the color of the diamond? ");
            userColor = theScanner.nextLine();

        }

        System.out.println("Is the diamond flawless?");
        String userFlawless1 = theScanner.nextLine();

        while (!userFlawless1.equalsIgnoreCase("yes") && !userFlawless1.equalsIgnoreCase("no")) {
            System.out.println("Is the diamond flawless?");
            userFlawless1 = theScanner.nextLine();
        }

        if (userFlawless1.equalsIgnoreCase("yes")) {
            userFlawless1 = "true";
            boolean userFlawless = Boolean.parseBoolean(userFlawless1);

        } else if (userFlawless1.equalsIgnoreCase("no")) {
            userFlawless1 = "false";
            boolean userFlawless = Boolean.parseBoolean(userFlawless1);


        }
    }
}
