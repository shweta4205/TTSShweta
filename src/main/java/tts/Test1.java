package tts;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 sa = new Test1();

		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Input number :" + i);
			int num1 = sc.nextInt();
			array[i] = num1;

		}
		sa.printArray(array);
		sa.sum(array);
	}

	public void printArray(int[] intArray) {
		System.out.print("The numbers in array are:");

		// To print all the elements in the array.
		for (int j = 0; j <= 4; j++) {

			System.out.print(intArray[j] + ",");

		}
		System.out.println("");
	}

	public int sum(int[] kabootar) {

		int i = 0;
		int sum = 0;
        
		int b = kabootar[0];
		int a = kabootar[0];

		for (i = 0; i < 5; i++) {
			sum = sum + kabootar[i];
			if (kabootar[i] > a) {

			} else {
				a = kabootar[i];

			}
			
			if (kabootar[i] < b) {

			} else {
				b = kabootar[i];

			}
		}
		System.out.println("print smallest value:" + a);
		
		System.out.println("print largest value:" + b);
		System.out.println("value of sum:" + sum);
		return sum;

	}
}
