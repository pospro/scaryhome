package View;

import javafx.scene.Group;

public class Background extends Group implements GameObject{

	
	BackgroundType type;
	
	public Background(BackgroundType type) {
		this.type = type;
	}
	
	@Override
	public void setUp() {
		//rect.setFill(Color.TRANSPARENT); -> add Hitboxes (Transparent)
	}

}
