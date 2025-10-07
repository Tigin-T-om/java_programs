import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;


   
public class JavaFX_Stage extends Application
{
  public static void main(String[] args) 
  {
   
 System.out.println("Launching JavaFX");
     launch(args);
     System.out.println("Finished");
  }

  public void start(Stage stage)
  {
     stage.setTitle("Hello");
     stage.setWidth(600);
     stage.setHeight(500);



// Create your VBox (example)
VBox vbox = new VBox();
vbox.setAlignment(Pos.CENTER);

// Attach an event handler to the button

 Label emptyLabel = new Label();
Button button = new Button("Click Me");
button.setOnAction(new EventHandler<ActionEvent>() {
    @Override

    public void handle(ActionEvent event) {
        System.out.println("Button was clicked!");
	
        emptyLabel.setText("Success ");
    }
});


// Create a StackPane and add VBox to it
StackPane root = new StackPane();

// Center the VBox inside the StackPane
StackPane.setAlignment(vbox, Pos.CENTER);

// Use root as the scene root
Scene scene = new Scene(root, 200, 100);

root.getChildren().add(vbox);

stage.setScene(scene);
stage.show();

// Create a label with initial text
    Label textLabel = new Label("Hello, JavaFX!");
   
    vbox.getChildren().add(textLabel);
    vbox.getChildren().add(emptyLabel);
    vbox.getChildren().add(button);
   

     // Create a label with text and a graphic (e.g., an image)
    // ImageView imageView = new ImageView(new Image("path/to/image.png"));
    // Label graphicLabel = new Label("With Image", imageView);

   stage.setScene(scene);
   stage.show();
  }
}



//javac --module-path E:\SDK_openfx_21.0.4\javafx-sdk-21.0.4\lib --add-modules javafx.controls,javafx.fxml JavaFX_Stage.java
