/*
 *  UCF COP3330 Fall 2021 Assignment 1.10 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App
{
    static final double TAXRATE = 0.055;
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the price of item 1: "); //Asking for user input
        double price1 = x.nextInt(); //Storing user input
        System.out.print("Enter the quantity of item 1: ");
        double num1 = x.nextInt();

        System.out.print("Enter the price of item 2: "); //Asking for user input
        double price2 = x.nextInt(); //Storing user input
        System.out.print("Enter the quantity of item 2: ");
        double num2 = x.nextInt();

        System.out.print("Enter the price of item 3: "); //Asking for user input
        double price3 = x.nextInt(); //Storing user input
        System.out.print("Enter the quantity of item 3: ");
        double num3 = x.nextInt();

        double total1 = price1*num1; //Calculating totals/taxes
        double total2 = price2*num2;
        double total3 = price3*num3;
        double subtotal = total1+total2+total3;
        double taxtotal = subtotal * TAXRATE;
        double finaltotal = subtotal + taxtotal;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, taxtotal,finaltotal);

    }
}