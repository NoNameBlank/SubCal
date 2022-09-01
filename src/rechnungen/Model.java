package rechnungen;

public class Model {

	public void berechne(String inputIP, String inputHost) {
		
		String ipAdresse;
		String hostAnzahl;
				
		System.out.println("Ausgabe in berechne(): " + inputIP);
		System.out.println("Ausgabe in berechne(): " + inputHost);

		
		String ipBinaer =ipInBinaer(inputIP);
		System.out.println("Ausgabe in berechne ipBinaer" + inputIP);
		System.out.println("Hier sollte Theoretisch >Test< angezeigt werden da es das Ergebnis der Umrechnung wäre :" + ipBinaer);
	}

//Berechnung IP in Binaer

	private String ipInBinaer(String ipAdresse) {

		System.out.println("Ausgabe in ipInBinaer" + ipAdresse);
		ipAdresse = "Test";
		return ipAdresse;
	}

}
