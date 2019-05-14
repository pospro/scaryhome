package View;

import Controller.EditorButton;
import Controller.MapEditorEvent;
import Model.Map;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Editor extends BorderPane implements GameObject{

	Tools left;
	EditArea right;
	EditorButton ctrl;
	MapEditorEvent edit;
	
	public Editor() {
		setUp();
	}
	
	@Override
	public void setUp() {
		
		ctrl = new EditorButton(this);
		
		left = new Tools(ctrl);
		
		setLeft(Helpful.addVBox(150, 400, left));
		
		right = new EditArea();
		
		// Damit Ein Click überall registriert wird
		VBox v = Helpful.addVBox(400, 400, right);
		v.setOnMousePressed(edit);
		
		setRight(v);
	}

	public void updateMap(Map map)
	{
		
	}
	
	public Map getMap()
	{
		return right.getMap();
	}
}
