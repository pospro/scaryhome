package View;

import Controller.MenuButtonEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainMenu extends VBox implements GameObject{

	Button play;
	Button edit;
	MenuButtonEvent ctrl;
	
	public MainMenu() {
		setUp();
	}

	@Override
	public void setUp() {
		
		ctrl = new MenuButtonEvent();
		
		setSpacing(40);
		
		setAlignment(Pos.CENTER);
		
		play = new Button("Play");
		edit = new Button("Edit");
		
		play.setPrefWidth(120);
		edit.setPrefWidth(120);
		
		play.setUserData("play");;
		edit.setUserData("edit");
		
		play.setOnMouseClicked(ctrl);
		edit.setOnMouseClicked(ctrl);
		
		getChildren().add(play);
		getChildren().add(edit);
	}
	
}
