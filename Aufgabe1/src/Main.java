
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Literangabe 
		double eingabe=0.0001;
		int ausgabe;
		if (eingabe>=1.0) {
			ausgabe=(int)eingabe;
			System.out.println(ausgabe+"l");
		}
		
		else if (eingabe <1.0 && eingabe >=0.1) {
			ausgabe=(int)(eingabe * 100);
			System.out.println(ausgabe +"cl");
		}
		
		else if (eingabe >=0.001 && eingabe <0.1) {
			ausgabe=(int)(eingabe * 1000);
			System.out.println(ausgabe +"ml");
		}
		//Gerade/Ungrade Test
	
		int Eingabe = 26;
		if ((Eingabe%2)==0) {
			System.out.println("Zahl ist grade");		
		}
		else if ((Eingabe%2)==1) {
			System.out.println("Zahl ist ungrade");
		}
		
		//Telefonat Menue
		
		int menue1 = 3;
		int menue2 = 2;
		
			if (menue1 == 1) {System.out.println("Oeffnungszeiten");}
		else if (menue1 == 2) {System.out.println("Anschrift");}
		else if (menue1 == 3) {System.out.println("Termine");	
			if (menue2 == 0) {System.out.println("Hauptmenue");	}
			else if (menue2 == 1) {System.out.println("Termin vereinbaren");}
			else if (menue2 == 2) {	System.out.println("Termin absagen");}
			else if (menue2 == 3) {System.out.println("Mitarbeiter sprechen");}			
		}
			
			//Schleifen
			
			
		for (int i = 1; i<=9; i++) //Hauptschleife - i = 1 weil wir i ausgeben (hauptschleife erzeugte Zeile)
		{
			for (int j = 1; j<=i; j++) //Unterschleife - j = 1 und wird solange erhöht bis j genauso groß wie i (Unterschleife erzeugt die Spalten)
			{
				System.out.print(i);
			}
			System.out.println();
		}
			
			
		// Schachbrett
		boolean setlinespace=false;
		 int breite=2;
		 int laenge=2;
		 
		for (int a = 0; a < laenge; a++)
		{
			for (int b = 1; b <= breite; b++)
			{
				if (setlinespace == false) {System.out.print("# ");
				if (b == breite) {setlinespace = true;}
				}
				
				else if (setlinespace == true) {System.out.print(" #");
				if (b == breite) {setlinespace = false;}
			}
				
			}
		System.out.println();
	
	
		//int laenge = 10;
		//int breite = 10;
		//for (int a = 0; a <= laenge; a++) {
		//	for(int j = 1; j <= breite; j++) {System.out.println("#");
		//	if(a % 2 == 0) {
		//		System.out.println("# # # # # # # #");
		//	}
		//	else System.out.println(" # # # # # # # #");
		//}}
			
			
			
			
			
		}
		
			
			
			
			
			
			
			
			
			
			
			
		
	}
}
