public class picMain {
    public static void main(String[] args) {
        //This code implements four image filters on a picture.
        Picture pic= new Picture("img/linux.jpg");
       // pic.show();
        Picture gray=ImageLib.grayScale(pic);
        gray.show();

        Picture invert=ImageLib.invert(pic);
        invert.show();

       Picture smooth=ImageLib.smooth(pic);
       smooth.show();

        Picture linear=ImageLib.linearEnhance(pic);
       linear.show();


    }
}
