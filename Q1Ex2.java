/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;

import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Higher or Lower! What will you do?");
        System.out.println("- Start game");
        System.out.println("- Change settings");
        System.out.println("- End application");
        System.out.println("\nYou will... ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int random = (int) Math.floor(Math.random()*10)+1;
        System.out.println(random);
        
        int guess = 4;
        
        System.out.printf("You have %d guess(es) left. What is your guess?", guess);
        input = sc.nextLine();
        
    }
    
}
