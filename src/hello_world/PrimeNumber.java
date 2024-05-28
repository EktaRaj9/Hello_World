package hello_world;

import java.io.*;
import java.util.Scanner;

public class PrimeNumber {

	boolean isPrime(int n) {
		boolean flag = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		
		Scanner s = new Scanner(System.in); // int n = 12;
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		

			if (pn.isPrime(n)) {
				System.out.println(n + " is a prime number");
			} else {
				System.out.println(n + " is not a prime number");
			}
		}
	}

