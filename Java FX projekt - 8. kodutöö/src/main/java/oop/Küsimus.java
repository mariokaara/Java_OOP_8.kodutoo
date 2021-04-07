package oop;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Küsimus extends Application {


    public void start(Stage peaLava) {

        BorderPane piir = new BorderPane();

        Label küsimus = new Label("Mitu pead on ühel õigel lohel?");
        küsimus.setFont(new Font(16));
        CheckBox variant1 = new CheckBox("Vähemalt kolm pead");
        CheckBox variant2 = new CheckBox("Vähemalt viis pead");
        CheckBox variant3 = new CheckBox("Vähemalt seitse pead");
        VBox vbox = new VBox(8, küsimus, variant1, variant2, variant3);
        Button nuppVasta = new Button("Vasta");



        nuppVasta.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                if (!variant1.isSelected()) {
                    FlowPane pane = new FlowPane(10, 10);
                    Stage vastus = new Stage();
                    Label silt = new Label("Vale vastus!");
                    Button okButton = new Button("OK");
                    okButton.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent event) {
                            vastus.hide();
                        }
                    });
                    pane.getChildren().addAll(silt, okButton);
                    pane.setAlignment(Pos.CENTER);
                    Scene stseen = new Scene(pane, 200, 100);
                    vastus.setScene(stseen);
                    vastus.show();
                }
                else if (variant1.isSelected() && variant2.isSelected() || variant3.isSelected()) {
                    FlowPane pane = new FlowPane(10, 10);
                    Stage vastus = new Stage();
                    Label silt = new Label("Osaliselt õige vastus!");
                    Button okButton = new Button("OK");
                    okButton.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent event) {
                            vastus.hide();
                        }

                });
                    pane.getChildren().addAll(silt, okButton);
                    pane.setAlignment(Pos.CENTER);
                    Scene stseen = new Scene(pane, 200, 100);
                    vastus.setScene(stseen);
                    vastus.show();
                }
                else {
                    FlowPane pane = new FlowPane(10, 10);
                    Stage vastus = new Stage();
                    Label silt = new Label("Õige vastus!");
                    Button okButton = new Button("OK");
                    okButton.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent event) {
                            vastus.hide();
                        }
                    });
                    pane.getChildren().addAll(silt, okButton);
                    pane.setAlignment(Pos.CENTER);
                    Scene stseen = new Scene(pane, 200, 100);
                    vastus.setScene(stseen);
                    vastus.show();
                }
            }


        });


        piir.setBottom(nuppVasta);
        BorderPane.setAlignment(nuppVasta, Pos.CENTER);
        BorderPane.setMargin(nuppVasta, new Insets(15,12,12,12));
        piir.setCenter(vbox);
        vbox.setAlignment(Pos.CENTER);
        Scene stseen = new Scene(piir, 300, 150, Color.SNOW);
        peaLava.setTitle("Küsimus");
        peaLava.setScene(stseen);
        peaLava.show();
    }
}
