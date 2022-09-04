package rechnungen;

public class Model {

	public void berechne(String[] arrdata) {

		String inputIP = arrdata[0];
		String anzahlHost = arrdata[1];

		System.out.println("IP Ausgabe: " + inputIP);
		System.out.println("Host Ausgabe:" + anzahlHost);

		String[] arrOfIp = inputIP.split("\\.");
		String[] arrIfIpNullen = null;
		String binOfIp;
		String binOfIpNull; // mit 0 aufgefüllt

		int[] ipZahl = new int[arrOfIp.length];

		for (int i = 0; i < arrOfIp.length; i++) {
			System.out.println(arrOfIp[i]);

		}

		System.out.println("Ausgabe stelle [0] arrOfIp String " + arrOfIp[0]);
		System.out.println("Ausgabe stelle [1] arrOfIp String " + arrOfIp[1]);
		System.out.println("Ausgabe stelle [2] arrOfIp String " + arrOfIp[2]);
		System.out.println("Ausgabe stelle [3] arrOfIp String " + arrOfIp[3]);

		for (int i = 0; i < arrOfIp.length; i++) {
			ipZahl[i] = Integer.parseInt(arrOfIp[i]);
			binOfIp = Integer.toBinaryString(ipZahl[i]);
			System.out.println("IP in Binaer: " + binOfIp);

			// 0 aufüllen

			binOfIpNull = String.format("%8s", binOfIp).replaceAll(" ", "0"); // Pro Oktate 8 Bit
			System.out.println("IP in Binaer mit 0 aufgefuellt: " + binOfIpNull);

			for (int ii = 0; ii < arrOfIp.length; ii++) {
					arrIfIpNullen[i] = binOfIpNull;
				
			}

		}

		// Die IP wurde in die 4 Okteten gesplittet
		// Nächster Schritt die in einen Binary String zu konvertieren

	}

	// Berechnung IP in Binaer
	private String ipInBinaer(String ipAdresse) {

		System.out.println("Ausgabe in ipInBinaer" + ipAdresse);
		ipAdresse = "Test";
		return ipAdresse;
	}

}
