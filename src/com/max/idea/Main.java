package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int n = 0;
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        int sum = 0;

        for(int i = 1; i <= n; i = i+2)
        {
            sum += i;
        }
        System.out.println(String.format("Сумма = %s ", sum));
    }
}
