/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 * Németh Angéla, 2024-02-23
 */
import java.util.Scanner;

public class MainConsole {

    String szallitasStr = "";
    String uzletStr = "";
    String javitasStr = "";    

    public MainConsole() {
        drawHeader();        
        inputParams();

        Koltseg koltseg = new Koltseg(szallitasStr, uzletStr, javitasStr);
        Filehandler filehandler = new Filehandler();
        filehandler.WriteToFile("adat.txt", koltseg);
    }

    private void drawHeader() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    private void inputParams() {
        Scanner scanner = new Scanner(System.in);        
        szallitasStr = askCost(scanner, "Szállítási költség: ");
        uzletStr = askCost(scanner, "Üzleti költség: ");
        javitasStr = askCost(scanner, "Javítási költség: ");
        scanner.close();
    }

    private String askCost(Scanner scanner, String text) {
        System.out.println("──────────────────────────────────────────");
        System.out.print(text);
        return scanner.nextLine();
    }
}