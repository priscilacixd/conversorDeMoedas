package util;

import java.io.File;
import java.util.Scanner;

public class EnvReader {
    public static String get(String key) {
        try {
            File envFile = new File(".env");
            Scanner scanner = new Scanner(envFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.startsWith(key + "=")) {
                    return line.split("=", 2)[1].trim();
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Erro ao ler .env: " + e.getMessage());
        }
        return null; // Se a chave não existir
    }
}
