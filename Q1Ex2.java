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
        Scanner sc = new Scanner(System.in);
        String input ;
        int range = 10;
        int min = 1;
        int guesses = 3;
        do {
            System.out.println("Welcome to Higher or Lower! What will you do?");
            System.out.println("- Start game");
            System.out.println("- Change settings");
            System.out.println("- End application");
            System.out.println("\nYou will... ");

            input = sc.nextLine();
            switch(input) {
                case "Start game":
                    String repeat;
                    do {
                    int random = (int) Math.floor(Math.random()*range)+min;
                    for(int remaining = guesses; remaining > 0; remaining--) {
                        System.out.printf("You have %d guess(es) left. What will you do?", remaining);
                        int answer = Integer.parseInt(sc.nextLine());
                        if (answer == random) {
                            System.out.println("Congratulations! You win!");
                            break;
                        } else if (answer < random) {
                            System.out.printf("Guess higher! You have %d guess(es) left. What will you do?", remaining);
                        } else if (answer > random) {
                            System.out.printf("Guess lower! You have %d guess(es) left. What will you do?", remaining);
                        } else if (answer != random) {
                            System.out.println("You lose...");
                            break;
                        }
                    }         
                    
                    System.out.println("Do you want to play again? (y/n)");
                    repeat = sc.nextLine();
                    } while(repeat.equals("y"));
                    break;
            }
        } while(!input.equalsIgnoreCase("End application"));
        
        
        
       
        
    }
    
}
