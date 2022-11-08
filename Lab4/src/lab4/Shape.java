package lab4;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5826674742353806781L;
	private double x,y;
	private SerializableColor myColor = new SerializableColor(Color.BLACK);
	private String shapeName;

	public Shape() {
		// TODO Auto-generated constructor stub

	}
	public abstract void drawYourself(GraphicsContext gc);
	public abstract void drawButton(GraphicsContext gc);

	public void setCoord(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setColor(SerializableColor myColor) {
		this.myColor = myColor;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public SerializableColor getMyColor() {
		return myColor;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}



}
