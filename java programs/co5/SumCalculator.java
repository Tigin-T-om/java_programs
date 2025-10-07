import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SumCalculator extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField num1 = new TextField();
        TextField num2 = new TextField();
        Label resultLabel = new Label();
        Button sumButton = new Button("Calculate Sum");

        sumButton.setOnAction(e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                resultLabel.setText("Sum: " + (a + b));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        VBox root = new VBox(10, num1, num2, sumButton, resultLabel);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Sum Calculator");
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
Two empty text boxes, a button, and a label.

Example:
User enters 5 in first box and 10 in second.
Clicks "Calculate Sum" -> Label displays "Sum: 15.0"

Invalid input:
If user types "abc", label shows "Invalid input!"
*/
