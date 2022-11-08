package lab4;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;

public class BottomBox extends HBox  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5733097227680997615L;
	private Button clearButton = new Button("Rensa");
	private Button saveButton = new Button("Spara");
	private Button openButton = new Button("Öppna");

	private Model myModel;


	public BottomBox(Model myModel, CanvasBox canvasBox) {
		this.myModel = myModel;
		this.setStyle("-fx-background-color: GRAY;");
		this.getChildren().add(clearButton);
		this.getChildren().add(saveButton);
		this.getChildren().add(openButton);

		clearButton.setOnAction(event -> {  
			myModel.clear();

		});

		saveButton.setOnAction(event -> {  
			ObjectOutputStream out;
			try {
				FileChooser fc = new FileChooser();
				File selectedFile = fc.showOpenDialog(null); 

				out = new ObjectOutputStream(
						new FileOutputStream(selectedFile));
				out.writeObject(myModel);
				out.flush();
				out.close();

			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		});

		openButton.setOnAction(event -> {  
			ObjectInputStream in;

			try {
				FileChooser fc = new FileChooser();
				File selectedFile = fc.showOpenDialog(null);

				in = new ObjectInputStream(
						new FileInputStream(selectedFile));
				try {

					Model m2 = (Model)in.readObject();
				
					this.setModel(m2);
					myModel.setGc(canvasBox.getPS().getGc());
					
					myModel.printContent();


				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				in.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		});


	}

	private void setModel(Model myModel) {
		this.myModel = myModel;
	}

}