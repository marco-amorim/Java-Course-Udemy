package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button btClick;

	
	@FXML
	public void onBtClickAction() {
		System.out.println("Click!");
	}

}
