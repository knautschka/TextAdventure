
public class Skelett extends Monster {

	private String skelettName;
	
	private int angriff;
	
	private int verteidigung;
	
	private int leben;
	
	private int positionSeitwaerts;
	private int positionObenUnten;
	
	

	public Skelett(String skelettName, int angriff, int verteidigung, int leben, int positionSeitwaerts, int positionObenUnten) {
		super();
		this.skelettName = skelettName;
		this.angriff = angriff;
		this.verteidigung = verteidigung;
		this.leben = leben;
		this.positionSeitwaerts = positionSeitwaerts;
		this.positionObenUnten = positionObenUnten;
	}

	public String getSkelettName() {
		return skelettName;
	}

	public void setSkelettName(String skelettName) {
		this.skelettName = skelettName;
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
	
	@Override
	public String toString() {
		return "Du triffst auf Skelett " + skelettName + ". " +
				skelettName + " hat " + leben + " Leben, " +
				angriff + " Angriffskraft und " +
				verteidigung + " Verteidigungskraft.";
		
	}

}
