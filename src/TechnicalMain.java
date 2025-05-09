import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TechnicalMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(TechnicalMain.class.getResource("technicalMain.fxml"));
        Scene scene = new Scene(loader.load());
//        stage.setHeight(700);
//        stage.setWidth(1000);
        stage.setScene(scene);
        stage.setTitle("Technical Officer");
        stage.setResizable(false);
        stage.show();
    }
}
