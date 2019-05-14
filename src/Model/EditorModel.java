package Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
	
}
