package edu.mukul;

import java.util.Scanner;

public class MaxOcurredInt {
// http://www.geeksforgeeks.org/maximum-occurred-integer-n-ranges/
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); // Reading from System.in

		int l1 = 1, r1 = 15;
		int l2 = 4, r2 = 8;
		int l3 = 9, r3 = 12;
		int l4 = 21, r4 = 20;
		// min n max;
		int min, max;
		if (l1 < l2 && l1 < l3 && l1 < l4)
			min = l1;
		else if (12 < l3 && l2 < l4)
			min = l2;
		else if (l3 < l4)
			min = l3;
		else
			min = l4;
		System.out.println("min" + min);
		if (r1 > r2 && r1 > r3 && r1 > r4)
			max = r1;
		else if (r2 > r3 && r2 > r4)
			max = r2;
		else if (r3 > r4)
			max = r3;
		else
			max = r4;
		System.out.println("max" + max);
		int[] arr = new int[max + 1];
		String result = "";
		int count_max = 0;
		for (int i = min; i <= max; i++) {
			// System.out.println(i);
			if (i >= l1 && i <= r1)
				arr[i]++;

			if (i >= l2 && i <= r2)
				arr[i]++;
			if (i >= l3 && i <= r3)
				arr[i]++;
			if (i >= l4 && i <= r4)
				arr[i]++;
			if (arr[i] > count_max)
				count_max = arr[i];

		}
		for (int i = min; i <= max; i++) {
			if (arr[i] == count_max)
				System.out.println("ans" + i);

		}

	}

}
