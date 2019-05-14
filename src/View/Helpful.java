package View;

import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class Helpful {

	public static VBox addVBox(int width, int height, Node n)
	{
		VBox ret = new VBox();
		
		ret.getChildren().add(n);
		
		ret.setPrefSize(width, height);
		
		return ret;
	}
	
}
