/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1ex2;

import java.util.Scanner;

/**
 *
 * @author Eris
 */
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int lower, upper, guessNo, remaining;
        int range = 10;
        int min = 1;
        int guess = 3;
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
                        for(remaining = guess; remaining > 0; remaining--) {
                            System.out.printf("You have %d guess(es) left. Enter a number.", remaining);
                            int answer = Integer.parseInt(sc.nextLine());
                                if (remaining > 1 && answer == random) {
                                    System.out.println("Congratulations! You win!");
                                    break;
                                } else if (remaining >1 && answer < random) {
                                    System.out.printf("Guess higher! ");
                                    continue;
                                } else if (remaining > 1 && answer > random) {
                                    System.out.printf("Guess lower! ");
                                    continue;
                                } else if (remaining > 0 && answer != random) {
                                    System.out.println("You lose...");
                                    break;
                                }
                        }        
                    System.out.println("Do you want to play again? (y/n)");
                    repeat = sc.nextLine();
                    if ("n".equals(repeat)) {
                        System.exit(0);
                    }
                    } while(repeat.equalsIgnoreCase("y"));
                    break;
                    
                  
                case "Change settings":
                    System.out.println("What is the lower limit of the random number?");
                    lower = sc.nextInt();
                    System.out.println("What is the upper limit of the random number?");
                    upper = sc.nextInt();
                    System.out.println("How many guesses are allowed?");
                    guessNo = sc.nextInt();
                    
                    min = lower;
                    range = upper;
                    guessNo = guess; 
            }
        } while(!input.equalsIgnoreCase("End application"));
        
        
        
       
        
    }
    
}