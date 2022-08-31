package view.calc;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcPanel extends JPanel {

	private JButton btnBerrechne;
	// Eingaben
	private JTextField ipEingabe;
	private JTextField hostEingabe;
	// Ausgaben
	private JTextField ergErsteIP;
	private JTextField ergLetzIp;
	private JTextField ergBroadCast;
	private JTextField ergSubnetzmaske;
	private JTextField ergKlasse;
	private JTextField ergHost;
	private JTextField ergMoeglSub;

	public JButton getBtnBerrechne() {
		return btnBerrechne;
	}

	public void setBtnBerrechne(JButton btnBerrechne) {
		this.btnBerrechne = btnBerrechne;
	}

	public JTextField getIpEingabe() {
		return ipEingabe;
	}

	public void setIpEingabe(JTextField ipEingabe) {
		this.ipEingabe = ipEingabe;
	}

	public JTextField getHostEingabe() {
		return hostEingabe;
	}

	public void setHostEingabe(JTextField hostEingabe) {
		this.hostEingabe = hostEingabe;
	}

	public JTextField getErgErsteIP() {
		return ergErsteIP;
	}

	public void setErgErsteIP(JTextField ergErsteIP) {
		this.ergErsteIP = ergErsteIP;
	}

	public JTextField getErgLetzIp() {
		return ergLetzIp;
	}

	public void setErgLetzIp(JTextField ergLetzIp) {
		this.ergLetzIp = ergLetzIp;
	}

	public JTextField getErgBroadCast() {
		return ergBroadCast;
	}

	public void setErgBroadCast(JTextField ergBroadCast) {
		this.ergBroadCast = ergBroadCast;
	}

	public JTextField getErgSubnetzmaske() {
		return ergSubnetzmaske;
	}

	public void setErgSubnetzmaske(JTextField ergSubnetzmaske) {
		this.ergSubnetzmaske = ergSubnetzmaske;
	}

	public JTextField getErgKlasse() {
		return ergKlasse;
	}

	public void setErgKlasse(JTextField ergKlasse) {
		this.ergKlasse = ergKlasse;
	}

	public JTextField getErgHost() {
		return ergHost;
	}

	public void setErgHost(JTextField ergHost) {
		this.ergHost = ergHost;
	}

	public JTextField getErgMoeglSub() {
		return ergMoeglSub;
	}

	public void setErgMoeglSub(JTextField ergMoeglSub) {
		this.ergMoeglSub = ergMoeglSub;
	}

	public CalcPanel() {

		setLayout(null);
		super.setBounds(0, 0, 1024, 768);
		super.setBackground(Color.WHITE);
		super.setOpaque(true);

		this.setBtnBerrechne(new JButton("Berrechne"));
		this.getBtnBerrechne().setBounds(519, 111, 163, 40);
		super.add(this.getBtnBerrechne());

		JLabel einIpAdresse = new JLabel("IP-Adressebereich eingeben: ");
		einIpAdresse.setBounds(93, 88, 163, 40);
		super.add(einIpAdresse);

		JLabel einHost = new JLabel("Host je Subnetz eingeben: ");
		einHost.setBounds(113, 126, 143, 40);
		super.add(einHost);
		
		JLabel ausErsteIp = new JLabel("Erste IP-Adresse des Subnetz: ");
		ausErsteIp.setBounds(84, 295, 172, 32);
		super.add(ausErsteIp);

		JLabel ausLetzIp = new JLabel("Letzte nutzbare IP-Adresse des Subnetz: ");
		ausLetzIp.setBounds(33, 328, 206, 32);
		super.add(ausLetzIp);
		
		JLabel ausBroadcast = new JLabel("Broadcast Adresse des Subnetz: ");
		ausBroadcast.setBounds(74, 365, 182, 32);
		super.add(ausBroadcast);
		
		JLabel ausSubnetzmaske = new JLabel("Subnetzmaske: ");
		ausSubnetzmaske.setBounds(93, 414, 163, 32);
		super.add(ausSubnetzmaske);
		
		JLabel ausKlasse = new JLabel("Klasse: ");
		ausKlasse.setBounds(475, 289, 54, 32);
		super.add(ausKlasse);
		
		JLabel ausAnzahlHost = new JLabel("Anzahl der Host: ");
		ausAnzahlHost.setBounds(449, 326, 91, 32);
		super.add(ausAnzahlHost);
		
		JLabel ausAnzahlSub = new JLabel("Anzahl der Subnetze: ");
		ausAnzahlSub.setBounds(442, 365, 124, 32);
		super.add(ausAnzahlSub);
		
		this.setIpEingabe(new JTextField("000.000.000.000"));
		this.getIpEingabe().setBounds(266,98,128,20);
		super.add(this.getIpEingabe());
		
		this.setHostEingabe(new JTextField("0"));
		this.getHostEingabe().setBounds(266,131,36,20);
		super.add(this.getHostEingabe());
		
		this.setErgErsteIP(new JTextField("000.000.000.000"));
		this.getErgErsteIP().setBounds(266,301,128,20);
		this.getErgErsteIP().setEditable(false);
		super.add(this.getErgErsteIP());
		
		this.setErgLetzIp(new JTextField("000.000.000.000"));
		this.getErgLetzIp().setBounds(276,334,128,20);
		this.getErgLetzIp().setEditable(false);
		super.add(this.getErgLetzIp());
		
		this.setErgBroadCast(new JTextField("000.000.000.000"));
		this.getErgBroadCast().setBounds(266,371,128,20);
		this.getErgBroadCast().setEditable(false);
		super.add(this.getErgBroadCast());
		
		this.setErgSubnetzmaske(new JTextField("000.000.000.000"));
		this.getErgSubnetzmaske().setBounds(266,420,143,20);
		this.getErgSubnetzmaske().setEditable(false);
		super.add(this.getErgSubnetzmaske());
		
		this.setErgKlasse(new JTextField("0"));
		this.getErgKlasse().setBounds(542,295,24,20);
		this.getErgKlasse().setEditable(false);
		super.add(this.getErgKlasse());
		
		this.setErgHost(new JTextField("0"));
		this.getErgHost().setBounds(550,334,24,20);
		this.getErgHost().setEditable(false);
		super.add(this.getErgHost());
		
		this.setErgMoeglSub(new JTextField("0"));
		this.getErgMoeglSub().setBounds(576,371,30,20);
		this.getErgMoeglSub().setEditable(false);
		super.add(this.getErgMoeglSub());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
