package Model;

import java.io.Serializable;
import java.util.ArrayList;

import View.GameObject;

public class Map implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<GameObject> objects;
	
	public void updateObj(ArrayList<GameObject> objects)
	{
		this.objects = objects;
	}
	
	public ArrayList<GameObject> getObj()
	{
		return objects;
	}
}
