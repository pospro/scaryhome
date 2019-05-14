package View;

import Controller.EditorButton;
import javafx.scene.layout.BorderPane;

public class Editor extends BorderPane implements GameObject{

	Tools left;
	EditArea right;
	EditorButton ctrl;
	
	public Editor() {
		setUp();
	}
	
	@Override
	public void setUp() {
		left = new Tools(ctrl);
		
		setLeft(Helpful.addVBox(150, 400, left));
		
		right = new EditArea();
		
		setRight(Helpful.addVBox(400, 400, right));
	}

	
}
