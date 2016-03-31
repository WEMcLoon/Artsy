package cs1302.p2;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

public class Alert {

    public static void checkerOption(){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Checkers Options");
        window.setMinWidth(400);

        Label label = new Label();
        label.setText("Please enter the desired checker width, in pixels.");
        Button okButt = new Button("OK");
        Button cancelButt = new Button("Cancel");
        cancelButt.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, cancelButt, okButt);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

    public static void horizOpt(){

    }

    public static void vertOpt(){

    }

    public static void rotateOpt(){

    }
}