package shapeshooser;

public class Square extends Shape {

    private static final String NAME = "Circle";
    private double width;
    private double  X;
    private double  Y;

    public Square(double width,double x,double y ){
        this.width = width;
        this.X = x;
        this.Y = y;


    }
    @Override
    public double getXbegin() {
        return X;
    }

    @Override
    public double getYbegin() {
        return Y;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return width;
    }
}
