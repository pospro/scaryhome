package Controller;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class EditorButton implements EventHandler<MouseEvent> {

	@Override
	public void handle(MouseEvent event) {
		
		switch (((Button)(event.getSource())).getUserData().toString()) {
		case "load":
			load();
			break;

		case "save":
			save();
			break;
			
		default:
			break;
		}
	}

	
	private void load()
	{
		
	}
	
	private void save()
	{
		
	}
}
