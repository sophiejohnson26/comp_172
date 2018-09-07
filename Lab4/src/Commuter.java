public class Commuter {
    private double maintenanceCost;
    private double gasCost;
    private double trainCost;
    private double fuelEfficiency;
    private double milesToWork;
    private double carCost;
    private String outcome;



    public Commuter(double maintenanceCost, double gasCost, double trainCost, double fuelEfficiency, double milesToWork, double carCost, String outcome){
        this.maintenanceCost=maintenanceCost;
        this.gasCost=gasCost;
        this.trainCost=trainCost;
        this.fuelEfficiency=fuelEfficiency;
        this.milesToWork=milesToWork;
        this.carCost=0;
        this.outcome="";
    }

    public void costForCar() { //This method calculates the cost to travel to work by car

        double gasAmount = milesToWork / fuelEfficiency;
        double gasExpense = gasCost * gasAmount;
        double mainCost = milesToWork * maintenanceCost;
        carCost = mainCost + gasExpense;


    }

    public double getCarCost(){
        return this.carCost; }


    public void takeCarOrTrain(){ //This method determines if it is less expensive to travel by car or train.
        if(carCost>trainCost){
            outcome="It is cheaper to travel by train.";
        }
        if(carCost<trainCost){
            outcome="It is cheaper to travel by car.";

        }

    }


    public String getOutcome(){
        return this.outcome;}

}
