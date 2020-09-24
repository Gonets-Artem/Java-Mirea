package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] area = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                area[i][j] = in.nextInt();
                //area[i][j] = (int)(Math.random() * 20 - 10);
            }
        }
        // для рандомного ввода
//        for (int i = 0; i < N; i++) {
//            System.out.print("| ");
//            for (int j = 0; j < N; j++) {
//                System.out.print(area[i][j] + " | ");
//            }
//            System.out.println();
//        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 && j != 0) {
                    area[i][j] += area[i][j-1];
                }
                else if (i != 0 && j == 0) {
                    area[i][j] += area[i-1][j];
                }
                else if (i != 0 && j != 0) {
                    if (area[i][j-1]>area[i-1][j]) {
                        area[i][j] += area[i][j-1];
                    }
                    else {
                        area[i][j] += area[i-1][j];
                    }
                }
            }
        }
        System.out.println(area[N-1][N-1]);
    }
}