

public class Auto {
		// Attribute = Zustand
		String marke;
		String modell;
		String seriennummer;
		int kW;
		int hubRaum;
		int anzahlSitze;
		String anzahlSitzeN="Sitzplätze: nicht bekannt";
		double tankVolumen;
		double verbrauch;
		double reichweite;
		
		
	
		// Methoden = Fähigkeiten

		void druckeMarkeUndModell() {
			System.out.println(marke + " " + modell);
			System.out.println("Seriennummer: " + seriennummer);
			if 
				(anzahlSitze == 0) {
				System.out.println(anzahlSitzeN);
			}
			else {
			System.out.println("Sitzplätze: " + anzahlSitze);
			}}
		//Tank 100l, 10l/km -> Reichweite 100l/10l= 10l Verbrauch // 10l Verbrauch * 100l Tank = 1000km Reichweite // Reichweite=tankVolumen/Verbrauch*100
		void berechneReichweite() {
			reichweite = (tankVolumen/verbrauch*100);
			reichweite = (int)reichweite;	
			}
		
		void druckeReichweite() {
			System.out.println("Verbrauch: " + verbrauch + "/100km");
			System.out.println(tankVolumen + " l Tankvolumen");
			System.out.println(reichweite + " km Reichweite");
			System.out.println();
			}
		
		 void druckeInfo() {
			 druckeMarkeUndModell();
			 berechneReichweite();
			 druckeReichweite();
			 System.out.println(); 
		 }
		
		
		
		
		
		
		
}
