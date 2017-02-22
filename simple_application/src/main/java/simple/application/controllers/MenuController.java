package simple.application.controllers;

import java.io.IOException;

import com.sun.media.jfxmediaimpl.platform.Platform;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class MenuController {

	private RootController rootController;

	@FXML
	public void openApplication() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/ApplicationScreen.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		ApplicationController applicationController = loader.getController();
		applicationController.setRootController(rootController);
		rootController.setScreen(pane);
	}

	@FXML
	public void openOptions() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fxml/OptionsScreen.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		OptionsController optionsController = loader.getController();
		optionsController.setRootController(rootController);
		rootController.setScreen(pane);
	}

	@FXML
	public void exit() {
		Platform.exit();
		//System.exit(0);
	}

	public void setRootController(RootController rootController) {
		this.rootController = rootController;
	}

}
