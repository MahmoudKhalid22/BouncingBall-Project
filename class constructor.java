/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bouncingball;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.animation.KeyFrame;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.util.Duration;
/**
 *
 * @author طيبة
 */
class Ball extends Pane{
    
    
    
    
    
    
    //Creation a circles
    Circle c[] = new Circle[30];
    Ball(){
        for (int i =0;i<30;i++){
        c[i] = new Circle();
        c[i].setRadius(Math.random()*20+9);
        c[i].setFill(Color.BLUE);
        c[i].setTranslateX(Math.random()*640);
        c[i].setTranslateY(Math.random()*480);
        getChildren().add(c[i]);
       
     
   
   }
        
    }
}
