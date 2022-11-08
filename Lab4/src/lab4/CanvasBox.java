package lab4;

import javafx.scene.layout.HBox;

public class CanvasBox extends HBox {
	
	private PaintSurface paintSurface;


	public CanvasBox(Model myModel) {
		paintSurface = new PaintSurface(myModel);
		ToolBox toolBox = new ToolBox(myModel);
		this.getChildren().add(paintSurface);
		this.getChildren().add(toolBox);
		
	}

	public PaintSurface getPS() {
		return paintSurface;
	}

}
