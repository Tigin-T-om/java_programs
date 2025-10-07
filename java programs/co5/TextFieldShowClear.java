import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldShowClear extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        Label displayLabel = new Label();
        Button showBtn = new Button("Show");
        Button clearBtn = new Button("Clear");

        showBtn.setOnAction(e -> displayLabel.setText(textField.getText()));
        clearBtn.setOnAction(e -> {
            textField.clear();
            displayLabel.setText("");
        });

        VBox root = new VBox(10, textField, showBtn, clearBtn, displayLabel);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Show and Clear Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
