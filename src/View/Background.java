package View;

import Model.Map;
import javafx.scene.Group;

public class Background extends Group implements GameObject{

	
	Map type;
	
	public Background(Map type) {
		this.type = type;
	}
	
	@Override
	public void setUp() {
		//rect.setFill(Color.TRANSPARENT); -> add Hitboxes (Transparent)
	}

}
