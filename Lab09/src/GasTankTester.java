public class GasTankTester {
    public static void main(String[] args) {
        Car theCar02=new Car(25,50);
        GasTank theTank02=new GasTank(theCar02);

        boolean gasAddedRepsonse=theTank02.addGas(100);

        if (gasAddedRepsonse==false){
            System.out.println("Expected: You can't add more gas than your tank can hold! You fuel capacity is 50. Got: You can't add more gas than your tank can hold! You fuel capacity is 50.");

        }
        else if (gasAddedRepsonse==true){
            System.out.println("Expected: You have added 100 gallons. You now have " + theTank02.getGallons() + " gallons. Got: You have added 100 gallons. You now have" + theTank02.getGallons() + " gallons ");

        }


        boolean gasAddedRepsonse02=theTank02.addGas(20);

        if (gasAddedRepsonse02==false){
            System.out.println("Expected: You can't add more gas than your tank can hold! You fuel capacity is 50. Got: You can't add more gas than your tank can hold! You fuel capacity is 50.");

        }
        else if (gasAddedRepsonse02==true){
            System.out.println("Expected: You have added 20 gallons. You now have " + theTank02.getGallons() + " gallons. Got You have added 20 gallons. You now have" + theTank02.getGallons() + " gallons ");

        }

        theCar02.takeTrip(100); //drives 100 miles, checks to see if gas goes down!

        double gasAmount=theTank02.getGallons();

        System.out.println("Expected: You have 16 gallons of gas. Got: " + gasAmount);








    }




}
