public class Diamond {
    double carats;
    boolean flawless;
    String color;
    double adjustedCost;
    double baseCost;

    public Diamond(double carats, boolean flawless, String color){
        this.carats= carats;
        this.flawless=flawless;
        this.color=color;
        this.adjustedCost=0.0;
        this.baseCost=0.0;
    }

    /**
     *
     * @return the base cost of a diamond
     */

    public double baseCost(){
        baseCost=carats*4*8000;
        return baseCost;
    }

    /**
     *
     * @return the cost of a diamond after adjustments have been applied.
     */

    public double adjustedCost(){
        baseCost();
        double clarityCost;
        if(flawless){
            clarityCost=baseCost*2;
        }
        else {
            clarityCost=baseCost;
        }

        if (color.equalsIgnoreCase("K")){
            double adjustment=clarityCost*.2;
            adjustedCost=clarityCost-adjustment;
        }

        else if (color.equalsIgnoreCase("T")){
            double adjustment=clarityCost*.45;
            adjustedCost=clarityCost-adjustment;
        }
        else {
            adjustedCost=clarityCost;
        }
        return adjustedCost;

        }
       public double getBaseCost(){
        return this.baseCost;
       }

       public double getAdjustedCost(){
        return this.adjustedCost;
       }

    }




