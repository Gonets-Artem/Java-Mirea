package com.company;

import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		
		int[] a = new int[]{4, 6, 2, 8, 12, 43, 6, 3, 7, 4};
		int sum = 0;

		// пункт 3, for
		for (int i = 0; i < 10; i++) {
			sum += a[i];
		}
		System.out.println(sum);

		// пункт 3, while
		int i = 0;
		sum = 0;
		while (i != 10) {
			sum += a[i];
			i++;
		}
		System.out.println(sum);

		// пункт 3, do-while
		i = 0;
		sum = 0;
		do {
			sum += a[i];
			i++;
		} while (i != 10);
		System.out.println(sum);


		// пункт 4 командная строка
		for (i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}


		// пункт 5 гармонический ряд
		for (i = 1; i <= 10; i++) {
			System.out.printf("%.3f", (double) 1 / i);
			System.out.print(" ");
		}


		// пункт 6 Math
		int size = (int) (Math.random() * 10) + 1;
		int[] mat = new int[size];
		for (int z = 0; z < size; z++) {
			mat[z] = (int) (Math.random() * 50);
		}
		for (int i1 = 0; i1 < size - 1; i1++) {
			for (int i2 = i1 + 1; i2 < size; i2++) {
				if (mat[i1] > mat[i2]) {
					int t = mat[i1];
					mat[i1] = mat[i2];
					mat[i2] = t;
				}
			}
		}

		for (i = 0; i < size; i++) {
			System.out.print(mat[i] + " ");
		}

		// пункт 6 Random
		Random r = new Random();
		size = r.nextInt(10) + 1;
		mat = new int[size];
		for (i = 0; i < size; i++) {
			mat[i] = (int)(r.nextInt(50) + 1);
		}
		for (int i1 = 0; i1 < size - 1; i1++) {
			for (int i2 = i1 + 1; i2 < size; i2++) {
				if (mat[i1] > mat[i2]) {
					int t = mat[i1];
					mat[i1] = mat[i2];
					mat[i2] = t;
				}
			}
		}
		for (i = 0; i < size; i++) {
			System.out.print(mat[i] + " ");
		}


		// пункт 7 факториал
		System.out.println();
		System.out.print(factorial((int)(Math.random()*20)+1));

	}
	
	public static int factorial(int N) {
		int res = 1;
		for (int i = 1; i <= N; i++) {
			res *= i;
		}
		return res;
	}
}
