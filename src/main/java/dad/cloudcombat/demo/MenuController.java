package dad.cloudcombat.demo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class MenuController implements Initializable {

	public MenuController() {
		try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MenuView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	

	}
	

}
