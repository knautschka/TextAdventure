
public class Spieler {

	private String spielerName;
	private int leben;
	private int angriff;
	private int verteidigung;
	private int positionLinks;
	private int positionRechts;
	private int positionGeradeaus;
	private int positionRueckwaerts;
	
	
	public Spieler(String spielerName, int leben, int angriff, int verteidigung, int positionLinks, int positionRechts, int positionGeradeaus, int positionRueckwaerts) {
		this.spielerName = spielerName;
		this.leben = leben;
		this.angriff = angriff;
		this.verteidigung = verteidigung;
		this.positionLinks = positionLinks;
		this.positionRechts = positionRechts;
		this.positionGeradeaus = positionGeradeaus;
		this.positionRueckwaerts = positionRueckwaerts;
	}
	
	
	public String getSpielerName() {
		return spielerName;
	}
	public void setSpielerName(String spielerName) {
		this.spielerName = spielerName;
	}
	public int getLeben() {
		return leben;
	}
	public void setLeben(int leben) {
		this.leben = leben;
	}
	public int getAngriff() {
		return angriff;
	}
	public void setAngriff(int angriff) {
		this.angriff = angriff;
	}
	public int getVerteidigung() {
		return verteidigung;
	}
	public void setVerteidigung(int verteidigung) {
		this.verteidigung = verteidigung;
	}

	
	
	public int getPositionLinks() {
		return positionLinks;
	}


	public void setPositionLinks(int positionLinks) {
		this.positionLinks = positionLinks;
	}


	public int getPositionRechts() {
		return positionRechts;
	}


	public void setPositionRechts(int positionRechts) {
		this.positionRechts = positionRechts;
	}


	public int getPositionGeradeaus() {
		return positionGeradeaus;
	}


	public void setPositionGeradeaus(int positionGeradeaus) {
		this.positionGeradeaus = positionGeradeaus;
	}


	public int getPositionRueckwaerts() {
		return positionRueckwaerts;
	}


	public void setPositionRueckwaerts(int positionRueckwaerts) {
		this.positionRueckwaerts = positionRueckwaerts;
	}


	@Override
	public String toString() {
		return "Charaktername: " + spielerName + ", Leben: " + leben + ", Angriffskraft: " + angriff + ", Verteidigungskraft: "
				+ verteidigung;
	}
	
	
	
}
