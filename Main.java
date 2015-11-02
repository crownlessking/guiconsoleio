/*
 * @file
 */
package consoleio;

import java.awt.Color;

/**
 *
 * @author riviere
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        C.io.setTitle("Example"); // Sets window title
        
        C.io.println("Hello World!");
        
        C.io.print("Enter your dog's name:");
        String name = C.io.nextLine(); // Capture user input from keyboard
        
        C.io.print("Enter your dog's age:");
        int age = C.io.nextInt(); // Capture user input from keyboard
        
        C.io.print("Your dog name is ");
        C.io.print(name, Color.YELLOW);
        C.io.print(" and it's ");
        C.io.print(age, Color.CYAN);
        C.io.println(" year(s) old.");
    }

}
