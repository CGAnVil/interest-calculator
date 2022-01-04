package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double inMoney, interestMoney,interestRate, totalMoney;
    int  month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input money:");
        inMoney = sc.nextDouble();
        System.out.println("Enter months:");
        month = sc.nextInt();
        System.out.println("Enter interest rate:");
        interestRate = sc.nextDouble();
        interestMoney = inMoney *(interestRate/100)/12*month;
        totalMoney = inMoney + interestMoney;
        System.out.printf("Total of interest : %.2f",interestMoney);
        System.out.printf("Total of money : %.2f",totalMoney);
    }
}
