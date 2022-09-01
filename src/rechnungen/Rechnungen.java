package rechnungen;

import view.calc.CalcPanel;

public class Rechnungen extends CalcPanel {

	public Rechnungen() {
		
		
		String ipEingabe;
		int ipEingabeZahl;
		
		ipEingabe = getIpEingabe().getText();
		//ipEingabeZahl = Integer.parseInt(ipEingabe);
		System.out.println("Klasse: Rechnungen      ipEingabeTextfield Ausgabe: " + ipEingabe);
		//System.out.println("Ip als int : " + ipEingabeZahl);
		
		
		
		
		int z1 = 5;
		int z2 = 5;
		int erg;
		
		erg = z1+z2;
		
		System.out.println("Erg lautet :" +erg);
		
		
	}
}
