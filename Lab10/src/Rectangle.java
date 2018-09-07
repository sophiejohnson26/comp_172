public class Rectangle extends Shape{
    protected double width;
    protected double height;


    public Rectangle(String shape, double xPosCenter, double yPosCenter, double width, double height){
        super(shape, xPosCenter, yPosCenter);
        this.width=width;
        this.height=height;

    }

    /**
     * Calculates the area of a rectangle
     */

    public void calcArea(){
       area=width*height;

    }

    /**
     * Calculates the perimeter of a rectangle
     */

    public void calcPerimeter(){
         perimeter=width+width+height+height;

    }

    /**
     *
     * @return the rectangle area
     */

    public double getShapeArea(){
        return this.area;
    }

    /**
     *
     * @return the rectangle perimeter
     */

    public double getShapePerimeter(){
        return this.perimeter;
    }
}
