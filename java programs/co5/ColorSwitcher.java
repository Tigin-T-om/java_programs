import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorSwitcher extends Application {

    // Model: Two colors and current color name
    private final Color COLOR_ONE = Color.RED;
    private final Color COLOR_TWO = Color.BLUE;
    private final StringProperty colorName = new SimpleStringProperty("RED");

    @Override
    public void start(Stage primaryStage) {
        // UI Components
        Rectangle rectangle = new Rectangle(150, 100, COLOR_ONE);
        ToggleButton toggleButton = new ToggleButton("Switch Color");
        Label label = new Label();

        // Binding label text to current color name
        label.textProperty().bind(colorName);

        // Toggle behavior
        toggleButton.setOnAction(e -> {
            if (rectangle.getFill().equals(COLOR_ONE)) {
                rectangle.setFill(COLOR_TWO);
                colorName.set("BLUE");
            } else {
                rectangle.setFill(COLOR_ONE);
                colorName.set("RED");
            }
        });

        VBox layout = new VBox(15, rectangle, toggleButton, label);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setTitle("Color Switcher");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
