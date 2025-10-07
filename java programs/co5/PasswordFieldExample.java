import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswordFieldExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        PasswordField passwordField = new PasswordField();
        Label label = new Label();

        passwordField.setOnAction(e -> label.setText("Password Entered!"));

        VBox root = new VBox(10, passwordField, label);
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("PasswordField Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
