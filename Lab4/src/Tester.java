public class Tester {
    public static void main(String[] args) {

        Commuter traveller01=new Commuter(1,3,15,30,10, 0,"");

       traveller01.costForCar();
       traveller01.takeCarOrTrain();
       String carOrTrain= traveller01.getOutcome(); //this should get cheaper to travel by car

        System.out.println("Expected: Cheaper to travel by car. Got: " + carOrTrain);

        Commuter traveller02=new Commuter(.7,4,10,22,20,0,"");

        traveller02.costForCar();
        traveller02.takeCarOrTrain();

        String carOrTrain2=traveller02.getOutcome(); //this should get cheaper to travel by train

        System.out.println("Expected: Cheaper to travel by train. Got: " + carOrTrain2);


    }
}
