public class GasTank {
    Car theCar;

    public GasTank(Car theCar){
        this.theCar=theCar;
    }

    /**
     *
     * @param gasToAdd: how much gas to add to the car
     * @return: true if the user doesn't try to add more than their fuel capacity, and false if they do
     */
    public boolean addGas(double gasToAdd){
        if(gasToAdd+theCar.gallons>theCar.fuelCapacity){
            return false;
        }
        else{
            theCar.gallons=theCar.gallons+gasToAdd;
            return true;
        }
    }

    /**
     *
     * @return the amount of gallons
     */

    public double getGallons(){
        return theCar.gallons;
    }

}
