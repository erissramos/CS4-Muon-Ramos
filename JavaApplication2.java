/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Eris
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Classmate 1: ");
        String cName1 = "Aaron"; 
        int cAge1 = 14;
        String favSubject1 = "Math";
        System.out.printf("Name: %s %n Age: %s %n Favorite Subject: %s", cName1, cAge1, favSubject1);
        
        System.out.println("\n\nClassmate 2: ");
        String cName2 = "Patrick";
        int cAge2 = 15;
        String favSubject2 = "Physics";
        System.out.printf("Name: %s %n Favorite Subject: %s %n Age: %s", cName2, cAge2, favSubject2);
        
        System.out.println("\n\nClassmate 3: ");
        String cName3 = "Rael";
        int cAge3 = 16;
        String favSubject3 = "Chemistry";
        System.out.printf("Name: %s %n Favorite Subject: %s %n Age: %s", cName3, cAge3, favSubject3);
        
        int sum = cAge1 + cAge2 + cAge3;
        int avg = sum/3;
        System.out.println("\n\n\nThe average of my classmates' ages is " + avg);
        
        if (favSubject2 == "Physics") {
            System.out.println("Patrick's favorite subject is Physics: true");
        }
        else {
            System.out.println("Patrick's favorite subjects is Physics: false");
        }
        
        if (cAge1 < cAge3) {
            System.out.println("Rael is older than Aaron");
        }
        else {
            System.out.println("Aaron is older than Rael");
        }
        
    }
   
}
