package shapeshooser;

public class LineDirect extends Shape {
    private static final String NAME="Line";

    private double side;
    private double  X;
    private double  Y;
    private double  height;


    public LineDirect(double side, double heigth, double x, double y){
        this.side = side;
        this.height = heigth;
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
        return side;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
