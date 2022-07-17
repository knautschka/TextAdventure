
public class Spieler {

	private String spielerName;
	private int leben;
	private int angriff;
	private int verteidigung;
	
	
	
	public Spieler(String spielerName, int leben, int angriff, int verteidigung) {
		super();
		this.spielerName = spielerName;
		this.leben = leben;
		this.angriff = angriff;
		this.verteidigung = verteidigung;
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


	@Override
	public String toString() {
		return "Charaktername: " + spielerName + ", Leben: " + leben + ", Angriffskraft: " + angriff + ", Verteidigungskraft: "
				+ verteidigung;
	}
	
	
	
}
