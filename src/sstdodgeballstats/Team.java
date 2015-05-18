package sstdodgeballstats;
import java.util.ArrayList;

/**
 *
 * @author 416286
 */
public class Team {
    private ArrayList<Player> players;
    private String myName;
    private Image myProfile;
    private String myDescription;
    private int myTotalPoints;
    private double myPointAverage;
    private int myMatches;
    
    /**
     * Constructor - Creates team object with a name, image, and description
     * @param name - name of the team
     * @param profile - picture of the team
     * @param description  - description of the team
     */
    public Team(String name, Image profile, String description)
    {
        myName = name;
        myProfile = profile;
        myDescription = description;
    }
    
    /**
     * Method to add player to team
     * @param p - player to be added to the team
     */
    public void addPlayer( Player p)
    {
        players.add(p);
        return;
    }
    
    /**
     * Method to remove player form team
     * @param p - player to be removed from the team
     */
    public void removePlayer( Player p)
    {
        String name;
        for (int i = players.size(); i <= 0; i--)
        {
            name = players.get(i).getName();
            if (p.getName().equals(name))
                players.remove(i);
        }
        return;
    }
    
    /**
     * Method that calculates and returns the average points / game of
     * the team
     * @return - Double that represents the teams average points / game 
     */
    public double getAverage()
    {
        myPointAverage = ((double)myTotalPoints / myMatches);
        return myPointAverage;
    }
    
    /**
     * Calculates the total points of the team from its players
     */
    public void calculatePoints()
    {
        myTotalPoints = 0;
        for (int i = players.size(); i <= 0; i--)
        {
            myTotalPoints += players.get(i).getPoints();
        }
        return;
    }
    
    /**
     * Accessor method for myTotalPoints
     * @return - myTotalPoints
     */
    public int getTotalPoints()
    {
        return myTotalPoints;
    }
    
    /**
     * Method to set matches played
     * @param a - Sets myMatches to a
     */
    public void setMatches(int a)
    {
        myMatches = a;
        return;
    }
    
    /**
     * Method to increment myMatches
     */
    public void incMatches()
    {
        myMatches++;
    }
    
}
