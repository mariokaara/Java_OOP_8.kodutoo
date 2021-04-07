package oop;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ring extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {

        BorderPane juur = new BorderPane();

        Circle ring1 = new Circle(50, 50, 50, Color.GREEN);

        // Katsetada lambda-avaldist vähemalt kahel erineval juhul - erinevad hiiresündmused, erinevad tegevused (nt.
        // värvide muutmine vms.).
        ring1.setOnMousePressed(event -> ring1.setFill(Color.YELLOW));
        ring1.setOnMouseReleased(event -> ring1.setFill(Color.GREEN));


        juur.setTop(ring1);
        Scene stseen = new Scene(juur, 500, 500, Color.GREY);
        peaLava.setScene(stseen);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
