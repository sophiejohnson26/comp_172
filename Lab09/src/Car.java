public class Car {
    double milesDriven;
    double gallons;
    double milesPerGallon;
    double fuelCapacity;

    public Car(double milesPerGallon, double fuelCapacity){
        this.milesPerGallon=milesPerGallon;
        this.fuelCapacity=fuelCapacity;
        this.milesDriven=0.0;
        this.gallons=0.0;
    }

    /**
     *
     * @param milesToDrive:  the amount of miles the user wants to drive
     * @return false if the user can't drive te amount of miles they want to and true if they are able to drive this amount
     */
    public boolean takeTrip(double milesToDrive){
        if(gallons*milesPerGallon>=milesToDrive){
            milesDriven=milesDriven+milesToDrive;
            double gasUsed=milesToDrive/milesPerGallon;
            gallons=gallons-gasUsed;
            return true;
        }
        else{
            return false;
        }
    }

    /**
     *
     * @return the amount of miles the user is able to drive with the gas they have
     */
    public double calcMilesToDrive(){
        double milesAbleToDrive=gallons*milesPerGallon;
        return milesAbleToDrive;
    }

    /**
     *
     * @return the amount of miles driven
     */

    public double getMilesDriven(){
        return this.milesDriven;
    }
}
