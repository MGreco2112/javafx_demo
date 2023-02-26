package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application { //extend parent class Application from javaFX to Application class


    public static void main(String[] args) { //main method takes args from String array
        launch(args); //calls Application.launch() method passing in args array as argument
    }

    @Override
    public void start(Stage stage) throws Exception { //start method called by launch method in main, takes Stage as parameter
        //stage generated and passed in from launch method via launchimplementation call
        Group root = new Group(); //instantiates new Group object, which is a node for the scene
        Scene scene = new Scene(root, 640, 480, Color.BLACK); //instantiates new Scene for the stage, node is passed into scene constructor
        //width and height variables passed into scene constructor
        //color argument for constructor can change the background of the scene (default state is white)
        stage.setTitle("Area 401"); //sets title for the window when stage is shown
        Image icon = new Image(new FileInputStream("src/logo.jpg")); //instantiates Image object from FileInputStream local path of image
        stage.getIcons().add(icon); //adds image as icon to Stage icons
        stage.setResizable(false); //set resizable ability by user (default is true)
        stage.setScene(scene); //scene is set onto the stage

        stage.show(); //stage is shown for user to interact with
    }
}