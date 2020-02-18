package shapeshooser;

public class Rhombus extends Shape {
    private static final String NAME="Rhombus";

    private double side;
    private double  X;
    private double  Y;

    public Rhombus(double side,double x,double y){
        this.side = side;
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
        return side;
    }
}
