package lab4;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ToolBox extends VBox  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6059515059293487675L;
	private ArrayList<ColorButton> clrBtns = new ArrayList();
	private ArrayList<ShapeButton> shBtns= new ArrayList();

	
	
	public ToolBox(Model myModel) {
		
		clrBtns.add(new ColorButton(new SerializableColor(Color.BLACK), myModel, clrBtns));
		clrBtns.add(new ColorButton(new SerializableColor(Color.RED), myModel, clrBtns));
		clrBtns.add(new ColorButton(new SerializableColor(Color.BLUE), myModel, clrBtns));
		clrBtns.add(new ColorButton(new SerializableColor(Color.GREEN), myModel, clrBtns));
		clrBtns.add(new ColorButton(new SerializableColor(Color.YELLOW), myModel, clrBtns));
		clrBtns.add(new ColorButton(new SerializableColor(Color.MAGENTA), myModel, clrBtns));
		clrBtns.add(new ColorButton(new SerializableColor(Color.WHITE), myModel, clrBtns));
		clrBtns.add(new ColorButton(new SerializableColor(Color.ORANGE), myModel, clrBtns));
		
		
		shBtns.add(new ShapeButton(new Circle(), myModel, shBtns));
		shBtns.add(new ShapeButton(new Square(), myModel, shBtns));
		shBtns.add(new ShapeButton(new Triangle(), myModel, shBtns));

		this.setStyle("-fx-background-color: GREY;");
		this.setSpacing(11);
		this.setAlignment(Pos.BASELINE_CENTER);
		
		this.getChildren().add(0, new Text("  Färg  "));
		 
		for (ColorButton colorButton : clrBtns) {
			this.getChildren().add(colorButton);
		}
		
		this.getChildren().add(9, new Text("Shapes"));
		
		for (ShapeButton shapeButton : shBtns) {
			this.getChildren().add(shapeButton);
		}

	}


}
