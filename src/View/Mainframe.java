package View;

import Model.EditorModel;
import Model.LoadingException;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Mainframe extends Group{

	
	Background back;
	Player play;
	Image img;
	
	public void init()
	{
		setUpBackground();
		
		play = new Player(30, 200);
		getChildren().add(play);
		
		
//		try {
//			back = new Background(EditorModel.load("entrance.map"));
//		} catch (LoadingException e) {
//			e.printStackTrace();
//		}
//		getChildren().add(back);
	}

	
	private void setUpBackground()
	{
		img = new Image("test.png");
		
		ImageView iv = new ImageView(img);
		
		getChildren().add(iv);
		
		
	}
	
	public Background getBack() {
		return back;
	}

	public Player getPlay() {
		return play;
	}
	
	
}
