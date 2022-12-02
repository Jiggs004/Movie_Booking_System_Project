package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage currStage = null;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/LogInScreen.fxml"));
        primaryStage.setTitle("Software Engineering Movie Booking System Project");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

        currStage = primaryStage;
    }

    public static Stage getStage() {
        return currStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
