package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Entry> ents = Entry.populate();

        showAll(ents);
        showAllFunc(ents);

        showTuesdays(ents);
        showTuesdaysFunc(ents);

        countTWTh(ents);
        countTWThFunc(ents);

        weekends(ents);
        weekendsFunc(ents);

        weekdays(ents);
        weekdaysFunc(ents);
    }

    //showAll - in For Loop
    public static void showAll(List<Entry> ents) {
        System.out.println("\n\nenhanced for loop -> showAll ");
        for (Entry e : ents) {
            System.out.print(e + ", \n");
        }
    }

    // showall . functional
    public static void showAllFunc(List<Entry> ents) {
        System.out.println("\n\n Functional --> showAll ");
        ents
                .stream()
                .forEach(e -> System.out.print(e + ", \n"));
    }

    //showTuesdays - 4 loop
    public static void showTuesdays(List<Entry> ents) {
        System.out.println("\n\nenhanced for loop --> showTuesdays");
        for (Entry e : ents) {
            if (e.getDay() == Day.TUESDAY) {
                System.out.print(e + ", \n");
            }
        }
    }

    // show Tuesdays - functional
    public static void showTuesdaysFunc(List<Entry> ents) {
        System.out.println("\n\n func --> show Tuesdays");
        ents
                .stream()
                .filter(e -> e.getDay() == Day.TUESDAY)
                .forEach(e -> System.out.println(e));
    }

    //countTWTh
    public static void countTWTh(List<Entry> ents) {
        System.out.println("\n\nenhanced for loop --> countTWTh ");
        int count = 0;
        for (Entry e : ents) {
            if (e.getDay() == Day.TUESDAY || e.getDay() == Day.WEDNESDAY ||
                    e.getDay() == Day.THURSDAY) {
                ++count;
            }
        }
        System.out.println("Entries from T/W/Th = " + count);
    }

    //countTWTh func
    public static void countTWThFunc(List<Entry> ents) {
        System.out.println("\n\n functional --> count TWTh ");
        long count = ents
                .stream()
                .filter(e -> e.getDay() == Day.TUESDAY || e.getDay() == Day.WEDNESDAY || e.getDay() == Day.THURSDAY)
                .count();
        System.out.println("Entries from TWTh " + count);
    }

    //weekends 4 loop
    public static List<Entry> weekends(List<Entry> ents) {
        List<Entry> weekends = new ArrayList<>();
        System.out.println("\n\nenhanced for loop  --> weekends ");
        for (Entry e : ents) {
            if (e.getDay() == Day.SATURDAY || e.getDay() == Day.SUNDAY) {
                weekends.add(e);
            }
        }
        System.out.println(weekends);
        return weekends;
    }

    //weekends functional
    public static List<Entry> weekendsFunc(List<Entry> ents) {
        System.out.println("\n\n functional -->  Weekends ");

        List<Entry> weekends = ents
                .stream()
                .filter(e -> e.getDay() == Day.SATURDAY || e.getDay() == Day.SUNDAY)
                .collect(Collectors.toList());
        System.out.println(weekends);

        return weekends;
    }

    //weekdays 4 loop
    public static Set<Entry> weekdays(List<Entry> ents) {
        Set<Entry> weekdays = new HashSet<>();
        System.out.println("\n\nenhanced for loop  --> weekdays ");
        for (Entry e : ents) {
            if (e.getDay() != Day.SATURDAY || e.getDay() != Day.SUNDAY) {
                weekdays.add(e);
            }
        }
        System.out.println(weekdays);
        return weekdays;
    }

    //weekdays Functional
    public static Set<String> weekdaysFunc(List<Entry> ents) {
        System.out.println("\n\n functional -->  Weekdays ");
        Set<String> weekdaysNotes = ents
                .stream()
                .filter(e -> e.getDay() != Day.SATURDAY || e.getDay() != Day.SUNDAY)
                .map(e -> e.getNote())
                .collect(Collectors.toSet());
        System.out.println(weekdaysNotes);
        return weekdaysNotes;
    }
}


