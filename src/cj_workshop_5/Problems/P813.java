/*
 * File name: P813.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 5 (cj_workshop_5)
 * Date     : Mar 26 2014
 */

package cj_workshop_5.Problems;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author thienlh
 */
public class P813 {

    public void DatesFormatDemo()   {
        //  2 ways for getting the current day
        Date d1 = new Date(System.currentTimeMillis());
        Calendar c = Calendar.getInstance();
        Date d2 = c.getTime();
        //  Default format of a date value
        DateFormat df = DateFormat.getInstance();
        System.out.println(d1 + "\t" + d2);
        System.out.println(df.format(d1));
        //  Formatting a date using built-in locales
        c.set(2010, 3, 25);     //  Month from 0..11
        d1 = c.getTime();
        int[] style = {DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG, DateFormat.FULL};
        Locale[] locale = {Locale.US, Locale.ITALY, Locale.CHINA};

        for (Locale loc: locale) {
            System.out.format("%-5s", loc.getCountry());
            for (int x: style) {
            df = DateFormat.getDateInstance(x, loc);
                System.out.format("%-16s", df.format(d1));
            }
            System.out.println();
        }
    }
}
