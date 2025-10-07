import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label();
        Button button = new Button("Click Me");

        button.setOnAction(e -> label.setText("Hello JavaFX"));

        VBox root = new VBox(10, button, label);
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Hello JavaFX");
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
Label is empty.

After button click:
Label displays "Hello JavaFX".
*/
