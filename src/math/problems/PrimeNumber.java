package math.problems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		System.out.println("give the number :");
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		isPrime(number);

	}
	static boolean isPrime(int n)
	{
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)

			if (n % i == 0){


				return false;
			}

		return true;

	}

}
