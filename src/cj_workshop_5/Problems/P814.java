/*
 * File name: P814.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 5 (cj_workshop_5)
 * Date     : Mar 26 2014
 */

package cj_workshop_5.Problems;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author thienlh
 */
public class P814 {
    public void CurrencyFormat()    {
        double x = 123.8736418065130586134756;
        //  Default format
        System.out.println(x);
        NumberFormat nf1 = NumberFormat.getInstance();
        NumberFormat nf2 = NumberFormat.getCurrencyInstance();

        nf1.setMaximumFractionDigits(4);
        System.out.println(nf1.format(x));
        System.out.println(nf2.format(x));
        //  Format using locales
       Locale[] locs = {Locale.US, Locale.TAIWAN};
        for (Locale loc: locs) {
            System.out.format("%-5s", loc.getCountry());
            nf1 = NumberFormat.getInstance(loc);
            nf2 = NumberFormat.getCurrencyInstance(loc);
            System.out.println(nf1.format(x) + "\t");
            System.out.println(nf2.format(x));
        }
    }
}
