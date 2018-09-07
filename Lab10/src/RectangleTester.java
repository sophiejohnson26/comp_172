public class RectangleTester {
    public static void main(String[] args) {
        Shape userShape=new Rectangle("rectangle", 15, 18, 5, 12);
        userShape.calcArea();
        System.out.println("Expected 60. Got: "+ userShape.getShapeArea());

        userShape.calcPerimeter();
        System.out.println("Expected 34. Got: " + userShape.getShapePerimeter());

        userShape.calcDistanceFromOrigin();
        System.out.println("Expected 23. Got: " + userShape.getDistanceFromOrigin());


    }
}
