package flightTicketCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double distance, age, travelType, price, normalPrice;

		Scanner input = new Scanner(System.in);

		System.out.print("Yolculuk mesafesini giriniz (km): ");
		distance = input.nextDouble();
		System.out.print("Yolcunun yaşını giriniz: ");
		age = input.nextDouble();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
		travelType = input.nextDouble();
		normalPrice = distance * 0.10;
		price = normalPrice;

		if ((distance > 0 && age > 0) && (travelType == 1 || travelType == 2)) {
			if (age < 12) {
				if (travelType == 2) {
					normalPrice *= 2;
					price *= 2;
					price -= price * 0.20;
				}
				price -= price * 0.50;
			} else if (age >= 12 && age <= 24) {
				if (travelType == 2) {
					normalPrice *= 2;
					price *= 2;
					price -= price * 0.20;
				}
				price -= price * 0.10;
			} else if (age > 64) {

				if (travelType == 2) {
					normalPrice *= 2;
					price *= 2;
					price -= price * 0.20;
				}
				price -= price * 0.30;
			}
			System.out.println("Bilet Fiyati: " + normalPrice);
			System.out.print("Indirimli Bilet Fiyati: " + price);
		} else {
			System.out.println("Hatali giris yaptiniz!");
		}
	}

}
