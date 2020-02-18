package shapeshooser;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;

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
        Main.drawShapes(gc);
    }



    @FXML
    void initialize() {





    }
}


