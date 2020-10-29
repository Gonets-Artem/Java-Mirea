package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == -1) {
                break;
            }
            graph.work(a);
        }
    }
}