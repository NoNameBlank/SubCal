package controller;

import java.awt.event.ActionEvent;

import rechnungen.Model;
import view.MainView;

public class MainController {

	private MainView mainView;
	private Model model;

	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public MainController() {

		this.setMainView(new MainView());
		this.setModel(new Model());

		this.getMainView().addActionListenerToBtnBerrechne(this::startBerechnung);

	}

	private void startBerechnung(ActionEvent e) {
		String[] input = this.getMainView().getDataFromInputfieldIpHost();
		
	
		this.getModel().berechne(input);
		
	}

}
