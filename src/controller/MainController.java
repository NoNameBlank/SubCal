package controller;

import java.awt.event.ActionEvent;

import rechnungen.Rechnungen;
import view.MainView;

public class MainController {
	
	private MainView mainView;
	
	
	
	
	
	public MainView getMainView() {
		return mainView;
	}





	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}





	public MainController(){
		
		this.setMainView(new MainView());
		
		this.getMainView().addActionListenerToBtnBerrechne(this::startBerechnung);
		
	}

	private void startBerechnung(ActionEvent e) {
		new Rechnungen();
	}
	
	
	
	
}
