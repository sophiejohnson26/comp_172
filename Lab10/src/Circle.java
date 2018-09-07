public class Circle extends Shape {
    protected double radius;



    public Circle(String shape, double xPosCenter, double yPosCenter, double radius){
        super(shape, xPosCenter, yPosCenter);
       this.radius=radius;

    }

    /**
     * Calculates the area of a circle
     */

    public void calcArea(){
        area=radius*radius*Math.PI;

    }

    /**
     * Calculates the perimeter of a circle
     */
    public void calcPerimeter(){
        double diameter=radius+radius;
        perimeter=diameter*Math.PI;

    }

    /**
     *
     * @return the area of the circle
     */

    public double getShapeArea(){
        return this.area;
    }

    /**
     *
     * @return the perimeter of the circle
     */

    public double getShapePerimeter(){
        return this.perimeter;
    }


}
