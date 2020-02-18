package shapeshooser;

public class Rectangle_shaped extends Shape{
    private static final String NAME = "Rectangle";

    private double width;
    private double height;
    private double X;
    private double Y;




    @Override
    public double getXbegin() { return X;};

    @Override
    public double getYbegin() { return Y; };

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
        return height;
    }

    public Rectangle_shaped(double width, double height,double x,double y ){
        this.width = width;
        this.height = height;
        this.X = x;
        this.Y = y;


    }



    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
