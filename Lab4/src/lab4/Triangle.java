package lab4;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8824170999934600457L;
	public Triangle() {
		this.setShapeName("Triangle");
	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		gc.setFill(getMyColor().getFXColor());
		gc.fillPolygon(new double[] {this.getX()-15, this.getX(), this.getX()+15},  new double[] {this.getY()+12,this.getY()-12.5,this.getY()+12}, 3);
//		if (contents!=null){ 
//			contents.add(this);
//			}
	}
	@Override
	public void drawButton(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillPolygon(new double[] {5.0,20.0,35.0},  new double[] {30.0,5.0,30.0}, 3);

	}
}