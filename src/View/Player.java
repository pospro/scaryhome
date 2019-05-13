package View;

import javafx.scene.shape.Rectangle;

public class Player extends Rectangle implements GameObject{

	
	private int speed = 5;
	
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
		setY(getY() - speed);
	}
	public void left()
	{
		setX(getX() - speed);
	}
	public void down()
	{
		setY(getY() + speed);
	}
	public void right()
	{
		setX(getX() + speed);
	}
}
