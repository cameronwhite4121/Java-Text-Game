import java.util.*;

public class TextGame {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Character player = new Character(); // Generates player with default values
        
        playIntro(console, player);
        
    
        
    }
    
    /*
    * Brief intro to the game is played, then the character creation
    * methods are called. 
    */
    public static void playIntro(Scanner console, Character player) {
        System.out.print("You are a prisoner..");
        console.nextLine();
        System.out.print("You got wrapped up in an armed robbery..");
        console.nextLine();
        System.out.print("You panicked and drove off..");
        console.nextLine();
        System.out.print("You crashed..");
        console.nextLine();
        System.out.print("Who are you?");
        console.nextLine();
        characterCreation(console, player);
        
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
            System.out.print("Are you sure? (y/n) ");
            confirmName = console.nextLine();
        } // Repeats unless y is typed, repeats if no name is given.
        while (!confirmName.equals("y") || playerName.trim().equals(""));
        player.setName(playerName); // playerName is set in the Character object
        System.out.println("Hello " + player.getName());
        
        // -------------- Character Age Creation ----------------- //
        
        int playerAge = 0;
        String confirmAge;
        do {
            System.out.print("Your age: (15-60) ");
            playerAge = console.nextInt();
            console.nextLine();
            System.out.print("Are you sure? (y/n) ");
            confirmAge = console.nextLine();
        } // If anything other than y is entered, cycle repeats.
        while (!confirmAge.equals("y") || playerAge < 15 || playerAge > 60 ); 
        player.setAge(playerAge); // playerName is set in the Character object
        System.out.print("You are " + player.getAge());
    }
       
}

