package View;

import javafx.scene.layout.GridPane;

public class Background extends GridPane implements Object{

	
	BackgroundType type;
	
	public Background(BackgroundType type) {
		this.type = type;
	}
	
	@Override
	public void setUp() {
		
	}

}
