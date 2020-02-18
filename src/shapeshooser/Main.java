package shapeshooser;

import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.*;
import javafx.scene.Scene;
import java.util.ArrayList;

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

    public static void drawShapes(GraphicsContext gc){



        Rectangle_shaped rect = new Rectangle_shaped(40,25,30,0);
        Square square = new Square(30,100,50);
        Oval oval = new Oval(40,30,40,30);
        Circle circle = new Circle(40,200,30);
        Triangle triangle = new Triangle(40,30,300,10);
        Rhombus rhombus = new Rhombus(50,200,100);
        ArrayList<Shape> list =new ArrayList<Shape>();
        list.add(rect);
        list.add(square);
        list.add(oval);
        list.add(circle);
        list.add(triangle);
        list.add(rhombus);

        /*
        Отрисовка
         */
        gc.setLineWidth(5);
        gc.fillPolygon(new double[]{list.get(4).getXbegin(),list.get(4).getXbegin()-(list.get(4).getWidth())/2,list.get(4).getXbegin()+(list.get(4).getWidth())/2},
                new double[]{list.get(4).getYbegin(),list.get(4).getYbegin()+list.get(4).getHeight(),list.get(4).getYbegin()+list.get(4).getHeight()},
                3);

     //   gc.fillPolygon(new double[]{list.get(),,});

        gc.fillRect(list.get(0).getXbegin(),list.get(0).getYbegin(),list.get(0).getWidth(),list.get(0).getHeight());

        gc.fillRect(list.get(1).getXbegin(),list.get(1).getYbegin(),list.get(1).getWidth(),list.get(1).getWidth());

        gc.fillOval(list.get(2).getXbegin(),list.get(2).getYbegin(),list.get(2).getWidth(),list.get(2).getHeight());

        gc.fillOval(list.get(3).getXbegin(),list.get(3).getYbegin(),list.get(3).getWidth(),list.get(3).getWidth());


    }


}
