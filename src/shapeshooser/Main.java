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

    public static void drawShapes(GraphicsContext gc){



        Rectangle_shaped rect = new Rectangle_shaped(40,25,30,0);
        Square square = new Square(30,100,50);
        Oval oval = new Oval(40,30,40,30);
        Circle circle = new Circle(40,200,30);
        Triangle triangle = new Triangle(40,30,300,10);
        LineDirect line = new LineDirect(400,200,100);



        ShapeArrayList<Shape> shapes = new ShapeArrayList<>();
        shapes.add(rect);
        shapes.add(square);
        shapes.add(oval);
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(line);
        System.out.println(shapes.get(0).getWidth());
        /*
        Отрисовка
         */
        gc.setLineWidth(5);
        gc.beginPath();
        gc.moveTo(shapes.get(5).getXbegin(),shapes.get(5).getYbegin());
        gc.lineTo(shapes.get(5).getXbegin()+shapes.get(5).getWidth(),shapes.get(5).getYbegin());
        gc.stroke();

        gc.fillPolygon(new double[]{shapes.get(4).getXbegin(),shapes.get(4).getXbegin()-(shapes.get(4).getWidth())/2,shapes.get(4).getXbegin()+(shapes.get(4).getWidth())/2},
                new double[]{shapes.get(4).getYbegin(),shapes.get(4).getYbegin()+shapes.get(4).getHeight(),shapes.get(4).getYbegin()+shapes.get(4).getHeight()},
                3);

     //   gc.fillPolygon(new double[]{list.get(),,});
        gc.fillRect(shapes.get(0).getXbegin(),shapes.get(0).getYbegin(),shapes.get(0).getWidth(),shapes.get(0).getHeight());

        gc.fillRect(shapes.get(1).getXbegin(),shapes.get(1).getYbegin(),shapes.get(1).getWidth(),shapes.get(1).getWidth());

        gc.fillOval(shapes.get(2).getXbegin(),shapes.get(2).getYbegin(),shapes.get(2).getWidth(),shapes.get(2).getHeight());

        gc.fillOval(shapes.get(3).getXbegin(),shapes.get(3).getYbegin(),shapes.get(3).getWidth(),shapes.get(3).getWidth());



    }


}
