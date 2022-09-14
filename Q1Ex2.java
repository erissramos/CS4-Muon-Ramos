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
        
        System.out.println("Welcome to Higher or Lower! What will you do?");
        System.out.println("- Start game");
        System.out.println("- Change settings");
        System.out.println("- End application");
        System.out.println("\nYou will... ");
        String response = sc.nextLine();

        int random = (int) Math.floor(Math.random()*10)+1;
        int guess = 5;
        int answer = -1;
        
        boolean start = (response.equalsIgnoreCase("Start game"));
        boolean options = (response.equalsIgnoreCase("Change settings"));
        boolean exit = (response.equalsIgnoreCase("End application"));
        
        boolean playAgain = true;
        
        if (start == true) {
            while (answer != random) {
                System.out.printf("You have %d guess(es). What is your guess?", guess);
                answer = sc.nextInt();
                System.out.println(random);

                if (answer == random) {
                    System.out.println("You got it!");
                    break;
                } else if (answer < random) {
                    guess--;
                    System.out.printf("Guess higher! You have %d guess(es) left. What is your guess?", guess);
                } else if (answer > random) {
                    guess--;
                    System.out.printf("Guess lower! You have %d guess(es) left. What is your guess?", guess);
                } else if (answer!=random) {
                    System.out.println("You lose...");
                }
            }
        } else if (options == true) {
            System.out.println("What is the lower limit of the random number?");
            String lower = sc.nextLine();
            System.out.println("What is the upper limit of the random number?");
            String upper = sc.nextLine();
            System.out.println("How many guesses are allowed?");
            String guessNo = sc.nextLine();
            System.out.printf("\nLower limit: %s", lower);
            System.out.printf("\nUpper limit: %s", upper);
            System.out.printf("\nGuesses: %s", guessNo);

        } else if (exit == true) {
            System.out.println("Thank you for playing");
            return;
        }
        System.out.println("Play again? (y/n)");
        String repeat = sc.nextLine();
        if (repeat.equalsIgnoreCase("\ny")) {
            playAgain = true;
        } else if (repeat.equalsIgnoreCase("\nn")) {
            playAgain = false;
        }
    }
}
