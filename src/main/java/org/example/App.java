/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        //Tax rate is 5.5%
        double taxRate = 0.055;

        Scanner items = new Scanner(System.in);
        Scanner quantity = new Scanner(System.in);

        System.out.println("Price of item 1: ");
        double item1 = items.nextDouble();
        System.out.println("Quantity of item 1: ");
        int quantity1 = quantity.nextInt();

        System.out.println("Price of item 2: ");
        double item2 = items.nextDouble();
        System.out.println("Quantity of item 2: ");
        int quantity2 = quantity.nextInt();

        System.out.println("Price of item 3: ");
        double item3 = items.nextDouble();
        System.out.println("Quantity of item 3: ");
        int quantity3 = quantity.nextInt();

        double total1 = item1 * quantity1;
        double total2 = item2 * quantity2;
        double total3 = item3 * quantity3;

        double subtotal = total1 + total2 + total3;
        double tax = subtotal * taxRate;
        double totalFinal = subtotal + tax;

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", totalFinal);
    }
}
