package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Driver {

    public static GoldRateInfo loadGoldRateDetails() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        return (GoldRateInfo) context.getBean("rateInfoObj");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the carat:");
        int carat = scanner.nextInt();

        System.out.println("Enter Total Grams:");
        double grams = scanner.nextDouble();

        GoldRateInfo goldRateInfo = loadGoldRateDetails();
        //total rate 
        double totalRate = goldRateInfo.calculateGoldRate(carat, grams);

        System.out.println("Total Gold Rate is Rs:" + totalRate);

        scanner.close();
    }
}
