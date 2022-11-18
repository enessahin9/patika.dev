package weatherProposal;

public class Main {

	public static void main(String[] args) {
		int weather = 30;
		if (weather <= 5) {
			System.out.println("Kayak yapmalisin.");
		} else if (weather > 5 && weather <= 15) {
			System.out.println("Sinemaya gidebilirsin.");
		} else if (weather > 15 && weather <= 25) {
			System.out.println("Tam pikniklik hava!");
		} else {
			System.out.println("Bu sicakta yuzmelisin :)");
		}
	}

}
