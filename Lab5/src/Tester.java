public class Tester {
    public static void main(String[] args) {

        Diamond diamondCost01= new Diamond(1.5,true,"D");
        double theBaseCost01=diamondCost01.baseCost();
        System.out.println("Expected 48000, Got: " + theBaseCost01);

        double theAdjustedCost01=diamondCost01.adjustedCost();
        System.out.println("Expected 96000. Got: "+ theAdjustedCost01);

        Diamond diamondCost02= new Diamond(1.5,false,"D");
        double theBaseCost02=diamondCost02.baseCost();
        System.out.println("Expected 48000, Got: " + theBaseCost02);

        double theAdjustedCost02=diamondCost02.adjustedCost();
        System.out.println("Expected 48000. Got: "+ theAdjustedCost02);


        Diamond diamondCost03= new Diamond(1.5,false,"K");
        double theBaseCost03=diamondCost03.baseCost();
        System.out.println("Expected 48000, Got: " + theBaseCost03);

        double theAdjustedCost03=diamondCost03.adjustedCost();
        System.out.println("Expected 38400. Got: "+ theAdjustedCost03);


        Diamond diamondCost04= new Diamond(1.5,false,"T");
        double theBaseCost04=diamondCost04.baseCost();
        System.out.println("Expected 48000, Got: " + theBaseCost04);

        double theAdjustedCost04=diamondCost04.adjustedCost();
        System.out.println("Expected 26400. Got: "+ theAdjustedCost04);
    }
}
