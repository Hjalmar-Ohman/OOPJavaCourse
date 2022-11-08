package lab4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	private BoxScene boxScene = new BoxScene();

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene mainScene = new Scene(boxScene);
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("Välkomna till Ritprogrammet!");
		primaryStage.setWidth(900);
		primaryStage.setHeight(700);
		primaryStage.show();
	}
//	public void Restart(BoxScene newBoxScene) {
//		this.boxScene = newBoxScene;
//	}
}

//LÄGG TILL KLICKFUNKTION O.S.V.
