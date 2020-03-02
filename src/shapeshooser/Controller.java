package shapeshooser;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button drawRect;

    @FXML
    private Button drawSquare;

    @FXML
    private Button drawRhombus;

    @FXML
    private Button drawCircle;

    @FXML
    private Button drawOval;

    @FXML
    public ColorPicker colorpicker;


    @FXML
    public Canvas canvas;

    public void draw(){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(colorpicker.getValue()) ;
        gc.setStroke(colorpicker.getValue());
        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println(mouseEvent.getSceneX());
                System.out.println(mouseEvent.getSceneY());
            }
        });
        Main.drawShapes(gc);
    }



    @FXML
    void initialize() {





    }
}


