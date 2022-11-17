package vucutKitleIndeksi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double boy, kg, sonuc;
		Scanner inp = new Scanner(System.in);

		System.out.print("Lutfen Boyunuzu Giriniz (Metre cinsinden) : ");
		boy = inp.nextDouble();

		System.out.print("Lutfen Kilonuzu Giriniz (Kg cinsinden) : ");
		kg = inp.nextDouble();

		sonuc = kg / (boy * boy);
		System.out.print("Vucut Kitle Indeksiniz : " + sonuc);
	}

}
