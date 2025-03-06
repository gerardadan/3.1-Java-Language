package org.exercici1;

import java.util.ArrayList;
import java.util.HashSet;

public class Month {
    public String getName() {
        return name;
    }

    private String name;

    public Month(String name) {
        this.name = name;
    }

    public static void readMonthArrayList(ArrayList<Month> months){
        for(Month month :months){
            System.out.println(month.getName());
        }
        System.out.println();
    }

    public static void readMonthHasSet(HashSet<Month> months){
            for(Month month :months){
            System.out.println(month.getName());
        }
        System.out.println();
    }
}
