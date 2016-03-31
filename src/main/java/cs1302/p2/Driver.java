package cs1302.p2;

import cs1302.effects.Artsy;

import java.awt.*;
import java.io.File;
import java.awt.image.BufferedImage;
import javafx.embed.swing.SwingFXUtils;
import javax.imageio.ImageIO;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

public class Main extends Application {

    Button checkerButton, horizStripeButt, vertStripeButt, rotateButt, resetButt;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Artsy!");

        //create buttons
        checkerButton = new Button("Checkers");
        checkerButton.setOnAction(e -> {
            Alert.checkerOption();
        });
        horizStripeButt = new Button("Horizontal Stripes");
        horizStripeButt.setOnAction(e -> Alert.horizOpt());
        vertStripeButt = new Button("Vertical Stripes");
        vertStripeButt.setOnAction(e -> Alert.vertOpt());
        rotateButt = new Button("Rotate");
        rotateButt.setOnAction(e -> Alert.rotateOpt());
        resetButt = new Button("Reset");
        resetButt.setOnAction(e -> System.out.println("Reset Button"));

        //create file menu
        Menu fileMenu = new Menu("_File");
        Menu open = new Menu("Open");

        //create menu items
        fileMenu.getItems().add(open);
        MenuItem open1 = new MenuItem("Open Image 1");
        open.getItems().add(open1);
        MenuItem open2 = new MenuItem("Open Image 2");
        open.getItems().add(open2);
        fileMenu.getItems().add(new SeparatorMenuItem());
        MenuItem saveAs = new MenuItem("Save As");
        fileMenu.getItems().add(saveAs);
        fileMenu.getItems().add(new SeparatorMenuItem());
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(e -> primaryStage.close());
        fileMenu.getItems().add(exit);

        //add menus to the menuBar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu);

        //create OutermostVbox
        VBox vbox = new VBox(5);

        //create button Hbox
        HBox hboxButt = new HBox(5);
        hboxButt.getChildren().addAll(checkerButton, horizStripeButt, vertStripeButt);
        hboxButt.setMargin(checkerButton, new Insets(5, 5, 5, 5));
        hboxButt.setMargin(horizStripeButt, new Insets(5, 5, 5, 5));
        hboxButt.setMargin(vertStripeButt, new Insets(5, 5, 5, 5));

        //create images Hbox
        HBox hboxImage = new HBox(5);

        //create image1 VBox
        VBox vboxImage = new VBox(5);
        vboxImage.setMinWidth(300);
        Label image1Label = new Label();
        image1Label.setText("Image 1: ");

        vboxImage.getChildren().addAll(image1Label, rotateButt, resetButt);

        //

        //add to original VBox
        vbox.getChildren().addAll(hboxButt, hboxImage);

        //add to page layout
        BorderPane pageLayout = new BorderPane();
        pageLayout.setTop(menuBar);
        pageLayout.setCenter(vbox);

        Scene scene = new Scene(pageLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
