package lab4;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ShapeButton extends Canvas  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3550924377853734259L;
	private Shape myShape;

	public ShapeButton(Shape myShape, Model myModel, ArrayList<ShapeButton> shBtns) {

		this.myShape = myShape;

		setWidth(40);
		setHeight(40);

		GraphicsContext gc = getGraphicsContext2D();
		myShape.setCoord(5, 5);
		myShape.drawButton(gc);

		setOnMouseClicked(event -> {
			myModel.setShape(myShape.getShapeName());


			for (ShapeButton shapeButton : shBtns) {
				shapeButton.Unclick();
			}

			gc.fillRect(0, 0, getWidth(), getHeight());
			gc.setFill(Color.GREY);
			gc.fillRect(1, 1, getWidth()-2, getHeight()-2);
			myShape.drawButton(gc);


		});
	}

	public void Unclick() {
		GraphicsContext gc = getGraphicsContext2D();
		gc.setFill(Color.GREY);
		gc.fillRect(0, 0, getWidth(), getHeight());
		gc.setFill(Color.BLACK);
		myShape.drawButton(gc);
		myShape.setCoord(5, 5);

	}


}
