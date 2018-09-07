import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);


        System.out.println("Do you want a gallon jar, half gallon jar, quart jar, or pint jar?");
        String jarSize = theScanner.nextLine();

        while (!jarSize.equalsIgnoreCase("gallon") && !jarSize.equalsIgnoreCase("half gallon") && !jarSize.equalsIgnoreCase("quart") && !jarSize.equalsIgnoreCase("pint")) {
            System.out.println("Do you want a gallon jar, half gallon jar, quart jar, or pint jar?");
            jarSize = theScanner.nextLine();
        }

        if (jarSize.equalsIgnoreCase("gallon")) {
            GallonJar userobject01 = new GallonJar();

            boolean running=true;

            while(running) {

                System.out.println("Do you want to add, remove, check balance, get penny amount in dollars quit?");
                String action = theScanner.nextLine();


                while (!action.equalsIgnoreCase("add") && !action.equalsIgnoreCase("remove") && !action.equalsIgnoreCase("check balance") && !action.equalsIgnoreCase("dollars") && ! action.equalsIgnoreCase("quit")) {
                    System.out.println("Do you want to add, remove, check balance, or get penny amount in dollars?");
                    action = theScanner.nextLine();
                }

                if (action.equalsIgnoreCase("add")) {
                    System.out.println("How many pennies do you want to add?");
                    int addAmount = theScanner.nextInt();
                    theScanner.nextLine();

                    while (addAmount <= 0) {
                        System.out.println("You can't add less than one penny. How many pennies do you want to add?");
                        addAmount = theScanner.nextInt();
                        theScanner.nextLine();

                    }
                    userobject01.addPenny(addAmount);

                }

                if (action.equalsIgnoreCase("remove")) {
                    System.out.println("How many pennies do you want to add?");
                    int removeAmount = theScanner.nextInt();
                    theScanner.nextLine();

                    while (removeAmount <= 0) {
                        System.out.println("You can't remove less than one penny. How many pennies do you want to remove?");
                        removeAmount = theScanner.nextInt();
                        theScanner.nextLine();

                    }

                    userobject01.removePenny(removeAmount);
                }

                if (action.equalsIgnoreCase("check balance")) {
                    double userBalance = userobject01.getPennyBalance();
                    System.out.println(userBalance);
                }

                if (action.equalsIgnoreCase("dollars")) {

                    double userBalance = userobject01.pennyDollars();
                    System.out.println(userBalance);

                }

                if(action.equalsIgnoreCase("quit")){
                    running=false;
                }
            }


        }


        if (jarSize.equalsIgnoreCase("half gallon")) {
            HalfGallonJar userobject02 = new HalfGallonJar();

           boolean running=true;
           while(running) {


               System.out.println("Do you want to add, remove, check balance, get penny amount in dollars, or quit?");
               String action02 = theScanner.nextLine();


               while (!action02.equalsIgnoreCase("add") && !action02.equalsIgnoreCase("remove") && !action02.equalsIgnoreCase("check balance") && !action02.equalsIgnoreCase("dollars") && !action02.equalsIgnoreCase("quit")) {
                   System.out.println("Do you want to add, remove, check balance, or get penny amount in dollars?");
                   action02 = theScanner.nextLine();
               }

               if (action02.equalsIgnoreCase("add")) {
                   System.out.println("How many pennies do you want to add?");
                   int addAmount = theScanner.nextInt();
                   theScanner.nextLine();

                   while (addAmount <= 0) {
                       System.out.println("You can't add less than one penny. How many pennies do you want to add?");
                       addAmount = theScanner.nextInt();
                       theScanner.nextLine();

                   }
                   userobject02.addPenny(addAmount);

               }

               if (action02.equalsIgnoreCase("remove")) {
                   System.out.println("How many pennies do you want to add?");
                   int removeAmount = theScanner.nextInt();
                   theScanner.nextLine();

                   while (removeAmount <= 0) {
                       System.out.println("You can't remove less than one penny. How many pennies do you want to remove?");
                       removeAmount = theScanner.nextInt();
                       theScanner.nextLine();

                   }
                   userobject02.removePenny(removeAmount);
               }

               if (action02.equalsIgnoreCase("check balance")) {
                   double userBalance = userobject02.getPennyBalance();
                   System.out.println(userBalance);
               }

               if (action02.equalsIgnoreCase("dollars")) {

                   double userBalance = userobject02.pennyDollars();
                   System.out.println(userBalance);

               }

               if(action02.equalsIgnoreCase("quit")){
                   running=false;
               }
           }


        }


        if (jarSize.equalsIgnoreCase("quart")) {
            QuartJar userobject03 = new QuartJar();
            boolean running=true;

            while(running) {

                System.out.println("Do you want to add, remove, check balance, get penny amount in dollars or quit?");
                String action03 = theScanner.nextLine();


                while (!action03.equalsIgnoreCase("add") && !action03.equalsIgnoreCase("remove") && !action03.equalsIgnoreCase("check balance") && !action03.equalsIgnoreCase("dollars") && action03.equalsIgnoreCase("quit")) {
                    System.out.println("Do you want to add, remove, check balance, or get penny amount in dollars?");
                    action03 = theScanner.nextLine();
                }

                if (action03.equalsIgnoreCase("add")) {
                    System.out.println("How many pennies do you want to add?");
                    int addAmount = theScanner.nextInt();
                    theScanner.nextLine();

                    while (addAmount <= 0) {
                        System.out.println("You can't add less than one penny. How many pennies do you want to add?");
                        addAmount = theScanner.nextInt();
                        theScanner.nextLine();

                    }
                    userobject03.addPenny(addAmount);

                }

                if (action03.equalsIgnoreCase("remove")) {
                    System.out.println("How many pennies do you want to add?");
                    int removeAmount = theScanner.nextInt();
                    theScanner.nextLine();

                    while (removeAmount <= 0) {
                        System.out.println("You can't remove less than one penny. How many pennies do you want to remove?");
                        removeAmount = theScanner.nextInt();
                        theScanner.nextLine();

                    }
                    userobject03.removePenny(removeAmount);
                }

                if (action03.equalsIgnoreCase("check balance")) {
                    double userBalance = userobject03.getPennyBalance();
                    System.out.println(userBalance);
                }

                if (action03.equalsIgnoreCase("dollars")) {

                    double userBalance = userobject03.pennyDollars();
                    System.out.println(userBalance);

                }
                if (action03.equalsIgnoreCase("quit")) {
                    running = false;
                }
            }


        }

        if (jarSize.equalsIgnoreCase("pint")) {
            PintJar userobject04 = new PintJar();

            boolean running = true;
            while(running){

            System.out.println("Do you want to add, remove, check balance, get penny amount in dollars or quit?");
            String action04 = theScanner.nextLine();


            while (!action04.equalsIgnoreCase("add") && !action04.equalsIgnoreCase("remove") && !action04.equalsIgnoreCase("check balance") && !action04.equalsIgnoreCase("dollars") && !action04.equalsIgnoreCase("quit")) {
                System.out.println("Do you want to add, remove, check balance, or get penny amount in dollars?");
                action04 = theScanner.nextLine();
            }

            if (action04.equalsIgnoreCase("add")) {
                System.out.println("How many pennies do you want to add?");
                int addAmount = theScanner.nextInt();
                theScanner.nextLine();

                while (addAmount <= 0) {
                    System.out.println("You can't add less than one penny. How many pennies do you want to add?");
                    addAmount = theScanner.nextInt();
                    theScanner.nextLine();

                }
                userobject04.addPenny(addAmount);

            }

            if (action04.equalsIgnoreCase("remove")) {
                System.out.println("How many pennies do you want to add?");
                int removeAmount = theScanner.nextInt();
                theScanner.nextLine();

                while (removeAmount <= 0) {
                    System.out.println("You can't remove less than one penny. How many pennies do you want to remove?");
                    removeAmount = theScanner.nextInt();
                    theScanner.nextLine();

                }
                userobject04.removePenny(removeAmount);
            }
            if (action04.equalsIgnoreCase("check balance")) {
                double userBalance = userobject04.getPennyBalance();
                System.out.println(userBalance);
            }

            if (action04.equalsIgnoreCase("dollars")) {

                double userBalance = userobject04.pennyDollars();
                System.out.println(userBalance);

            }

            if (action04.equalsIgnoreCase("quit")) {
                running = false;
            }
        }


        }
    }
}


