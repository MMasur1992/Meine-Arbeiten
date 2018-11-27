import java.util.Scanner;
public class Eingaben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String meinText = "Beispiel Text";
		System.out.println(meinText); */
		
		Scanner derScanner = new Scanner(System.in);
		/*
		//String meineEingabe = Eingabe von der Konsole übernehmen
		System.out.print("Bitte Eingabe: ");
		String meineEingabe = derScanner.nextLine();
		// Scanner wartet auf Eingabe und Enter
		System.out.println("Unsere Eingabe lautet: " + meineEingabe);
		
		System.out.print("Bitte Eingabe: ");
		int meineZahl = derScanner.nextInt(); // ACHTUNG, DA ZAHL AUSGEGEBEN WIRD nextINT!!!!
		System.out.println("Unsere Zahl lautet: " + meineZahl);
		
		
		System.out.print("Bitte geben Sie ihre Zahl ein: ");
		int meineZahl2 = derScanner.nextInt();
		System.out.print("Die Quadratzahl von  "+ meineZahl2 + " lautet: " +  meineZahl2 * meineZahl2);
		
		System.out.print("Bitte die erste Zahl eingeben: ");
		long zahl1 = derScanner.nextLong();
		System.out.print("Bitte die nächste Zahl eingeben: ");
		long zahl2 = derScanner.nextLong();
		System.out.println("Das Ergebnis ist " + (zahl1 + zahl2));
		
		
		
		float zahl1 = derScanner.nextFloat();
		float zahl2 = derScanner.nextFloat();
		System.out.println(zahl1/zahl2);
		
		
		//Char eingeben
		System.out.print("Zeichen einlesen ");
		char meinZeichen = derScanner.next().charAt(0); //charAt(0) bedeutet, dass die 0te (erste) Stelle der eingabe ausgegeben wird
		System.out.println("Das Zeichen lautet " + meinZeichen);*/
		
		
		// Eingabe Zahl1, Auswahl Operator, Eingabe Zahl2, Ausgabe Ergebnis
		System.out.println("Taschenrechner");
		System.out.print("Bitte erste Zahl eingeben: ");
		double zahl1 = derScanner.nextDouble();
		System.out.print("Bitte Rechenart auswählen: +, -, *, /, %: ");
		char operator = derScanner.next().charAt(0);
		System.out.print("Bitte zweite Zahl eingeben: ");
		double zahl2 = derScanner.nextDouble();
		
		switch(operator) {
		
		case '+': {
			System.out.println("Das Ergebnis ist " + (zahl1 + zahl2));
			break;
		}
		
		case '-': {
			System.out.println("Das Ergebnis ist " + (zahl1 - zahl2));
			break;
		}
		
		case '*': {
			System.out.println("Das Ergebnis ist " + (zahl1 * zahl2));	
			break;
		}
		
		case '/': {
			System.out.println("Das Ergebnis ist " + (zahl1 / zahl2));
			break;
		}
		
		case '%': {
			System.out.println("Das Ergebnis ist " + (zahl1 % zahl2));
			break;
		}	
		
		default: {
			System.out.println("Operator nicht definiert!");}
		}
		
		
		
		
		
		
		
		
		
		
	derScanner.close();
	}

}
