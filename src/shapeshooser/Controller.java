package shapeshooser;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
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

            rbCircle.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    Circle circle = new Circle(coordArray[2]-coordArray[0],coordArray[0],coordArray[1]);
                    Main.drawShapes(gc,circle);
                }
            });
            rbLine.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        LineDirect  line = new LineDirect(coordArray[2],coordArray[3],coordArray[0],coordArray[1]);
                        Main.drawShapes(gc,line);
                    }
                });
            rbSquare.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        Square square = new Square(coordArray[2]-coordArray[0],coordArray[0],coordArray[1]);
                        Main.drawShapes(gc,square);
                    }
                });
            rbRectangle.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        Rectangle_shaped rect = new Rectangle_shaped(coordArray[2]-coordArray[0],coordArray[3]-coordArray[1],coordArray[0],coordArray[1]);
                        Main.drawShapes(gc,rect);
                    }
                });
            rbOval.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        Oval oval = new Oval(coordArray[2]-coordArray[0],coordArray[3]-coordArray[1],coordArray[0],coordArray[1]);
                        Main.drawShapes(gc,oval);
                    }
                });
            rbTriangle.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        Triangle triangle = new Triangle(coordArray[2]-coordArray[0],coordArray[3]-coordArray[1],coordArray[0],coordArray[1]);
                        Main.drawShapes(gc,triangle);
                    }
                });


            }
        });



    }




    @FXML
    void initialize() {

        draw();
    }
}


