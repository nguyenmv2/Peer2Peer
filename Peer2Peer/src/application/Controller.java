package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class Controller {
	
	@FXML
	MenuBar topMenu;
	
	@FXML
	VBox centerVBox;
	
	@FXML
	VBox bottomVBox;
	
	@FXML
	VBox buttonsVBox;
	
	@FXML
	HBox messageAndButtonsHBox;
	
	@FXML
	Label statusLabel;
	
	@FXML
	Button sendButton;
	
	@FXML
	Button attachFilesButton;
	
	@FXML
	TextArea messageTextArea;
	
	public Controller(){}

}
