package org.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {
    public static BufferedReader readFromResources(String path) {
        BufferedReader br = null;
        try (InputStream input = FileUtils.class.getClassLoader().getResourceAsStream(path)) {
            if (input == null) {
                throw new RuntimeException("Error: Archivo no encontrado en resources.");
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8))) {
                br = reader;
            }

        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo: " + e.getMessage());
        }

        return br;
    }

}