package tts;

import java.util.HashMap;
import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sh = sc.nextLine();

		HashMap<String, String> cardealer = new HashMap<String, String>();
		// Add keys and values (model, Car)
		cardealer.put("civic", "honda");
		cardealer.put("crv", "honda");
		cardealer.put("corolla", "toyata");

		System.out.println(cardealer.get(sh));


		if (cardealer.get(sh) == null) {
		
			System.out.println("Oh, you’re looking for a " + sh + "? sorry i do not have it...");

		}
		else {
			System.out.println("Oh, you’re looking for a " + sh + "? Our " + cardealer.get(sh) + " selection is right over here...");

		}
			
	}
}
