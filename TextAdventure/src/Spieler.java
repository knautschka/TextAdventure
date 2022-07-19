
public class Spieler {

	private String spielerName;
	private int leben;
	private int angriff;
	private int verteidigung;
	private int positionSeitwaerts;
	private int positionObenUnten;
	
	
	public Spieler(String spielerName, int leben, int angriff, int verteidigung, int positionSeitwaerts, int positionObenUnten) {
		this.spielerName = spielerName;
		this.leben = leben;
		this.angriff = angriff;
		this.verteidigung = verteidigung;
		this.positionSeitwaerts = positionSeitwaerts;
		this.positionObenUnten = positionObenUnten;
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

	public int getPositionSeitwaerts() {
		return positionSeitwaerts;
	}

	public void setPositionSeitwaerts(int positionSeitwaerts) {
		this.positionSeitwaerts = positionSeitwaerts;
	}

	public int getPositionObenUnten() {
		return positionObenUnten;
	}


	public void setPositionObenUnten(int positionObenUnten) {
		this.positionObenUnten = positionObenUnten;
	}

	@Override
	public String toString() {
		return "Charaktername: " + spielerName + ", Leben: " + leben + ", Angriffskraft: " + angriff + ", Verteidigungskraft: "
				+ verteidigung;
	}
	
	
	
}
