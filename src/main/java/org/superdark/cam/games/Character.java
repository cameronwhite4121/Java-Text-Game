package org.superdark.cam.games;

public class Character {
    private int muscle; // attack value, adds to reputation
    private int stamina; // health, endurance
    private int brains; // crafting, dialogue options
    private int reputation; // how other prisoners treat you
    private String[] inventory; // storage for items 
    private String playerName; // custom player name
    private int playerAge; // affects how you're treated
    
    
    public Character() {
        muscle = 1;
        stamina = 1;
        brains = 1;
        reputation = 1;
        inventory = new String[6];
        playerName = "";
        playerAge = 18;
    }

    public void setName(String playerName) {
        this.playerName = playerName;   
    }
    
    public String getName() {
        return playerName;
    }
    
    public void setAge(int playerAge) {
        this.playerAge = playerAge;
    }
    
    public int getAge() {
        return playerAge;
    }
}