import java.util.Scanner;

public class TextAdventure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Willkommen zum Text-Adventure!");

		Spieler spieler = new Spieler("", 10, 7, 5, 0, 0, 0, 0);
		
		System.out.println("Sagt mir... Wie ist euer Name?");
		
		spieler.setSpielerName(input.next());
		
		System.out.println("Dies sind nun eure Charakterwerte:");
		System.out.println(spieler);
		
		/* Skelett skelett = new Skelett("Alfred", 5, 2, 3, 3, 0, 0, 0);
		
		System.out.println("Ein Skelett erscheint.");
		
		
		System.out.println("Skelett greift an mit einer Angriffsstärke von " + skelett.getAngriff());
		System.out.println(spieler.getSpielerName() + " hat einen Verteidigungswert von " + spieler.getVerteidigung());
		
		if(spieler.getVerteidigung() >= skelett.getAngriff()) {
			System.out.println("Der Angriff vom Skelett konnte nichts ausrichten.");
		} else {
			spieler.setLeben(spieler.getLeben() + spieler.getVerteidigung() - skelett.getAngriff());
			System.out.println("Das Skelett hat getroffen. " + spieler.getSpielerName() + " hat jetzt noch " + spieler.getLeben() + " Leben.");
		} */
		
		
		
		
	}

}
