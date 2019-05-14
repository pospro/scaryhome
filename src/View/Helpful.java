package View;

import javafx.scene.Node;
import javafx.scene.layout.HBox;

public class Helpful {

	public static HBox addHBox(int width, int height, Node n)
	{
		HBox ret = new HBox();
		
		ret.getChildren().add(n);
		
		ret.setPrefSize(width, height);
		
		return ret;
	}
	
}
