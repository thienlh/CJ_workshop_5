/*
 * File name: P812.java
 * Author   : Le Hung Thien
 * ID       : SE61374
 * Class    : SE0865
 * Subject  : Core Java
 * Project  : Workshop 5 (cj_workshop_5)
 * Date     : Mar 26 2014
 */

package cj_workshop_5.Problems;

import java.util.Formatter;
/**
 *
 * @author thienlh
 */

//  FormattingTextDemo
public class P812 {
    public void formatTextDemo()    {
        StringBuilder sb = new StringBuilder(); //  Storing results
        Formatter f = new Formatter(sb);
        boolean bvar = false;
        double x = 5.2;

        f.format("The result is %b %f.", bvar, x);
        System.out.println(sb);
        System.out.format("The result is %b %f.\n", bvar, x);
        sb.delete(0, sb.length());  //  Clear old result

        f.format("%1$20s%3$10b%2$10.2f", "The result is: ",x, bvar);
        System.out.println(sb);
        sb.delete(0, sb.length());  //  Clear old result
        f.format("%1$-20s%3$10b%2$10.2f", "The result is: ", x, bvar);
        System.out.println(sb);
    }
}
