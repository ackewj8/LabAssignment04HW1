/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229lab04hw1;
import java.util.Scanner;

/**
 *
 * @author willi
 * GitHub Link: https://github.com/ackewj8/LabAssignment04HW1.git
 */
public class CSC229Lab04HW1 {
    public static void helloWorld(int n) { // helloWorld function
        if (n <= 0) { // If n is 0 or a negative value
            // Notifies that the procedure has finished
            System.out.println("Procedure finished.");
        }
        else {
            // Printing "Hello World!"
            System.out.println("Hello World!");
            helloWorld(n - 1); // Recursion
        }
    }
    public static void main(String[] args) {
        // Used to read how many time the user wants "Hello World!" printed
        Scanner scnr = new Scanner(System.in);
        int n; // How many times "Hello World!" is printed
        System.out.println("How many times do you want Hello World printed?: ");
        n = scnr.nextInt(); // Assigning n the value of the user's input
        helloWorld(n); // Printing "Hellow World!" n times recursively
    }
}
