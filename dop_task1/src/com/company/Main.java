package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner in = new Scanner(System.in);
	    int N = in.nextInt();

		// через закономерность прибавления вариантов от количества сдачи
		int sum = 1, plus = 1;
		for (int i = 1; i <= N; i++) {
			if (i == 3 || i == 5 || i == 6) {
				sum++;
			}
			else if ((i-1) % 15 == 0 || (i-2) % 15 == 0 || (i-4) % 15 == 0 || (i-7) % 15 == 0) {
				sum += plus - 1;
			}
			else if (i % 15 == 0) {
				plus++;
				sum += plus;
			}
			else {
				sum += plus;
			}
			System.out.println("N = " + i + ": sum = " + sum);
		}
		//System.out.println("N = " + N + ": " + sum);


	    // полным перебором возможных значений
	    int k1 = 1, k3 = 3, k5 = 5, count = 0;
	    for (int i = 0; i <= N; i++) {
	    	for (int j = 0; j <= N / 3; j++) {
	    		for (int k = 0; k <= N / 5; k++) {
	    			if (i * k1 + j * k3 + k * k5 == N) {
	    				count++;
	    			}
	    		}
	    	}
		}
		System.out.println("N = " + N + ": " + count);
    }
}