package org.exercisi3;
import org.utils.FileUtils;
import org.utils.Print;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = FileUtils.readFromResources("countries.txt");
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}