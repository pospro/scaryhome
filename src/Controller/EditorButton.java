package Controller;

import java.io.File;

import Model.EditorModel;
import Model.LoadingException;
import Model.Map;
import View.Editor;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

public class EditorButton implements EventHandler<MouseEvent> {

	Editor editor;
	
	public EditorButton(Editor editor) {
		this.editor = editor;
	}
	
	@Override
	public void handle(MouseEvent event) {
		
		switch (((Button)(event.getSource())).getUserData().toString()) {
		case "load":
			load();
			break;

		case "save":
			save(editor.getMap());
			break;
			
		default:
			break;
		}
	}

	
	private void load()
	{
		FileChooser choose = new FileChooser();
		
		File f = choose.showOpenDialog(editor.getScene().getWindow());
		
		try {
			EditorModel.load(f.getAbsolutePath());
		} catch (LoadingException e) {
			// Hier Dann Dialog erstellen
			e.printStackTrace();
		}
	}
	
	private void save(Map map)
	{
		FileChooser choose = new FileChooser();
		
		File f = choose.showOpenDialog(editor.getScene().getWindow());
		
		EditorModel.save(f.getAbsolutePath(), map);
		
	}
}
