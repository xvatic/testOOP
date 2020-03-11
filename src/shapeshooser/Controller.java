package shapeshooser;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button drawRect;

    @FXML
    public ColorPicker colorpicker;

    @FXML
    public RadioButton rbCircle;

    @FXML
    public RadioButton rbOval;

    @FXML
    public RadioButton rbRectangle;

    @FXML
    public RadioButton rbSquare;

    @FXML
    public RadioButton rbTriangle;

    @FXML
    public RadioButton rbLine;

    @FXML
    public ToggleGroup tgShapes;


    @FXML
    public Canvas canvas;

    public void draw(){
        Double[] coordArray = new Double[4];
        GraphicsContext gc = canvas.getGraphicsContext2D();
        canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
             coordArray[0] = mouseEvent.getSceneX();
             coordArray[1] = mouseEvent.getSceneY()-235;

            }
        });
        canvas.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
            coordArray[2] = mouseEvent.getSceneX();
            coordArray[3] = mouseEvent.getSceneY() - 235;

            gc.setFill(colorpicker.getValue()) ;
            gc.setStroke(colorpicker.getValue());
            gc.setLineWidth(5);
            ShapeArrayList<Shape> shapes = new ShapeArrayList<>();

            if(rbLine.isSelected() == true){
                LineDirect  line = new LineDirect(coordArray[2],coordArray[3],coordArray[0],coordArray[1]);
                Main.drawShapes(gc,line);
            }

            if(rbCircle.isSelected() == true){
                    Circle circle = new Circle(coordArray[2]-coordArray[0],coordArray[0],coordArray[1]);
                    Main.drawShapes(gc,circle);
            }
            if(rbSquare.isSelected() == true){
                    Square square = new Square(coordArray[2]-coordArray[0],coordArray[0],coordArray[1]);
                    Main.drawShapes(gc,square);
            }
            if(rbRectangle.isSelected() == true){
                    Rectangle_shaped rect = new Rectangle_shaped(coordArray[2]-coordArray[0],coordArray[3]-coordArray[1],coordArray[0],coordArray[1]);
                    Main.drawShapes(gc,rect);
            }
            if(rbOval.isSelected() == true){
                    Oval oval = new Oval(coordArray[2]-coordArray[0],coordArray[3]-coordArray[1],coordArray[0],coordArray[1]);
                    Main.drawShapes(gc,oval);

                }
            if(rbTriangle.isSelected() == true){
                    Triangle triangle = new Triangle(coordArray[2]-coordArray[0],coordArray[3]-coordArray[1],coordArray[0],coordArray[1]);
                    Main.drawShapes(gc,triangle);
            }

            /*
            gc.fillPolygon(new double[]{shapes.get(4).getXbegin(),shapes.get(4).getXbegin()-(shapes.get(4).getWidth())/2,shapes.get(4).getXbegin()+(shapes.get(4).getWidth())/2},
                        new double[]{shapes.get(4).getYbegin(),shapes.get(4).getYbegin()+shapes.get(4).getHeight(),shapes.get(4).getYbegin()+shapes.get(4).getHeight()},
                        3);


            gc.fillRect(shapes.get(0).getXbegin(),shapes.get(0).getYbegin(),shapes.get(0).getWidth(),shapes.get(0).getHeight());
            gc.fillRect(shapes.get(1).getXbegin(),shapes.get(1).getYbegin(),shapes.get(1).getWidth(),shapes.get(1).getWidth());
            gc.fillOval(shapes.get(2).getXbegin(),shapes.get(2).getYbegin(),shapes.get(2).getWidth(),shapes.get(2).getHeight());

            gc.fillOval(shapes.get(3).getXbegin(),shapes.get(3).getYbegin(),shapes.get(3).getWidth(),shapes.get(3).getWidth());

            */
            }
        });



    }




    @FXML
    void initialize() {





    }
}


