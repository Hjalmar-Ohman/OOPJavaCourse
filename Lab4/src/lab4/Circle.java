package lab4;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7700859646782236353L;
	public Circle() {
		this.setShapeName("Circle");

	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		gc.setFill(getMyColor().getFXColor());
		gc.fillOval(this.getX() - 15, this.getY() - 15, 30, 30);
	}
	@Override
	public void drawButton(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillOval(5, 5, 30, 30);

	}
}
