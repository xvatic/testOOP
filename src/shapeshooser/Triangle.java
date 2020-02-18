package shapeshooser;

public class Triangle extends Shape {
    private static final String NAME="Triangle";


    private double base;
    private double height;
    private double  X;
    private double  Y;


    public Triangle(double base,double height, double NodeX, double NodeY){
        this.base=base;
        this.height=height;
        this.X = NodeX;
        this.Y = NodeY;
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
        return base;
    }

    @Override
    public double getHeight() {
        return height;
    }



}
