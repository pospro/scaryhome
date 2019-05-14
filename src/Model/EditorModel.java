package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EditorModel {

	public static void save(String path, Map toSave)
	{
		FileOutputStream out;
		try {
			out = new FileOutputStream(new File(path+".map"));
			
			ObjectOutputStream w = new ObjectOutputStream(out);
			
			w.writeObject(toSave);
			
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Map load(String path) throws LoadingException
	{
		FileInputStream out;
		try {
			out = new FileInputStream(new File(path+".map"));
			
			ObjectInputStream w = new ObjectInputStream(out);
			
			Map ret = (Map) w.readObject();
			
			w.close();
			
			return ret;
		} catch (IOException | ClassNotFoundException e) {
			throw new LoadingException("Failed to load");
		}
		
		
	}
}
