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
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


//Kirjutada programm, mis loob akna ja lisab aknasse mingile kohale nupu. Sündmuste abil korraldada, et hiirega nupule
// liikudes "hüppab" nupp eest ära juhuslikule kohale aknas. Tagada, et nupp ei hüppaks aknast välja (ka peale
// akna suuruste muutmist).

public class Nupp extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {

        StackPane juur = new StackPane();

        Button nupp = new Button("Nupp");

        nupp.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int randint = (int)(Math.random()*300)+1;
                System.out.println(randint);
                double x = nupp.getLayoutX();
                double y = nupp.getLayoutY();
                nupp.setTranslateX(x-randint);
                nupp.setTranslateY(y-randint);
            }
        });


        juur.getChildren().add(nupp);
        Scene stseen = new Scene(juur, 500, 500, Color.GREY);
        peaLava.setScene(stseen);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

