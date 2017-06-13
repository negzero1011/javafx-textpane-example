package example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class TextPaneExample extends Application {

	
	private GridPane gridPane;
	private Scene scene;
	private TextArea result;
	private TextField input;
	
	public static void main(String[] args) {
		
		Application.launch(args);
		
	}

	@Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Example");

		//Creating a GridPane container
		gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.setAlignment(Pos.CENTER);
		
		//Defining the input text field
		input = new TextField();
		input.setPromptText("Type here");
		input.setPrefColumnCount(10);
		input.getText();
		GridPane.setConstraints(input, 0, 0);
		gridPane.getChildren().add(input);
		
		result = new TextArea();
		GridPane.setConstraints(result, 0, 3);
		gridPane.getChildren().add(result);

        
        Button run = new Button("Run...");
        run.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
    			result.setText(input.getText());
            }
        });

		GridPane.setConstraints(run, 0, 1);
		gridPane.getChildren().add(run);

		
		scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
		gridPane.setVisible(true);

	}

}
