package View;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application
{

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		primaryStage.setTitle("Nick Name");
		primaryStage.setScene(new Scene(root, 320, 200));
		primaryStage.setResizable(false);
		primaryStage.show();

		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>()
		{
			@Override
			public void handle(WindowEvent event)
			{
				System.exit(3333);
			}
		});
	}


	public static void main(String[] args)
	{
		launch(args);
	}
}
