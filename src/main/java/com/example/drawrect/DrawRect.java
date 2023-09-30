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
    private Button drawRect;
    private Button drawOval;
    final static Canvas canvas = new Canvas(550,550);
    private static int step = 10;
    private static GraphicsContext gc = canvas.getGraphicsContext2D();
    @Override
    public void start(Stage stage) throws IOException {
        drawRect = new Button();
        drawRect.setText("Draw Rectangle");
        drawRect.setOnAction(evt -> DrawRectangel());

        drawOval = new Button();
        drawOval.setText("Draw Oval");
        drawOval.setOnAction(evt -> Drawoval());
        drawOval.setTranslateX(100.0);
        Group root = new Group();
        Scene s = new Scene(root, 350, 350);
        root.getChildren().addAll(canvas, drawRect, drawOval);
        stage.setTitle("Hello!");
        stage.setScene(s);
        stage.show();
    }
    public static void DrawRectangel(){

        gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());
        for (int i = 0; i < 10; i++) {
            gc.strokeRect(10 + i * step,10 + i * step,90 + i * step, 90 + i * step);
        }
    }

    public static void Drawoval() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        for (int i = 0; i < 10; i++) {
            gc.strokeOval(10 + i * step, 10 + i * step, 90 + i * step, 90 + i * step);
        }
    }
    public static void main(String[] args) {
        launch();
    }
}