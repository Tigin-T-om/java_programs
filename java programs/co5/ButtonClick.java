import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonClickCounter extends Application {
    private int count = 0;

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Clicked 0 times");
        Button button = new Button("Click Me");

        button.setOnAction(e -> {
            count++;
            label.setText("Clicked " + count + " times");
        });

        VBox root = new VBox(10, button, label);
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Button Click Counter");
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
Label -> "Clicked 0 times"

Each time user clicks button:
1st click -> "Clicked 1 times"
2nd click -> "Clicked 2 times"
and so on...
*/
