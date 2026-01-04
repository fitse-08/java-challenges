/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter1_challenge1_1;

/**
 *
 * @author fitse
 */


import java.util.Scanner;

public class Chapter1_Challenge1_1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int digits = (int) Math.log10(number) + 1;
        int lastDigit = number % 10;
        int firstDigit = (int) (number / Math.pow(10, digits - 1));
        int secondDigit = (number / (int)Math.pow(10, digits - 2)) % 10;
        int secondLastDigit = (number / 10) % 10;

        int product = firstDigit * lastDigit;
        int sum = secondDigit + secondLastDigit;
        String code = product + "" + sum;

        System.out.println("The decrypted code is: " + code);
    }
}