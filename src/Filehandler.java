/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 * Németh Angéla, 2024-02-23
 */

import java.io.FileWriter;
import java.io.IOException;

public class Filehandler {
    public void WriteToFile(String filename, Koltseg koltseg) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            String text = String.join(":", koltseg.szallitas.toString(), koltseg.uzlet.toString(), koltseg.javitas.toString());
            fw.write(text + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Hiba történt a fájl írása során: " + e.getMessage());
        }
    }
}