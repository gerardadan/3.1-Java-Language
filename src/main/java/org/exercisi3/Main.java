package org.exercisi3;
import org.utils.FileUtils;
import org.utils.HashMapUtils;
import org.utils.ListUtils;
import org.utils.Print;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> countries = FileUtils.readFileFromResources("countries.txt");
            ListUtils.readGenericList(countries);
            HashMap<String, String> countriesHashMap = HashMapUtils.arrayListToHashMap(countries);
            System.out.println("a");
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}