package lab4;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {

	/**
	 * 
	 */
	private static final long serialVersionUID = 630229939175787977L;
	public Square() {
		this.setShapeName("Square");

	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		gc.setFill(getMyColor().getFXColor());
		gc.fillRect(this.getX() - 15, this.getY() - 15, 30, 30);
	}
	@Override
	public void drawButton(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillRect(5, 5, 30, 30);

	}
}