import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GenderSelection extends Application {
    @Override
    public void start(Stage primaryStage) {
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        Label label = new Label();

        ToggleGroup group = new ToggleGroup();
        male.setToggleGroup(group);
        female.setToggleGroup(group);

        group.selectedToggleProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                RadioButton selected = (RadioButton) newVal;
                label.setText("Selected: " + selected.getText());
            }
        });

        VBox root = new VBox(10, male, female, label);
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Gender Selection");
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
Two radio buttons (Male, Female), label empty.

Example:
User selects Male -> Label displays "Selected: Male"
User selects Female -> Label updates to "Selected: Female"
*/
