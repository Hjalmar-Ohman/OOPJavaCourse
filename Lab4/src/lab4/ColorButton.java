package lab4;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ColorButton extends Canvas  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7642878240482496050L;
	private SerializableColor myColor;

	public ColorButton(SerializableColor myColor, Model myModel, ArrayList<ColorButton> clrBtns) {
		this.myColor = myColor;
		
		
		setWidth(40);
		setHeight(40);

		GraphicsContext gc = getGraphicsContext2D();

		gc.setFill(myColor.getFXColor());
		gc.fillRect(0, 0, getWidth(), getHeight());
		
		setOnMouseClicked(event -> {
			myModel.setColor(myColor);
			
			for (ColorButton colorButton : clrBtns) {
				colorButton.Unclick();
			}
			
			gc.setFill(Color.BLACK);
			gc.fillRect(0, 0, getWidth(), getHeight());
			gc.setFill(myColor.getFXColor());
			gc.fillRect(3, 3, getWidth()-6, getHeight()-6);
			
		});
	}
	
	public void Unclick() {
		GraphicsContext gc = getGraphicsContext2D();
		gc.setFill(myColor.getFXColor());
		gc.fillRect(0, 0, getWidth(), getHeight());

	}

}
