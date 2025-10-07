import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextTransfer extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField inputField = new TextField();
        TextField outputField = new TextField();
        Button submitButton = new Button("Submit");

        submitButton.setOnAction(e -> outputField.setText(inputField.getText()));

        VBox root = new VBox(10, inputField, submitButton, outputField);
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Text Transfer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
EXPECTED OUTPUT:
Initial:
Two TextFields and one button in between.

Example:
User types: "JavaFX Rocks"
Clicks Submit -> Second TextField displays "JavaFX Rocks"
*/
