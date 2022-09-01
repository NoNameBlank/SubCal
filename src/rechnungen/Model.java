package rechnungen;

public class Model {

	public void berechne(String inputIP, String inputHost) {

		
		System.out.println("Ausgabe in berechne(): " + inputIP);
		//System.out.println("Ausgabe in berechne(): " + inputHost);
		String ip ="192.168.0.1";
		//String split[] = StringUtils.split(ip, ".";)
		//String[] arrOfIp = ip.split(".");
		//for (String ausgabe : arrOfIp)
			//System.out.println("Ausgabe nach dem String geteilt wurde " + ausgabe);
		
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
