package src;
import java.net.URL;
import java.nio.file.Paths;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 * 
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Logger LOG = Logger.getLogger(Main.class.getName());

    @Override
    public void start(Stage primaryStage) throws Exception {
    	
    	URL url = Paths.get("./res/session.fxml").toUri().toURL();
    	Parent root = (BorderPane)FXMLLoader.load(url);
      //Scene scene = new Scene(FXMLLoader.load(Main.class.getResource("C:/Users/user/Desktop/ai-n-queens-master/res/session.fxml")));
    	Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setHeight(675);
        primaryStage.setWidth(753);
        primaryStage.setResizable(false);
        primaryStage.show();

        

    }

}