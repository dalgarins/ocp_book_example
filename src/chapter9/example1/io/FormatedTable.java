package chapter9.example1.io;

import java.io.Console;

public class FormatedTable {

    void line (Console console) {
        console.printf("-----------------------------------------------\n");
    }
    
    void printHeader(Console console) {
        console.printf("%-15s \t %s \t %s \t %s %n", "Player", "Marches", "Goals", "Goals per match");
    }
    
    void printRow(Console console, String player, int matches, int goals) {
        console.printf("%-15s \t %5d \t\t %d \t\t %.1f \n", player, matches, goals, ((float) goals/(float) matches));
    }

    public static void main(String[] args) {

        
        FormatedTable formatedTable = new FormatedTable();
        Console console = System.console();
        if (console != null) {
            formatedTable.line(console);
            formatedTable.printHeader(console);
            formatedTable.line(console);
            
            formatedTable.printRow(console, "Demando", 80, 122);
            formatedTable.printRow(console, "Mushi", 60, 100);
            formatedTable.printRow(console, "Peado", 20, 102);
            
            formatedTable.line(console);
            System.out.println("");
            System.out.println("------------------");
            console.printf("1");
            console.printf("%d", "1");
        }
        
        
    }
    
}
