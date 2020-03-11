package shapeshooser;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.*;
import javafx.scene.Scene;

public class Main extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception {


        AnchorPane root = FXMLLoader.load(getClass().getResource("tk.fxml"));
        primaryStage.setTitle("Shapechooser");
        primaryStage.setScene(new Scene(root,700,700));
        primaryStage.show();


    }


    public static void main(String[] args) {

        Application.launch(args);
    }

    public static void drawShapes(GraphicsContext gc, Shape shape){
        if (shape instanceof LineDirect){
            gc.beginPath();
            gc.moveTo(shape.getXbegin(),shape.getYbegin());
            gc.lineTo(shape.getWidth(),shape.getHeight());
            gc.stroke();
        }
        if (shape instanceof Circle){
            gc.fillOval(shape.getXbegin(),shape.getYbegin(),shape.getWidth(),shape.getWidth());
            return;
        }
        if (shape instanceof Square){
            gc.fillRect(shape.getXbegin(),shape.getYbegin(),shape.getWidth(),shape.getWidth());
        }
        if (shape instanceof Oval){

            gc.fillOval(shape.getXbegin(),shape.getYbegin(),shape.getWidth(),shape.getHeight());
            return;
        }
        if (shape instanceof  Rectangle_shaped){
            gc.fillRect(shape.getXbegin(),shape.getYbegin(),shape.getWidth(),shape.getHeight());
        }


        if (shape instanceof Triangle){
            gc.fillPolygon(new double[]{shape.getXbegin(),shape.getXbegin()-(shape.getWidth())/2,shape.getXbegin()+(shape.getWidth())/2},
                    new double[]{shape.getYbegin(),shape.getYbegin()+shape.getHeight(),shape.getYbegin()+shape.getHeight()},
                    3);
        }


    }


}
