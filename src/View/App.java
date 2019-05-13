package View;

import Controller.KeyReact;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Mainframe frame = new Mainframe();
		
		frame.init();
		
		Scene s = new Scene(frame);
		
		s.setOnKeyPressed(new KeyReact(frame));
		
		primaryStage.setWidth(400);
		primaryStage.setHeight(400 + 28);
		
		primaryStage.setScene(s);
		primaryStage.setResizable(false);
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
