import java.util.Random;
import java.util.Scanner;

public class TextAdventure {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Willkommen zum Text-Adventure!");

		Spieler spieler = new Spieler("", 10, 7, 5, 0, 0);

		System.out.println("Sagt mir... Wie ist euer Name?");

		spieler.setSpielerName(input.next());

		System.out.println("Dies sind nun eure Charakterwerte:");
		System.out.println(spieler);

		for (spieler.getLeben(); spieler.getLeben() > 0; spieler.setLeben(spieler.getLeben())) {

			Skelett skelett = new Skelett("Alfred", 5, 2, 10, 3, 0);
			Ork ork = new Ork("Hannes", 8, 4, 10, 4,3);
			
			System.out.println("In welche Richtung möchtest du gehen?");
			System.out.println("1: Geradeaus, 2: Nach links, 3: Nach rechts, 4: Rückwärts");
			int spielerRichtung = input.nextInt();
			
			if(!(spieler.getPositionObenUnten() <= -25 || spieler.getPositionObenUnten() >= 25 || spieler.getPositionSeitwaerts() <= -25 || spieler.getPositionSeitwaerts() >= 25)) {
				if(spielerRichtung == 1) {
					spieler.setPositionObenUnten(spieler.getPositionObenUnten() - 1);
					System.out.println("Geht geradeaus.");
				} else if(spielerRichtung == 2) {
					spieler.setPositionSeitwaerts(spieler.getPositionSeitwaerts() - 1);
					System.out.println("Geht nach links.");
				} else if(spielerRichtung == 3) {
					spieler.setPositionSeitwaerts(spieler.getPositionSeitwaerts() + 1);
					System.out.println("Geht nach rechts.");
				} else if(spielerRichtung == 4) {
					spieler.setPositionObenUnten(spieler.getPositionObenUnten() + 1);
					System.out.println("Geht zurück.");
				}
			} else {
				System.out.println("Du kannst nicht mehr in diese Richtung gehen, weil das Gebiet hier zu Ende ist.");
			}
			
			
			//TODO: wieder löschen, das hier ist nur ein Test für die Gehfunktion
			System.out.println("Du befindest dich nun an Koordinate x: " + spieler.getPositionSeitwaerts() + " y: " + spieler.getPositionObenUnten());


			if (skelett.getPositionObenUnten() == spieler.getPositionObenUnten()
					&& skelett.getPositionSeitwaerts() == spieler.getPositionSeitwaerts()) {
				System.out.println(skelett);
				System.out.println("Was möchtest du tun?");
				System.out.println("1: Kämpfen, 2: Fliehen");
				int spielerAktion = input.nextInt();
				if (spielerAktion == 1) {
					// Kämpfen
					for (skelett.getLeben(); skelett.getLeben() > 0; skelett
							.setLeben(skelett.getLeben() - spieler.getAngriff() + skelett.getVerteidigung())) {
						System.out.println(spieler.getSpielerName() + " greift an. Fügt " + skelett.getSkelettName()
								+ " " + (spieler.getAngriff() - skelett.getVerteidigung()) + " Schaden zu.");
						spieler.setLeben(spieler.getLeben() + spieler.getVerteidigung() - skelett.getAngriff());
						System.out.println(skelett.getSkelettName() + " greift an. Fügt " + spieler.getSpielerName()
								+ " " + (skelett.getAngriff() - spieler.getVerteidigung()) + " Schaden zu.");
						System.out.println("Möchtest du weiterkämpfen?");
						System.out.println("1: Weiterkämpfen, 2: Fliehen");
						spielerAktion = input.nextInt();
						if (spielerAktion == 1) {
							System.out.println("Die nächste Kampfrunde beginnt.");
						} else if (spielerAktion == 2) {
							System.out.println("Du bist geflohen.");
							break;
						} else {
							System.out.println("Das war keine korrekte Eingabe.");
						}
					}
					
					if(spieler.getLeben() <= 0) {
						System.out.println(spieler.getSpielerName() + " wurde besiegt. Er geht traurig nach Hause.");
					}
					
					if (skelett.getLeben() <= 0) {
						System.out.println(spieler.getSpielerName() + " hat " + skelett.getSkelettName() + " besiegt.");
					}
				} else if (spielerAktion == 2) {
					System.out.println("Du bist geflohen.");
				} else {
					System.out.println("Das war keine korrekte Eingabe.");
				}
			}
			
			if (ork.getPositionObenUnten() == spieler.getPositionObenUnten()
					&& ork.getPositionSeitwaerts() == spieler.getPositionSeitwaerts()) {
				System.out.println(ork);
				System.out.println("Was möchtest du tun?");
				System.out.println("1: Kämpfen, 2: Fliehen");
				int spielerAktion = input.nextInt();
				if (spielerAktion == 1) {
					// Kämpfen
					for (ork.getLeben(); ork.getLeben() > 0; ork
							.setLeben(ork.getLeben() - spieler.getAngriff() + ork.getVerteidigung())) {
						System.out.println(spieler.getSpielerName() + " greift an. Fügt " + ork.getOrkName()
								+ " " + (spieler.getAngriff() - ork.getVerteidigung()) + " Schaden zu.");
						spieler.setLeben(spieler.getLeben() + spieler.getVerteidigung() - ork.getAngriff());
						System.out.println(ork.getOrkName() + " greift an. Fügt " + spieler.getSpielerName()
								+ " " + (ork.getAngriff() - spieler.getVerteidigung()) + " Schaden zu.");
						
						Random rand = new Random();
						int wahrscheinlichkeit = rand.nextInt(100);
						
						if(wahrscheinlichkeit >= 80) {
							ork.wutanfall();
							System.out.println("Der Ork hat einen Wutanfall. Seine Angriffskraft beträgt nun " + ork.getAngriff());
						}
						
						System.out.println("Möchtest du weiterkämpfen?");
						System.out.println("1: Weiterkämpfen, 2: Fliehen");
						spielerAktion = input.nextInt();
						if (spielerAktion == 1) {
							System.out.println("Die nächste Kampfrunde beginnt.");
						} else if (spielerAktion == 2) {
							System.out.println("Du bist geflohen.");
							break;
						} else {
							System.out.println("Das war keine korrekte Eingabe.");
						}
					}
					
					if(spieler.getLeben() <= 0) {
						System.out.println(spieler.getSpielerName() + " wurde besiegt. Er geht traurig nach Hause.");
					}
					
					if (ork.getLeben() <= 0) {
						System.out.println(spieler.getSpielerName() + " hat " + ork.getOrkName() + " besiegt.");
					}
				} else if (spielerAktion == 2) {
					System.out.println("Du bist geflohen.");
				} else {
					System.out.println("Das war keine korrekte Eingabe.");
				}
			}

		}

	}

}
