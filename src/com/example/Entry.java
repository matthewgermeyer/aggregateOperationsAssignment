package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MattyG on 5/2/17.
 */
public class Entry {
    private Day day;
    private String note;

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public void printEntry(){
        System.out.println("Entry{\" +\n" +
                "        \"day=\" + day +\n" +
                "                \", note='\" + note + '\\'' +\n" +
                "                '}');");
    }

    @Override
    public String toString() {
        return "Entry{" +
                "day=" + day +
                ", note='" + note + '\'' +
                '}';
    }


    public static List<Entry> populate(){
        List<Entry> ents = new ArrayList<>();

        Entry entry = new Entry();
        entry.setDay(Day.MONDAY);
        entry.setNote("notes.. here ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.TUESDAY);
        entry.setNote("footie's on!.. ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.TUESDAY);
        entry.setNote("No fixtures :( ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.WEDNESDAY);
        entry.setNote("notes.. ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.THURSDAY);
        entry.setNote("ughhhh.. ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.FRIDAY);
        entry.setNote("Weekend.. ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.THURSDAY);
        entry.setNote("college night.. ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.FRIDAY);
        entry.setNote("DRANK.. ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.SATURDAY);
        entry.setNote("SUN AND BBQ! ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.SUNDAY);
        entry.setNote("Church?  No thanks ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.SATURDAY);
        entry.setNote("BBQ AND SUN!! ");
        ents.add(entry);

        entry = new Entry();
        entry.setDay(Day.SUNDAY);
        entry.setNote("Church?  No thanks, MORE BBQ!!");
        ents.add(entry);

        return ents;
    }

}
