package rechnungen;

public class Model {

	public void berechne(String[] arrdata) {

		String inputIP = arrdata[0];
		String anzahlHost = arrdata[1];
		
		System.out.println("IP Ausgabe: " + inputIP);
		System.out.println("Host Ausgabe:" + anzahlHost);
		
		//System.out.println("Ausgabe in berechne(): " + inputHost);
		
		//UserEingabe wird ip übergeben und gesplittet
		
		//String split[] = ip.split(".");
		String[] arrOfIp = inputIP.split("\\.");
		for(int i = 0; i < arrOfIp.length; i++) {
			System.out.println(arrOfIp[i]);
		}
		
		//String ipBinaerErgebnis = ipInBinaer(inputIP);
		//System.out.println("Ausgabe in berechne ipBinaer" + inputIP);
		//System.out.println("Hier sollte Theoretisch >Test< angezeigt werden da es das Ergebnis der Umrechnung wäre :"
			//	+ ipBinaerErgebnis);
	}

	// Berechnung IP in Binaer
	private String ipInBinaer(String ipAdresse) {

		System.out.println("Ausgabe in ipInBinaer" + ipAdresse);
		ipAdresse = "Test";
		return ipAdresse;
	}

}
