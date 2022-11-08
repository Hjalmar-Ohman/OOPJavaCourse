package lab4;

import java.io.Serializable;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class PaintSurface extends Canvas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3647493055632267086L;
	SerializableColor surfaceColor = new SerializableColor(Color.WHITE);
	
	transient GraphicsContext gc = getGraphicsContext2D();

	
	public PaintSurface(Model myModel) {
		
		setWidth(850);
		setHeight(645);

		gc.setFill(surfaceColor.getFXColor());
		gc.fillRect(0, 0, getWidth(), getHeight());
	
		setOnMouseClicked(event -> {
			myModel.drawShape(event.getX(), event.getY(), gc);

		});

	}

	public GraphicsContext getGc() {
		return this.gc;
		
	}

}