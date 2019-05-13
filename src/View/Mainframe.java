package View;

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
		
		
		
	}

	
	private void setUpBackground()
	{
		img = new Image("test.png");
		
		ImageView iv = new ImageView(img);
		
		getChildren().add(iv);
		
		back = new Background(BackgroundType.EINGANG);
		getChildren().add(back);
	}
	
	public Background getBack() {
		return back;
	}

	public Player getPlay() {
		return play;
	}
	
	
}
