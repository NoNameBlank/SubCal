package rechnungen;

import view.calc.CalcPanel;

public class Rechnungen extends CalcPanel {

	public Rechnungen() {
		
		
		String ipEingabe;
		
		ipEingabe = getIpEingabe().getText();
		System.out.println("Klasse: Rechnungen      ipEingabeTextfield Ausgabe: " + ipEingabe);
		
		
		
		
		
		int z1 = 5;
		int z2 = 5;
		int erg;
		
		erg = z1+z2;
		
		System.out.println("Erg lautet :" +erg);
		
		
	}
}
