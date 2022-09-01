package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.calc.CalcPanel;

public class MainView extends JFrame {

	private CalcPanel calcPanel;

	public CalcPanel getCalcPanel() {
		return calcPanel;
	}

	public void setCalcPanel(CalcPanel calcPanel) {
		this.calcPanel = calcPanel;
	}

	public MainView() {

		super.setBounds(0, 0, 1024, 768);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setCalcPanel(new CalcPanel());
		super.add(this.getCalcPanel());
		

		super.setVisible(true);

	}

	public void addActionListenerToBtnBerrechne(ActionListener al) {
		this.getCalcPanel().addActionListenerToBtnBerrechne(al);
		
	}
	
	
}
