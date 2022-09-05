package rechnungen;

import java.util.Arrays;

public class Model {

	private int bitFest;

	public int getBitFest() {
		return bitFest;
	}

	public void setBitFest(int bitFest) {
		this.bitFest = bitFest;
	}

	public void berechne(String[] arrdata) {

		String inputIP = arrdata[0];
		String anzahlHost = arrdata[1];

		System.out.println("IP Ausgabe: " + inputIP);
		System.out.println("Host Ausgabe:" + anzahlHost);

		String[] arrOfIp = inputIP.split("\\.");
		String[] arrOfIpNullen = new String[4];
		String binOfIp;
		String binOfIpNull; // mit 0 aufgefüllt
		String netzwerkMase;
		
		int bitMax = 32;
		int host;
		int subnetMaske;
		int[] ipZahl = new int[arrOfIp.length];

		host = Integer.parseInt(anzahlHost);
		host = host + 2; // NetzAdresse + BroadCoast
		//System.out.println("Host Anzahl Eingabe + 2 = " + host);

		// Schauen wie viele Bits man braucht

		int bitNetz = Bits(host);
		int bitHost = host;
		bitNetz = bitMax - bitNetz;
		
		//Ausgabe für Netzwerk
		this.setBitFest(bitNetz);		
		System.out.println("Feste Bits: " + this.getBitFest());
		//Gibt aus wie oft 
		bitNetz =((+bitNetz / +8));
		System.out.println("Modula 28  8 wie oft passt die 8 Rein? : " + bitNetz);
		for(int i =0; i > bitNetz; i++) {
			
			//subnetMaske
			
		}
		

		// int bitFest = Bits(host);
		// bitFest = bitMax- bitFest;
		// System.out.println("Feste Bits: " + bitFest);
		
		
		
/*
		for (int i = 0; i < arrOfIp.length; i++) {
			System.out.println(arrOfIp[i]);

		}
*/

		
		
		
//		System.out.println("Ausgabe stelle [0] arrOfIp String " + arrOfIp[0]);
//		System.out.println("Ausgabe stelle [1] arrOfIp String " + arrOfIp[1]);
//		System.out.println("Ausgabe stelle [2] arrOfIp String " + arrOfIp[2]);
//		System.out.println("Ausgabe stelle [3] arrOfIp String " + arrOfIp[3]);

	/*
		for (int i = 0; i < arrOfIp.length; i++) {
			ipZahl[i] = Integer.parseInt(arrOfIp[i]);
			binOfIp = Integer.toBinaryString(ipZahl[i]);
			System.out.println("IP in Binaer: " + binOfIp);

			// 0 aufüllen

			binOfIpNull = String.format("%8s", binOfIp).replaceAll(" ", "0"); // Pro Oktate 8 Bit

			System.out.println("IP in Binaer mit 0 aufgefuellt: " + binOfIpNull);
			
			//Arrays.fill(arrOfIpNullen, binOfIpNull);
			arrOfIpNullen[i] = binOfIpNull;
			
			
		}
		*/
		//System.out.println("Ausgabe von der IP in Binaer: " + Arrays.toString(arrOfIpNullen));

		// Die IP wurde in die 4 Okteten gesplittet
		// Nächster Schritt die in einen Binary String zu konvertieren

	}

	private int Bits(int bit) {
		
		//System.out.println("Bit(); ausgabe bit" + bit);
		double log = Double.valueOf(bit);
		double ergebnis;
		//System.out.println("Wurzel als DOuble: " + log);

		log = (Math.log(log) / Math.log(2));
		//System.out.println("log2 ausgabe als Komma zahl: " + log);

		log = Math.ceil(log);
		//System.out.println("log2  aufgerundet und in ergebnis gepeichert : " + log);

		bit = (int) Math.round(log);

		return bit;

	}

	// Berechnung IP in Binaer
	private String ipInBinaer(String ipAdresse) {

		System.out.println("Ausgabe in ipInBinaer" + ipAdresse);
		ipAdresse = "Test";
		return ipAdresse;
	}

}
