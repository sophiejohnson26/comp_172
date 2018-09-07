public class CarTester {
    public static void main(String[] args) {
        Car theCar01=new Car(25,50);
        System.out.println("Expected 0.0 for miles driven. Got: " +theCar01.getMilesDriven());


        GasTank theTank01=new GasTank(theCar01);

        boolean userDriveResponse=theCar01.takeTrip(100);

        if(userDriveResponse==false){
            System.out.println("Expected: You don't have enough gas to drive this amount. Got: You don't have enough gas to drive this amount! You can drive " + theCar01.calcMilesToDrive() + " miles with your gas. ");
        }

        else if(userDriveResponse=true){
            System.out.println("Expected: You just drove 100 miles. You now have " + theTank01.getGallons() + " Got: Expected: You just drove 100 miles. You now have " + theTank01.getGallons());
        }


        theTank01.addGas(20);

       boolean userDriveResponse02=theCar01.takeTrip(100);

        if(userDriveResponse02==false){
            System.out.println("Expected: You don't have enough gas to drive this amount.  Got: You don't have enough gas to drive this amount! You can drive " + theCar01.calcMilesToDrive() + " miles with your gas. ");
        }

        else if(userDriveResponse02=true){
            System.out.println("Expected: You just drove 100 miles. You now have " + theTank01.getGallons() + "Got: Expected: You just drove 100 miles. You now have " + theTank01.getGallons());
        }

    }
}
