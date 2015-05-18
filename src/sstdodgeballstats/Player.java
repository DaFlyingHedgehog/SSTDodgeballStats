package sstdodgeballstats;


/**
 *
 * @author NathanOtt
 */
public class Player 
{
    private int myPoints;
    private int myThrows;
    private int myHits;
    private int myCatches;
    private int myHitOuts;
    private int myCaughtOuts;
    private int myGames;
    private int survivalBonus;
    private int tenCatches;
    private int tenHits;
    private double myHitPercentage;
    private double myPointsPerGame;
    private Image myProfile;
    private String myPlayerBio;
    private String myName;
    
    /**
     * Constructs a player object with a name, image, and player description.
     * @param name - the Player's name, first and last
     * @param profile - A picture of the player in action
     * @param bio - A short description of the player
     */
    public Player(String name, Image profile, String bio)
    {
        myName = name;
        myProfile = profile;
        myPlayerBio = bio;
    }
    
    /**
     * Accessor method for myName 
     * @return The player's name
     */
    public String getName()
    {
        return myName;
    }
    
    /**
     * Allows user to edit player stats
     * @param lobs - The players throws
     * @param hits - How many hits the player has
     * @param catches - How many catches the player has
     * @param hitOuts - How many times the player has been hit out
     * @param caughtOuts - How many time the player has been caught out
     * @param games - How many games the player has played
     */
    public void setStats(int lobs, int hits, int catches, 
            int hitOuts, int caughtOuts, int games)
    {
        myThrows = lobs;
        myHits = hits;
        myCatches = catches;
        myHitOuts = hitOuts;
        myCaughtOuts = caughtOuts;
        myGames = games;
        tenCatches = catches / 10;
        tenHits = hits / 10; 
    }
    
    /**
     * Adds up the players statistics according to their weights and also initializes
     * player hit percentage and points per game.
     */
    public void addUp()
    {
        myPoints = myThrows + (myHits * 5) + (myCatches * 10) + (myHitOuts * -3)
                + (myCaughtOuts * -5) + (survivalBonus * 10) + (tenCatches * 10)
                + (tenHits * 10);
        myHitPercentage = (double) myHits / myThrows;
        myPointsPerGame = (double) myPoints / myGames;
    }
    
    /**
     * 
     * @return The player's total points from their statistics
     */
    public int getPoints()
    {
        return myPoints;
    }
    
    /**
     * 
     * @return - String version of Player
     */
    public String toString()
    {
        return myName + " " + myPoints;
    }
    
    /**
     * Determines whether a player has a higher point value than another player
     * @param p - A player object that is being compared
     * @return - Returns positive if a>b, negative if b>a, and 0 if they are equal
     */
    public int compareTo(Player p)
    {
        return this.getPoints() - p.getPoints(); 
    }
    
    /**
     * Increments throws
     */
    public void incThrows()
    {
       myThrows++;
    }
    
    /**
     * Increments hits
     */
    public void incHits()
    {
        myHits++;
    }
    
    /**
     * Increments catches
     */
    public void incCatches()
    {
        myCatches++;
    }
    
    /**
     * Increments hit outs
     */
    public void incHitOuts()
    {
        myHitOuts++;
    }
    
    /**
     * Increments caught outs
     */
    public void incCaughtOuts()
    {
        myCaughtOuts++;
    }
    
    /**
     * Increments games played
     */
    public void incGames()
    {
        myGames++;
    }
    
    /**
     * Increments survival bonuses
     */
    public void incSurvivalBonus()
    {
        survivalBonus++;
    }
    
    
    
}
