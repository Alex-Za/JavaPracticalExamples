package formater;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterExample {
    public void dateTest() {
        Formatter fmt = new Formatter();
        Calendar calendar = Calendar.getInstance();

        fmt.format("%tr", calendar);
        System.out.println(fmt);

        fmt = new Formatter();
        fmt.format("%tc", calendar);
        System.out.println(fmt);

        fmt = new Formatter();
        fmt.format("%tl:%tM", calendar, calendar);
        System.out.println(fmt);

        fmt = new Formatter();
        fmt.format("%tB %tb %tm", calendar, calendar, calendar);
        System.out.println(fmt);

        fmt = new Formatter();
        fmt.format("Today is day %te of %<tB, %<tY", calendar);
        System.out.println(fmt);
    }

    public void nTest() {
        Formatter formatter = new Formatter();
        formatter.format("Copy file%nTransfer finished on %d%%", 88);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("|%10.2f|", 123.123);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("|%-10.2f|", 123.123);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%,.2f", 4356783497.32);
        System.out.println(formatter);
    }

    public void testArgumentIndexing() {
        Formatter formatter = new Formatter();
        formatter.format("%3$d %1$d %2$d", 10, 20, 30);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("Number %d in 16-th format equals %1$x", 255);
//        formatter.format("Number %d in 16-th format equals %<x", 255); or
        System.out.println(formatter);
    }
}
