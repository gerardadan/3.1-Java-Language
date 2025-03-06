package org.exercici1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months= arrayListMonths();
        hashSetMonths();
        hashSetMonthsFromArrayList(months);
    }

    public static HashSet<Month> hashSetMonthsFromArrayList(ArrayList<Month> monthsAl){
        HashSet months = new HashSet<Month>();
        for(Month month :monthsAl){
            months.add(month);
        }
        readMonthHasSet(months);

        return months;
    }

    public static HashSet<Month> hashSetMonths(){
            HashSet months = new HashSet<Month>();
            months.add(new Month("January"));
            months.add(new Month("February"));
            months.add(new Month("March"));
            months.add(new Month("April"));
            months.add(new Month("May"));
            months.add(new Month("June"));
            months.add(new Month("July"));
            months.add(new Month("Agust"));
            months.add(new Month("September"));
            months.add(new Month("October"));
            months.add(new Month("November"));
            months.add(new Month("December"));
            readMonthHasSet(months);

            return months;
    }

    public static ArrayList<Month> arrayListMonths(){
        ArrayList<Month> months = new ArrayList<> ();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
        readMonthArrayList(months);

        months.add(new Month("Agust"));
        readMonthArrayList(months);
        months.removeLast();

        months.add(7,new Month("Agust"));
        readMonthArrayList(months);

        return months;
    }

    public static void readMonthArrayList(ArrayList<Month> months){
        System.out.println("**Month ArrayList**");
        for(Month month :months){
            System.out.println(month.getName());
        }
        System.out.println();
    }

    public static void readMonthHasSet(HashSet<Month> months){
        System.out.println("**Month HashSet**");
        for(Month month :months){
            System.out.println(month.getName());
        }
        System.out.println();
    }
}