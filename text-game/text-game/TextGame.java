import java.util.*;

public class TextGame {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Character player = new Character(); // Generates player with default values
        
        // optionSelect();
        
        playIntro(console, player);
        dawnOfTheFirstDay(console, player);
    }
    
    public static void dawnOfTheFirstDay(Scanner console, Character player) {
        System.out.print("Waking up, it smells of mold and mildew.");
        console.nextLine();
        System.out.println();
        System.out.print("It's obvious your cot has never been washed before.");
        console.nextLine();
        System.out.println();
        System.out.print("This is your punishment..");
        console.nextLine();
        System.out.println();
        String response = "x";
        do {
            System.out.print("Check your surroundings? (y/n) ");   
            response = console.nextLine();
            System.out.println();
        }
        while (!response.equals("y") && !response.equals("n"));
        if (response.equals("y")) {
            System.out.println("Surrounded by concrete walls and metal bars, it's painfully");
            System.out.print("clear that the events of last month were no dream.");
            console.nextLine();
            System.out.println();
        }
        else {
            System.out.print("You don't need to look to know where you are.");
            console.nextLine();
            System.out.println();
            System.out.print("You're in a prison cell.");
            console.nextLine();
            System.out.println();
        }   
    }
    
    public static void optionSelect() {   // Blueprint for how the graphics will look. Subject to change
        System.out.println(" |-----------------------------------------------------------------------------| ");
        System.out.println(" |                                                                             | ");
        System.out.println(" |                                                                             | ");
        System.out.println(" |                                                                             | ");
        System.out.println(" |                              Text goes here                                 | ");
        System.out.println(" |                                                                             | ");
        System.out.println(" |                                                                             | ");
        System.out.println(" |                                                                             | ");
        System.out.println(" |                                                                             | ");
        System.out.println(" |---------------------------------------------------------------------------- | ");
        System.out.println(" |               |  (s) Status  |  (i) Inventory  |  (s) Save  |               | ");
        System.out.println(" |-----------------------------------------------------------------------------| ");        
    }
    
    /*
    * Brief intro to the game is played, then the character creation
    * methods are called. 
    */
    public static void playIntro(Scanner console, Character player) {
        System.out.println("When times get hard, people sometimes make choices they'll");
        System.out.print("regret..");
        console.nextLine();
        System.out.println();
        System.out.print("You got wrapped up in an armed robbery..");
        console.nextLine();
        System.out.println();
        System.out.print("You were the driver, but you panicked..");
        console.nextLine();
        System.out.println();
        System.out.print("Driving away from the scene of the crime, cops in pursuit..");
        console.nextLine();
        System.out.println();
        System.out.print("You crashed..");
        console.nextLine();
        System.out.println();
        System.out.print("Who are you?");
        console.nextLine();
        System.out.println();
        characterCreation(console, player); // Character creation       
    }
    
    /*
    * User is prompted for a name and if the user is not satisfied
    * with the name they chose, they will be prompted for a name
    * again until they confirm their name. Then the name is set in 
    * the Character object.
    */
    public static void characterCreation(Scanner console, Character player) {
    
        // -------------- Character Name Creation ----------------- //

        String playerName = "";
        String confirmName;
        do {
            System.out.print("Your name: ");
            playerName = console.nextLine();
            System.out.println();
            System.out.print("Are you sure? (y/n) ");
            confirmName = console.nextLine();
            System.out.println();
        } // Repeats unless y is typed, repeats if no name is given.
        while (!confirmName.equals("y") || playerName.trim().equals(""));
        player.setName(playerName); // playerName is set in the Character object
        System.out.println("Hello " + player.getName());
        System.out.println();
        
        // -------------- Character Age Creation ----------------- //
        
        int playerAge = 0;
        String confirmAge;
        do {
            System.out.print("Your age: (15-60) ");
            playerAge = console.nextInt();
            console.nextLine();
            System.out.println();
            System.out.print("Are you sure? (y/n) ");
            confirmAge = console.nextLine();
            System.out.println();
        } // If anything other than y is entered, cycle repeats.
        while (!confirmAge.equals("y") || playerAge < 15 || playerAge > 60 ); 
        player.setAge(playerAge); // playerName is set in the Character object
        System.out.println("You are " + player.getAge());
        System.out.println();
    }      
}

