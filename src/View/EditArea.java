package View;

import Model.Map;
import javafx.scene.Group;
import javafx.scene.Node;

public class EditArea extends Group{

	public Map getMap()
	{
		
		Map ret = new Map();
		
		for (Node c : getChildren()) {
			if(c instanceof GameObject)
				ret.appendObj((GameObject) c);
		}
		
		return ret;
	}
	
}
