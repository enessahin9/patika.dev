package sortingNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the first number: ");
		double firstNumber = scanner.nextDouble();

		System.out.print("Please enter the second number: ");
		double secondNumber = scanner.nextDouble();

		System.out.print("Please enter the third number: ");
		double thirdNumber = scanner.nextDouble();

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println("Number " + firstNumber + " is the biggest number.");
			if (secondNumber > thirdNumber) {
				System.out.println("Number " + secondNumber + " is the median number.");
				System.out.println("Number " + thirdNumber + " is the smallest number.");
			} else {
				System.out.println("Number " + thirdNumber + " is the median number.");
				System.out.println("Number " + secondNumber + " is the smallest number.");
			}
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println("Number " + secondNumber + " is the biggest number.");
			if (firstNumber > thirdNumber) {
				System.out.println("Number " + firstNumber + " is the median number.");
				System.out.println("Number " + thirdNumber + " is the smallest number.");
			} else {
				System.out.println("Number " + thirdNumber + " is the median number.");
				System.out.println("Number " + firstNumber + " is the smallest number.");
			}
		} else {
			System.out.println("Number " + thirdNumber + " is the biggest number.");
			if (firstNumber > secondNumber) {
				System.out.println("Number " + firstNumber + " is the median number.");
				System.out.println("Number " + secondNumber + " is the smallest number.");
			} else {
				System.out.println("Number " + secondNumber + " is the median number.");
				System.out.println("Number " + firstNumber + " is the smallest number.");
			}
		}
	}

}
