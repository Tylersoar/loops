package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++){
            for(int j = 0; j < input; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
