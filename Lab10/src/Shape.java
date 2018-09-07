public abstract class Shape {
    protected String shape;
    protected double xPosCenter;
    protected double yPosCenter;
    protected double distanceFromOrigin;
    protected double area;
    protected double perimeter;

    public Shape(String shape, double xPosCenter, double yPosCenter){
        this.shape=shape;
        this.xPosCenter=xPosCenter;
        this.yPosCenter=yPosCenter;
        this.distanceFromOrigin=0.0;
        this.area=0.0;
        this.perimeter=0.0;
    }

    /**
     * Calculates the area of different shapes
     */

    public abstract void calcArea();

    /**
     * Calculates the perimeter of different shapes
     */

    public abstract void calcPerimeter();

    /**
     * Calculates the distance from the center of the shape to the origin 0,0
     */

    public void calcDistanceFromOrigin(){
       double xPosCenterSquared= xPosCenter*xPosCenter;
       double yPosCenterSquared=yPosCenter*yPosCenter;
       distanceFromOrigin=yPosCenterSquared+xPosCenterSquared;
      distanceFromOrigin= Math.sqrt(distanceFromOrigin);

    }

    /**
     *
     * @return the distance from the origin
     */
    public double getDistanceFromOrigin(){
        return this.distanceFromOrigin;
    }

    /**
     *
     * @return the shape area
     */

    public abstract double getShapeArea();

    /**
     *
     * @return the shape perimeter
     */

    public abstract double getShapePerimeter();
}
