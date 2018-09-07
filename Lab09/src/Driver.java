import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        boolean running=true;

        Scanner theScanner=new Scanner(System.in);
        System.out.println("Enter the miles per gallon of your car: ");
        Double fuelEfficiency=theScanner.nextDouble();
        System.out.println("Enter the fuel capacity of your car: ");
        Double fuelCapacity=theScanner.nextDouble();


        Car userCar=new Car(fuelEfficiency, fuelCapacity);

        GasTank userGas=new GasTank(userCar);

        while(running){


            System.out.println("Do you want to 1. add gas, 2. drive, 3. find out miles driven, 4, find out gallons amount, or 5. quit? ");
            int userInput=theScanner.nextInt();

            if (userInput==5){
                running=false;
            }

            if(userInput==2){
                System.out.println("How many miles do you want to drive? ");
                double milesToDrive=theScanner.nextDouble();
                boolean userDriveResponse=userCar.takeTrip(milesToDrive);

                if(userDriveResponse==false){
                    System.out.println("You don't have enough gas to drive this amount! You can drive " + userCar.calcMilesToDrive() + " miles with your gas. ");
                }

               else if(userDriveResponse=true){
                    System.out.println("You just drove "+ milesToDrive + ". You now have " + userGas.getGallons() + "");
                }



            }

            if(userInput==1){
                System.out.println("How much gas do you want to add?");
                Double gasToAdd=theScanner.nextDouble();
                Boolean gasAddedRepsonse=userGas.addGas(gasToAdd);

                if (gasAddedRepsonse==false){
                    System.out.println("You can't add more gas than your tank can hold! You fuel capacity is "+ fuelCapacity + " gallons");

                }
                else if (gasAddedRepsonse==true){
                    System.out.println("You have added "+ gasToAdd + " gallons. You now have " + userGas.getGallons() + " gallons");

                }

            }

            if(userInput==3){
                double milesDriven=userCar.getMilesDriven();
                System.out.println("You have driven " + milesDriven + " miles");

            }

            if(userInput==4){
                double gallonsAmount=userGas.getGallons();
                System.out.println("You have " + gallonsAmount + " gallons");

            }


        }
    }

}
