package org.exercisi2;

import org.utils.ListUtils;
import org.exercici1.Month;
import org.utils.Print;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> listInt1 = ListUtils.setNumbersIntList(5);
        Print.printConsole("List 1:");
        ListUtils.readIntList(listInt1);
        Print.printConsoleLineBreak();

        List<Integer> listInt2 = new ArrayList<>();
        listInt2 = ListUtils.invertTList(listInt1);

        Print.printConsole("List 2:");
        ListUtils.readIntList(listInt2);
        Print.printConsoleLineBreak();
    }
}