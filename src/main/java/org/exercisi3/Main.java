package org.exercisi3;
import org.utils.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> countries = getCountries();
            HashMap<String, String> countriesHashMap = getHashMap(countries);
            QuizGame quizGame = quizGame("Countries Quiz", countriesHashMap);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> getCountries(){
        try {
            return FileUtils.readFileFromResources("countries.txt");
        } catch (Exception e) {
            System.out.println("Error get countries: " + e.getMessage());
            return null;
        }
    }

    public static HashMap<String, String> getHashMap(ArrayList<String> list){
        try {
           return HashMapUtils.arrayListToHashMap(list);
        } catch (Exception e) {
            System.out.println("Error get HashMap: " + e.getMessage());
            return null;
        }
    }

    public static QuizGame quizGame(String name, HashMap<String, String> hashMap){
        try {
            return new QuizGame(name, hashMap);
        } catch (Exception e) {
            System.out.println("Error Quiz Game: " + e.getMessage());
            return null;
        }
    }

}