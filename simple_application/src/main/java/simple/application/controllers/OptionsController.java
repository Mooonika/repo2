package simple.application.controllers;

import javafx.fxml.FXML;

public class OptionsController {

	private RootController rootController;
	
	@FXML
	public void backMenu() {
		rootController.loadMenuScreen();
	}
	
	public void setRootController(RootController rootController) {
		this.rootController = rootController;
	}

}
