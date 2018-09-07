import java.awt.*;
//This class contains different image filters.

public class ImageLib {
    public static final int MAX_VALUE=255;


    /**
     *
     * @param orig the image that will be converted to grayscale
     * @return gray: new grayscale image
     */
    public static Picture grayScale(Picture orig){
        Picture gray= new Picture(orig.width(), orig.height());
        Color pixel;
        int lum;

        for(int x=0; x<orig.width(); x++){
            for (int y=0; y<orig.height(); y++){
                pixel = orig.get(x,y);
                lum=(int)( .299 * pixel.getRed()+ .587 * pixel.getGreen()+ .114 * pixel.getBlue());

                pixel=new Color(lum, lum, lum);
                gray.set(x, y, pixel);
            }
        }
        return gray;
    }

    /**
     *
     * @param orig: original image that the max value is being calculated for
     * @return pixelMin, int value that is the lowest RGB value in image
     */
    public static int calcMin(Picture orig){
        Color pixel;
        int pixelMin=MAX_VALUE;

        for(int x=0; x<orig.width();x++){
            for(int y=0; y<orig.height(); y++){
                pixel=orig.get(x,y);
                int greenMin= pixel.getGreen();
                if (greenMin<pixelMin){
                    pixelMin=greenMin;
                }


            }
        }
        return pixelMin;
    }

    /**
     *
     * @param orig image that the maximum RBG value is being found
     * @return int that will be the image's maximum RGB value
     */

    public static int calcMax(Picture orig){
        Color pixel;
        int pixelMax=0;

        for(int x=0; x<orig.width();x++){
            for(int y=0; y<orig.height(); y++){
                pixel=orig.get(x,y);
                int greenMax= pixel.getGreen();
                if (greenMax>pixelMax){
                    pixelMax=greenMax;
                }

                }


        }
        return pixelMax;
    }

    /**
     *
     * @param orig image that will be inverted
     * @return grayInvert newly inverted image
     */

   public static Picture invert (Picture orig){
        Picture grayInvert;
        Color pixel;
        grayInvert=grayScale(orig);

        for(int x= 0; x<grayInvert.width(); x++){
            for(int y=0; y<grayInvert.height(); y++){
                pixel=grayInvert.get(x,y);
                int newColor=MAX_VALUE-pixel.getRed();
                pixel=new Color(newColor, newColor, newColor);
                grayInvert.set(x,y,pixel);
            }
        }
        return grayInvert;


   }

    /**
     *
     * @param orig image that smooth filter will be applied to
     * @return new image with smooth filter on it
     */

    public static Picture smooth(Picture orig) {
        Picture graySmooth;
        Color pixel;

        graySmooth = grayScale(orig);
        for (int x = 1; x < graySmooth.width()-1; x++) {
            for (int y = 1; y < graySmooth.height()-1; y++) {
                int totalValue=0;


                for( int xInner=x-1; xInner<=x+1; xInner++ ){
                    for(int yInner=y-1; yInner<=y+1;yInner++){
                        Color pixel02= graySmooth.get(xInner, yInner);
                        int colorValue=pixel02.getRed();
                        totalValue=totalValue+colorValue;

                    }
                }
                double theAverage= totalValue/9.0;

                pixel=new Color((int) theAverage, (int) theAverage, (int) theAverage);
               graySmooth.set(x, y, pixel);

            }
        }
        return graySmooth;
    }

    /**
     *
     * @param orig original image that filter will be applied to
     * @return grayLinear: image with the linearEnhance filter on it
     */

    public static Picture linearEnhance(Picture orig){ //ask why this one isn't working
        Picture grayLinear;
        Color pixel;
        grayLinear=grayScale(orig);
        int imageMin=calcMin(grayLinear);
        int imageMax=calcMax(grayLinear);
        double scale=MAX_VALUE/(double)(imageMax-imageMin);


        for(int x=0; x<grayLinear.width(); x++){
            for(int y=0; y<grayLinear.height(); y++){
                pixel=grayLinear.get(x,y);
                double redValue= (pixel.getRed()-imageMin)*scale;

                Color linearColor= new Color((int)(redValue), (int)(redValue), (int)(redValue));
                grayLinear.set(x,y, linearColor);

            }
        }
        return grayLinear;
    }

}
