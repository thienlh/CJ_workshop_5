/*
 * File name: Main.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 5 (cj_workshop_5)
 * Date     : Mar 26 2014
 */
package cj_workshop_5;

import cj_workshop_5.Problems.P812;
import cj_workshop_5.Problems.P813;
import cj_workshop_5.Problems.P814;
import java.util.Scanner;

/**
 *
 * @author thienlh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// TODO code application logic here
        String contine = "y"; //  Prompt user for continue or quit program
        do {
            Menu menu = new Menu(5);
            menu.add("Text Formation.                                   *");
            menu.add("Date Formation.                                   *");
            menu.add("Currency Formation.                               *");
            menu.add("Quit.                                             *");
            int userChoice = 0;
            do {
                System.out.println("*******************************************************************");
                System.out.println("*                     FORMATION IN JAVA                           *");
                System.out.println("*******************************************************************");
                try {
                    userChoice = menu.getChoice();
                } catch (Exception ex) {
                    System.out.println("\n---------------------------WRONG INPUT!----------------------------\n\t+ Option must be an integer number!\n");
                    userChoice = 5;
                }
                switch (userChoice) {
                    case 1:
                        P812 p1 = new P812();
                        p1.formatTextDemo();
                        break;
                    case 2:
                        P813 p2 = new P813();
                        p2.DatesFormatDemo();
                        break;
                    case 3:
                        P814 p3 = new P814();
                        p3.CurrencyFormat();
                        break;
                }
            } while (userChoice >= 1 && userChoice < 4);
            System.out.print("-----> Do you want to QUIT? (Y/n): ");
            Scanner sc = new Scanner(System.in);
            contine = sc.nextLine();
        } while (contine.substring(0, 1).equalsIgnoreCase("n"));
        System.out.println("\n--------------------HAVE A NICE DAY. GOODBYE!----------------------");
    }
}
