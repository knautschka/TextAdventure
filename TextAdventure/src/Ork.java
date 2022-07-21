

public class Ork extends Monster {

	private String orkName;
	
	private int angriff;
	
	private int verteidigung;
	
	private int leben;
	
	private int positionSeitwaerts;
	private int positionObenUnten;
	
	

	public Ork(String orkName, int angriff, int verteidigung, int leben, int positionSeitwaerts, int positionObenUnten) {
		super();
		this.orkName = orkName;
		this.angriff = angriff;
		this.verteidigung = verteidigung;
		this.leben = leben;
		this.positionSeitwaerts = positionSeitwaerts;
		this.positionObenUnten = positionObenUnten;
	}

	public String getOrkName() {
		return orkName;
	}

	public void setOrkName(String orkName) {
		this.orkName = orkName;
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

	public int getLeben() {
		return leben;
	}

	public void setLeben(int leben) {
		this.leben = leben;
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
	
	public void wutanfall() {
		this.angriff = angriff + 10;
	}
	
	@Override
	public String toString() {
		return "Du triffst auf Ork " + orkName + ". " +
				orkName + " hat " + leben + " Leben, " +
				angriff + " Angriffskraft und " +
				verteidigung + " Verteidigungskraft.";
		
	}

}
