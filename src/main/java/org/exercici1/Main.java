package org.exercici1;

import org.utils.ListUtils;

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
        System.out.println("**Month HashSet**");
        Month.readMonthHasSet(months);

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
            months.add(new Month("August"));
            months.add(new Month("September"));
            months.add(new Month("October"));
            months.add(new Month("November"));
            months.add(new Month("December"));

            System.out.println("**Month ArrayList**");
            Month.readMonthHasSet(months);

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
        Month.readMonthArrayList(months);

        months.add(new Month("August"));
        Month.readMonthArrayList(months);
        months.removeLast();

        months.add(7,new Month("August"));
        System.out.println("**Month ArrayList**");
        Month.readMonthArrayList(months);

        return months;
    }


}