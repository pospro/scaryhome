package View;

import javafx.scene.layout.GridPane;

public class Background extends GridPane implements GameObject{

	
	BackgroundType type;
	
	public Background(BackgroundType type) {
		this.type = type;
	}
	
	@Override
	public void setUp() {
		setPrefSize(getScene().getWidth(), getScene().getHeight());
	}

}
