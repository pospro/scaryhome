package Controller;

import View.Editor;
import View.Mainframe;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuButtonEvent implements EventHandler<MouseEvent>{

	@Override
	public void handle(MouseEvent event) {
		switch (((Button)(event.getSource())).getUserData().toString()) {
		case "play":
			updateOnMainframe(new Mainframe(), event);
			break;

		case "edit":
			updateOnEdit(new Editor(), event);
			break;
			
		default:
			break;
		}
	}

	
	private void updateOnMainframe(Mainframe p, MouseEvent event)
	{
		p.init();
		
		KeyReact ctrl = new KeyReact(p);
		
		((Button)(event.getSource())).getScene().setOnKeyPressed(ctrl);;
		
		((Button)(event.getSource())).getScene().setRoot(p);
	}
	
	private void updateOnEdit(Editor p, MouseEvent event)
	{
		((Button)(event.getSource())).getScene().setRoot(p);
	}
}
