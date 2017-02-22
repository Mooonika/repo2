package simple.application.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class RootController {

	@FXML
	private StackPane rootStackPane;

	@FXML
	void initialize() {
		loadMenuScreen();
	}

	public void loadMenuScreen() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/MenuScreen.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MenuController menuController = loader.getController();
		menuController.setRootController(this);
		setScreen(pane);
	}

	public void setScreen(Pane pane) {
		rootStackPane.getChildren().clear();
		rootStackPane.getChildren().add(pane);
	}

}
