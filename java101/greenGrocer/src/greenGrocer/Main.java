package greenGrocer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5.0;

		System.out.print("Armut Kaç Kilo? : ");
		double armutKilo = inp.nextDouble();

		System.out.print("Elma Kaç Kilo? : ");
		double elmaKilo = inp.nextDouble();

		System.out.print("Domates Kaç Kilo? : ");
		double domatesKilo = inp.nextDouble();

		System.out.print("Muz Kaç Kilo? : ");
		double muzKilo = inp.nextDouble();

		System.out.print("Patlican Kaç Kilo? : ");
		double patlicanKilo = inp.nextDouble();

		double toplam = 
				(armut * armutKilo) + 
				(elma * elmaKilo) + 
				(domates * domatesKilo) + 
				(muz * muzKilo) + 
				(patlican * patlicanKilo);
		
		System.out.println("Toplam Ucret : " + toplam);

	}

}
