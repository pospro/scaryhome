package View;

import javafx.scene.shape.Rectangle;

public class Player extends Rectangle implements GameObject{

	
	private int speed = 15;
	
	public Player(int x, int y) {
		setX(x);
		setY(y);
		
		setUp();
	}
	
	public void setUp()
	{
		setHeight(40);
		setWidth(40);
	}
	
	
	public void up()
	{
		for(int i = 0; i < speed; i++)
			setY(getY() - 1);
	}
	public void left()
	{
		for(int i = 0; i < speed; i++)
		setX(getX() - 1);
	}
	public void down()
	{
		for(int i = 0; i < speed; i++)
		setY(getY() + 1);
	}
	public void right()
	{
		for(int i = 0; i < speed; i++)
		setX(getX() + 1);
	}
}
