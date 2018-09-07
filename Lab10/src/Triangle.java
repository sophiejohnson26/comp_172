public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;


    public Triangle(String shape, double xPosCenter, double yPosCenter, double side1, double side2, double side3){
        super(shape, xPosCenter, yPosCenter);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;

    }

    /**
     * Calculates the area of a triangle
     */

    public void calcArea(){
        double p=(side1+side2+side3)/2;
      area=p*(p-side1)*(p-side2)*(p-side3);
      area=Math.sqrt(area);


    }

    /**
     * Calculates the perimeter of a triangle
     */

    public void calcPerimeter(){
        perimeter=side1+side2+side3;
    }

    /**
     *
     * @return the triangle area
     */

    public double getShapeArea(){
        return this.area;
    }

    /**
     *
     * @return the triangle perimeter
     */

    public double getShapePerimeter(){
        return this.perimeter;
    }
}
