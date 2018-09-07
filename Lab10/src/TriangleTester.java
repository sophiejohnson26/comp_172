public class TriangleTester {
    public static void main(String[] args) {
        Shape userTriangle=new Triangle("triangle", 5, 8, 10, 20, 25);

        userTriangle.calcArea();
        System.out.println("expected 94.99. Got: " + userTriangle.getShapeArea());

        userTriangle.calcPerimeter();
        System.out.println("Expected 55. Got " + userTriangle.getShapePerimeter());

        userTriangle.calcDistanceFromOrigin();
        System.out.println("Expected 9.43. Got: " + userTriangle.getDistanceFromOrigin() );
    }
}
