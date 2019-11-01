/**
 * The Team Class.
 *
 * This class stores data for the all the teams. 
 */
package MiniProjectM3;

/**
 *
 * @author umerraja
 */
public class Team {

    public String nameOfTheTeam;                    // Names of the team 
    private String shortNoteAboutTeam;              // Short notes for the team 
    private boolean teamFeeStatus;                  // Team fee status 
    private double entryFeeOfTeam;                  // Entry fee amount 
    private int totalTeamMemebers;                  // Total members of the team
    
    /**
     * This constructor initializes the name, short note, fee status, entry fee amount, total team members.  
     * @param nameOfTheTeam The name of the Team
     * @param shortNoteAboutTeam The short note for the team 
     * @param teamFeeStatus Team fee status 
     * @param entryFeeOfTeam Entry fee amount 
     * @param totalTeamMemebers Total members in the team.
     */

    public Team(String nameOfTheTeam, String shortNoteAboutTeam, boolean teamFeeStatus, double entryFeeOfTeam, int totalTeamMemebers) {
        this.nameOfTheTeam = nameOfTheTeam;
        this.shortNoteAboutTeam = shortNoteAboutTeam;
        this.teamFeeStatus = teamFeeStatus;
        this.entryFeeOfTeam = entryFeeOfTeam;
        this.totalTeamMemebers = totalTeamMemebers;
    }

    
    /**
     * 
     * @param shortNoteAboutTeam Short note about the team.
     */

    public void setShortNote(String shortNoteAboutTeam) {
        this.shortNoteAboutTeam = shortNoteAboutTeam;
    }
    
    /**
     * 
     * @param teamFeeStatus Team fee status. 
     */

    public void setTeamFeeStatus(boolean teamFeeStatus) {
        this.teamFeeStatus = teamFeeStatus;
    }
    
    /**
     * 
     * @param entryFeeOfTeam Team's entry fee.
     */

    public void setEnteryFee(double entryFeeOfTeam) {
        this.entryFeeOfTeam = entryFeeOfTeam;
    }

    /**
     * 
     * @param totalTeamMemebers total team members. 
     */
    
    public void setTeamMemebers(int totalTeamMemebers) {
        this.totalTeamMemebers = totalTeamMemebers;
    }

    /**
     * This getTeamName method returns the name of the team. 
     * @return The value in the nameOfTheTeam field.  
     */
    
    public String getTeamName() {
        return nameOfTheTeam;
    }
    
    /**
     * This getShortNote method returns the name of the team. 
     * @return The value in the shortNoteAboutTeam field.
     */

    public String getShortNote() {
        return shortNoteAboutTeam;
    }
    
    /**
     * This getTeamFeeStatus method returns status of the team fee.
     * @return The value in the teamFeeStatus field.
     */

    public boolean getTeamFeeStatus() {
        return teamFeeStatus;
    }
    
    /**
     * This getEnteryFee method returns entry fee amount of the team.
     * @return The value in the entryFeeOfTeam field.
     */

    public double getEnteryFee() {
        return entryFeeOfTeam;
    }

    /**
     * This getTeamMemebers method returns total team members.
     * @return The value in the shortNoteAboutTeam field.
     */
    public int getTeamMemebers() {
        return totalTeamMemebers;
    }

}
