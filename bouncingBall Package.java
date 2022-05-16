package com.mycompany.bouncingball;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("play");
        CheckBox c1 = new CheckBox("اصطدامها \n ببعضها");
        ScrollBar s = new ScrollBar();
            button.setTranslateX(600);
            button.setTranslateY(50);
            c1.setTranslateX(600);
            c1.setTranslateY(100);
            s.setTranslateX(550);
            s.setTranslateY(150);
            
        
        
        
        
        Pane pane = new Pane();
        Ball ball = new Ball();
        pane.getChildren().add(ball);
        pane.getChildren().addAll(button,c1,s);
              var scene = new Scene(pane, 680, 480);
              stage.setScene(scene);
              stage.show();
          }

          public static void main(String[] args) {
              launch();
          }

      }












      



