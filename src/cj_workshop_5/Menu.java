/*
 * File name: Menu.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 5 (cj_workshop_5)
 * Date     : Mar 26 2014
 */
package cj_workshop_5;

import java.util.Scanner;

/**
 *
 * @author thienlh
 */
public class Menu {

    String[] hints;
    int n = 0;    //  current number of hints
    //  Constructer for creating menu with <size> elements

    Menu(int size) {
        if (size < 1) {
            size = 10;
        }
        hints = new String[size];
    }
    //  Adding a hints

    public void add(String newHints) {
        if (n < hints.length) {
            hints[n++] = newHints;
        }
    }
    //  Getting userChoice

    public int getChoice() throws Exception {
        int userChoice = 0; //  User choice value
        if (n > 0) {
            //  Print menut
            for (int i = 0; i < n; i++) {
                System.out.println("*    " + (i + 1) + ".         " + hints[i]);
            }
            System.out.println("*******************************************************************");
            System.out.print("-----> Please choose an option: ");
            //  Get user choice
            Scanner sc = new Scanner(System.in);
            userChoice = Integer.parseInt(sc.nextLine());

        }
        return userChoice;
    }
}
