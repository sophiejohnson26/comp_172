public class CircleTester {
    public static void main(String[] args) {
        Shape userCircle=new Circle("circle", 10, 15, 5);

        userCircle.calcArea();
        System.out.println("Expected 78.5. Got: " + userCircle.getShapeArea());

        userCircle.calcPerimeter();
        System.out.println("Expected 31.4. Got: " + userCircle.getShapePerimeter());

        userCircle.calcDistanceFromOrigin();
        System.out.println("Expected 18.03. Got: " + userCircle.getDistanceFromOrigin());
    }
}
