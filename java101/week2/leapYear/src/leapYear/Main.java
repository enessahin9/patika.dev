package leapYear;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year;
		boolean status = true;
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl giriniz : ");
		year = input.nextInt();
		if (year % 4 == 0) {

			if (year % 100 == 0 && year % 400 != 0) {
				status = false;
			} else {
				status = true;
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println(year + " bir artik yildir !");
		} else {
			System.out.println(year + " bir artik yil degildir !");
		}

	}

}
