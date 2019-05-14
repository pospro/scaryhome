package Controller;

import View.Mainframe;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuButtonEvent implements EventHandler<MouseEvent>{

	@Override
	public void handle(MouseEvent event) {
		switch (((Button)(event.getSource())).getUserData().toString()) {
		case "play":
			
			Mainframe m = new Mainframe();
			
			m.init();
			
			((Button)(event.getSource())).getScene().setRoot(m);
			break;

		case "edit":
			
			break;
			
		default:
			break;
		}
	}

}
