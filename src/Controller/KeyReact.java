package Controller;

import View.MainMenu;
import View.Mainframe;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class KeyReact implements EventHandler<KeyEvent>{

	Mainframe frame;
	
	
	public KeyReact(Mainframe frame) {
		this.frame = frame;
	}
	
	@Override
	public void handle(KeyEvent event) {
		
		System.out.println(event.getCode());
		
		switch (event.getCode().toString()) {
		case "W":
			frame.getPlay().up();
			break;

		case "A":
			frame.getPlay().left();
			System.out.println("a");
			break;
		
		case "S":
			frame.getPlay().down();
			System.out.println("s");
			break;
			
		case "D":
			frame.getPlay().right();
			System.out.println("d");
			break;
			
		case "ESCAPE":
			frame.getScene().setOnKeyPressed(null);
			frame.getScene().setRoot(new MainMenu());
			break;
			
//		case :
//			frame.getPlay().up();
//			frame.getPlay().left();
//			System.out.println("wa");
//			break;
//			
//		case :
//			frame.getPlay().up();
//			frame.getPlay().right();
//			System.out.println("wd");
//			break;
		
		default:
			break;
		}
	}

}
