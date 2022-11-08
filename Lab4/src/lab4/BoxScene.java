package lab4;

import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class BoxScene extends VBox {

	private Model myModel = new Model();
	private CanvasBox canvasBox = new CanvasBox(myModel);

	public BoxScene() {
		BottomBox bottomBox = new BottomBox(myModel, canvasBox);

		this.getChildren().add(canvasBox);
		this.getChildren().add(bottomBox);
	}


}