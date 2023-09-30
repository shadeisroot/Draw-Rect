package com.example.drawrect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DrawRect extends Application {
    private Button hejKnap;
    final static Canvas canvas = new Canvas(550,550);
    private static int step = 10;
    @Override
    public void start(Stage stage) throws IOException {
        hejKnap = new Button();
        hejKnap.setText("Draw Rectangle");
        hejKnap.setOnAction(evt -> Draw());


        Group root = new Group();
        Scene s = new Scene(root, 350, 350);

        GraphicsContext gc = canvas.getGraphicsContext2D();


      //  for (int i = 0; i < 10; i++) {
        //    gc.strokeRect(10 + i * step,10 + i * step,90 + i * step, 90 + i * step);
       // }

        root.getChildren().addAll(canvas, hejKnap);
        // Sæt scene og vindue (stage)

        stage.setTitle("Hello!");
        stage.setScene(s);
        stage.show();
    }
    public static void Draw(){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());
        for (int i = 0; i < 10; i++) {
            gc.strokeRect(10 + i * step,10 + i * step,90 + i * step, 90 + i * step);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}