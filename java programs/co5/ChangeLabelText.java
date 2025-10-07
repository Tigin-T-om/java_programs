import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChangeLabelText extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Not Clicked");
        Button button = new Button("Click Me");

        button.setOnAction(e -> label.setText("Button Clicked"));

        VBox root = new VBox(10, button, label);
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Label Text Changer");
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
Label -> "Not Clicked"

After clicking button:
Label -> "Button Clicked"
*/
