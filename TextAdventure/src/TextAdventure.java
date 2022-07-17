import java.util.Scanner;

public class TextAdventure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Willkommen zum Text-Adventure!");

		Spieler spieler = new Spieler("", 0, 0, 0);
		
		System.out.println("Sagt mir... Wie ist euer Name?");
		
		spieler.setSpielerName(input.next());
		spieler.setLeben(10);
		spieler.setAngriff(7);
		spieler.setVerteidigung(5);
		
		System.out.println("Dies sind nun eure Charakterwerte:");
		System.out.println(spieler);
		
	}

}
