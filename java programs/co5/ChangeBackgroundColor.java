import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;

public class ChangeBackgroundColor extends Application {
    private boolean toggle = false;

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Button button = new Button("Change Color");

        button.setOnAction(e -> {
            if (toggle) {
                root.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, null)));
            } else {
                root.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, null)));
            }
            toggle = !toggle;
        });

        root.getChildren().add(button);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Background Color Changer");
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
Background is default (white).

Click the button:
- 1st click -> Background turns LIGHTGREEN
- 2nd click -> Background turns LIGHTBLUE
- and keeps toggling on each click.
*/
