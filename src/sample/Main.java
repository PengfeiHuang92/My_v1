package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //link fxml file to out layout
        GridPane layout = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //setting the layout title
        primaryStage.setTitle("Hello World");

        button = new Button("Click me");
        button.setOnAction(this);

        layout.getChildren().add(button);
        primaryStage.setScene(new Scene(layout, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button)
            System.out.println("Message..");
    }
}
