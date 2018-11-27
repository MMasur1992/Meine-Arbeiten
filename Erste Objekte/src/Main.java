import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		
		auto1.marke = "Audi";
		auto1.modell = "A6";
		auto1.seriennummer ="S3R13NNUMM3R";
		auto1.tankVolumen = 70;
		auto1.verbrauch = 11;
		
		
		auto2.marke = "Mercedes";
		auto2.modell = "SLS AMG";
		auto2.seriennummer ="S3R13NNUMM3R";
		auto2.tankVolumen = 85;
		auto2.verbrauch = 13;
		
		
		auto3.marke ="BMW";
		auto3.modell = "3er";
		auto3.anzahlSitze = 3;
		auto3.seriennummer ="S3R13NNUMM3R";
		auto3.tankVolumen = 60;
		auto3.verbrauch = 7;
		
		/*System.out.println(auto1.marke + " " + auto1.modell + " " + auto1.seriennummer);
		System.out.println(auto2.marke + " " + auto2.modell);
		System.out.println(auto3.marke + " " + auto3.modell + " " + auto3.anzahlSitze);
		System.out.println(auto1.marke + " " + auto1.modell);*/
		
		/*auto1.druckeMarkeUndModell();
		auto2.druckeMarkeUndModell();
		auto3.druckeMarkeUndModell();*/
		/*auto1.druckeMarkeUndModell();
		auto1.berechneReichweite();
		auto1.druckeReichweite();
		
		auto2.druckeMarkeUndModell();
		auto2.berechneReichweite();
		auto2.druckeReichweite();
		
		auto3.druckeMarkeUndModell();
		auto3.berechneReichweite();
		auto3.druckeReichweite();*/
		
		auto1.druckeInfo();
		auto2.druckeInfo();
		auto3.druckeInfo();
		
		
		
		
	}

}
