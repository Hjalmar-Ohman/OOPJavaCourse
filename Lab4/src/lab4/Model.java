package lab4;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Model implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9053647406107796003L;
	String currentShape = "Circle";
	SerializableColor currentColor = new SerializableColor(Color.BLACK);
	ArrayList<Shape> contents = new ArrayList<Shape>();
	transient GraphicsContext gc;

	public Model() {

	}

	public void setShape(String currentShape) {
		this.currentShape = currentShape;
	}
	public void setColor(SerializableColor color) {
		this.currentColor = color;
	}

	public void drawShape(double x, double y, GraphicsContext gc) {
		this.gc = gc;

		
		if(currentShape.equals("Circle")){
			Circle tmp = new Circle();
			tmp.setCoord(x, y) ;
			tmp.setColor(currentColor);
			tmp.drawYourself(gc);
			contents.add(tmp);
		} else if (currentShape.equals("Square")) {
			Square tmp = new Square();
			tmp.setCoord(x, y) ;
			tmp.setColor(currentColor);
			tmp.drawYourself(gc);
			contents.add(tmp);
		} else {
			Triangle tmp = new Triangle();
			tmp.setCoord(x, y) ;
			tmp.setColor(currentColor);
			tmp.drawYourself(gc);
			contents.add(tmp);

		}
	}

	public void clear() {
		if(gc != null) {
			gc.setFill(Color.WHITE);
			System.out.println("asd");
			gc.fillRect(0, 0, 1000, 900);
			contents.clear();
		}
	}

	
	public void printContent() {
		for (Shape shape : contents) {
			shape.drawYourself(gc);
		}
	}
	public void setGc(GraphicsContext gc) {
		this.gc = gc;
		
	}
	
	public GraphicsContext getGc() {
		return this.gc;
		
	}
	
	public ArrayList<Shape> getContents(){
		return contents;
	}

	public void setContents(ArrayList<Shape> contents2) {
		this.contents = contents2;		
	}
}
