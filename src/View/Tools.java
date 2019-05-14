package View;

import Controller.EditorButton;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Tools extends GridPane implements GameObject{

	Button load;
	Button save;
	
	EditorButton ctrl;
	
	public Tools(EditorButton ctrl) {
		this.ctrl = ctrl;
		
		setUp();
	}
	
	@Override
	public void setUp() {
		
		setStyle("-fx-background-color: red");
		setPrefWidth(150);
		
		load = new Button("load");
		save = new Button("save");
		
		load.setUserData("load");
		save.setUserData("save");
		
		load.setOnMouseClicked(ctrl);
		save.setOnMouseClicked(ctrl);
	}

	
	
}
