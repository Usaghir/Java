/**
 * The main TeamOrder class with user interface.
 *
 * This team will provide the user interface with menus.
 */
package MiniProjectM3;

/**
 * Array list class to store all created objects Scanner class to read input
 * from user.
 */
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author umerraja
 */
public class TeamsOrder {

    /**
     * This method is for menu which will be present when the program first
     * start and only once as welcome note.
     *
     * @return The userChoise1
     */
    public static int getMenu1() {
        int userChoise1;

        // Scanner object to read keyboard input. 
        Scanner keyboard = new Scanner(System.in);

        // First menu for the user choise. 
        System.out.println("Welcome to this sports event Program\n\n");
        System.out.println("Enter one of the follwing options\n");
        System.out.println("1. To start entering data in the sports event program");
        System.out.println("2. Quit\n");
        System.out.print("Please Enter: ");

        // To get the user input as int. 
        userChoise1 = keyboard.nextInt();

        // For input valdiation
        while (userChoise1 < 1 || userChoise1 > 2) {
            System.out.print("X Inalid Choise X\n\nPlease enter 1 or 2: ");
            userChoise1 = keyboard.nextInt();
        }

        return userChoise1;
    }

    /**
     * This method is for second menu to display choices for the user
     *
     * @return The user choice for the menu 2.
     */
    public static int getMenu2() {
        int userChoise2;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter one of the follwing options\n");
        System.out.println("1. Want to display information regarding a team ");
        System.out.println("2. Want to remove any teams");
        System.out.println("3. Want to  update data regarding any team");
        System.out.println("4. Quit");

        userChoise2 = keyboard.nextInt();

        // For input valdiation
        while (userChoise2 < 1 || userChoise2 > 4) {
            System.out.print("X Inalid Choise X\n\nPlease enter (1,2,3 or 4: ");
            userChoise2 = keyboard.nextInt();
        }

        return userChoise2;
    }

    /**
     * This method is for entering the name of the team.
     *
     * @return The name of the team.
     */
    public static String enterName() {
        String inputName;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter name of the team: ");
        inputName = keyboard.nextLine();

        // For input valdiation
        while (inputName.trim().isEmpty()) {
            System.out.print("X No input found X\n\npPlease enter name of the team again: ");
            inputName = keyboard.nextLine();
        }

        return inputName;
    }

    /**
     * This method is for entering the note for the team.
     *
     * @return The note for the team.
     */
    public static String enterNote() {
        String inputNote;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter note for the team: ");
        inputNote = keyboard.nextLine();

        // for input valdiation
        while (inputNote.trim().isEmpty()) {
            System.out.print("X No input found X\n\nPlease enter note for the team: ");
            inputNote = keyboard.nextLine();
        }

        return inputNote;
    }

    /**
     * This method is for entering the fee Status for the team.
     *
     * @return The fee Status for the team.
     */
    public static boolean enterFeeStatus() {
        String inputReadChar;
        char inputChar;
        boolean status;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter (y or Y) if team has paid the entry fee and (n or N) team has not paid: ");
        inputReadChar = keyboard.nextLine();
        inputChar = inputReadChar.charAt(0);

        // For input valdiation
        while (inputChar != 'y' && inputChar != 'n' && inputChar != 'Y' && inputChar != 'N') {
            System.out.print("X Inalid Choise X\n\nPlease enter (y or Y) if team has paid the entry fee and (n or N) team has not paid: ");
            inputReadChar = keyboard.nextLine();
            inputChar = inputReadChar.charAt(0);
        }

        status = (inputChar == 'y' || inputChar == 'Y');
        return status;
    }

    /**
     * This method is for entering the fee of the team.
     *
     * @param status which will get status of the fee from enterFeeStatus
     * return.
     * @return will return the amount of fee of the team.
     */
    public static double enterFee(boolean status) {
        double inputDouble;

        Scanner keyboard = new Scanner(System.in);

        // For the amount paid by team
        if (status) {
            System.out.print("Please enter how much this team has paid the entry fee: ");
            inputDouble = keyboard.nextDouble();

            // For input valdiation
            while (inputDouble < 0) {
                System.out.print("X Inalid Choise X\n\nPlease enter how much this team has paid the entry fee:");
                inputDouble = keyboard.nextDouble();
            }
        } else {

            // Will be set to 0 if the user will enter the status of the fee is not paid. 
            inputDouble = 0.0;
        }

        return inputDouble;
    }

    /**
     * This method is for entering the team members.
     *
     * @return The team members.
     */
    public static int enterTeamMemb() {
        int inputInt;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter how many memebers have in the team: ");
        inputInt = keyboard.nextInt();

        // For input valdiation
        while (inputInt < 1) //if ("".equals(name) || name.length() == 0)
        {
            System.out.print("X Inalid Choise X\n\nPlease enter how many memebers have in the team (min 1): ");
            inputInt = keyboard.nextInt();
        }
        return inputInt;
    }

    /**
     * This method is in case user want to enter or remove more teams.
     *
     * @param forEdit for editing the data in case of adding or removing the
     * team.
     * @return The user choice if user want to enter or remove more teams
     */
    public static char moreTeam(String forEdit) {
        String statusStr;
        char statusChar;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Do you want to " + forEdit + " more teams please enter (y or Y) for yes and (n or N) for no: ");
        statusStr = keyboard.nextLine();
        statusChar = statusStr.charAt(0);

        // For input valdiation
        while (statusChar != 'y' && statusChar != 'n' && statusChar != 'Y' && statusChar != 'N') {
            System.out.print("X Inalid Choise X\n\n please please enter (y or Y) for yes and (n or N) for no:");
            statusStr = keyboard.nextLine();
            statusChar = statusStr.charAt(0);
        }
        return statusChar;
    }

    /**
     * The main method for user interface with all menus.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String inputName, inputNote;
        char statusChar;
        boolean status;
        double inputDouble;
        int inputInt, userChoise1, userChoise2, countTeams = 1;

        // For reading keyboard input 
        Scanner keyboard = new Scanner(System.in);

        // For storing all the created objects. 
        ArrayList<Team> teamsObjectList = new ArrayList<>();

        // First menu
        userChoise1 = getMenu1();

        do {                // this loop is in case user want to continue working with program. 

            if (userChoise1 == 1) {
                System.out.println("Please enter the data for the team no " + countTeams);

                do {           // This loop in case user want to enter the add mulitple teams. 

                    inputName = enterName();
                    inputNote = enterNote();
                    status = enterFeeStatus();
                    inputDouble = enterFee(status);
                    inputInt = enterTeamMemb();

                    teamsObjectList.add(new Team(inputName, inputNote, status, inputDouble, inputInt));

                    statusChar = moreTeam("add");
                    countTeams++; // for counting the teams each time the user will add any new team object and detail. 

                } while (statusChar == 'y' || statusChar == 'Y');

            } else {
                break; // For user choise want to quit in after first menu. 
            }
            
            do {
                
            

            // Will display the second manue when user will choose nor to quit. 
            userChoise2 = getMenu2();

            // This switch statment is to fulfil the user choises. 
            switch (userChoise2) {

                // If user choose 1 or first choise to displa display information for the team. 
                case 1: {

                    // First all the names of the team will be displayed here which is currently stored in the arraylist. 
                    for (int index = 0; index < teamsObjectList.size(); index++) {
                        System.out.println("Team " + (index + 1) + " name is " + teamsObjectList.get(index).getTeamName());
                    }

                    // Here which team user want the information for.
                    int aChoise, bChoise;
                    System.out.println("Please slecter number 1 to " + teamsObjectList.size() + " which team you want to display information");
                    bChoise = keyboard.nextInt();
                    aChoise = bChoise - 1;

                    // For input valdiation
                    while (bChoise < 1 && bChoise > teamsObjectList.size()) {
                        System.out.print("X Inalid Choise X\n\nPlease slecter number 1 to " + teamsObjectList.size() + " which team you want to display information: ");
                        bChoise = keyboard.nextInt();
                        aChoise = bChoise - 1;
                    }

                    // Team info according to user chooise will be displayed here. 
                    System.out.println("Team " + teamsObjectList.get(aChoise).getTeamName() + " has note " + teamsObjectList.get(aChoise).getShortNote());
                    System.out.println("Team " + teamsObjectList.get(aChoise).getTeamName() + " has fee status " + teamsObjectList.get(aChoise).getTeamFeeStatus());
                    System.out.println("Team " + teamsObjectList.get(aChoise).getTeamName() + " has fee " + teamsObjectList.get(aChoise).getEnteryFee());
                    System.out.println("Team " + teamsObjectList.get(aChoise).getTeamName() + " has memeber " + teamsObjectList.get(aChoise).getTeamMemebers());
                    break;
                }

                // If user choose to remove some teams     
                case 2: {

                    // Again will display the names of the stored teams and ask user for which team want to remove the data. 
                    for (int index = 0; index < teamsObjectList.size(); index++) {
                        System.out.println("Team " + (index + 1) + " name is " + teamsObjectList.get(index).getTeamName());
                    }
                    int aChoise, bChoise;
                    System.out.print("Please slecter which team you want to remove number from no 1 to " + teamsObjectList.size() + ": ");
                    bChoise = keyboard.nextInt();
                    aChoise = bChoise - 1;      // because manu start from 1 and index of array list start from 0; 

                    // For input valdiation
                    while (bChoise < 1 && bChoise > teamsObjectList.size()) {
                        System.out.print("X Inalid Choise X\n\n Please slecter which team you want to remove number from no 1 to " + teamsObjectList.size() + ": ");
                        bChoise = keyboard.nextInt();
                        aChoise = bChoise - 1; // Because manu start from 1 and index of array list start from 0;
                    }

                    teamsObjectList.remove((aChoise));
                    countTeams--; // For keep count of the teams in case user delete any of the team. 
                    break;
                }

                // If user choose to change the data from the list. 
                case 3: {
                    

                    // this loop will itterate as long as user want to keep on editing data. 
                    do {

                        // Again to display all the teams name. 
                        for (int index = 0; index < teamsObjectList.size(); index++) {
                            System.out.println("Team " + (index + 1) + " name is " + teamsObjectList.get(index).getTeamName());
                        }

                        // For user choise for the team
                        int aChoise, bChoise;
                        System.out.println("Please slecter number 1 to " + teamsObjectList.size() + " which team you want to change");
                        bChoise = keyboard.nextInt();
                        aChoise = bChoise - 1; // because manu start from 1 and index of array list start from 0;

                        // For input valdiation
                        while (bChoise < 1 && bChoise > teamsObjectList.size()) {
                            System.out.println("X Inalid Choise X\n\nPlease enter team from 1 to " + teamsObjectList.size());
                            bChoise = keyboard.nextInt();
                            aChoise = bChoise - 1;
                        }

                        // Menu for the specific data in user want to change. 
                        System.out.println("Please enter what you want to change for this team");
                        System.out.println("1. If want to change note for this team");
                        System.out.println("2. If want to change the fee for the team");
                        System.out.println("3. If want add team members");
                        inputInt = keyboard.nextInt();
                        keyboard.nextLine();

                        // For input valdiation
                        while (inputInt < 1 || inputInt > 3) //if ("".equals(name) || name.length() == 0)
                        {
                            System.out.println("X Inalid Choise X\n\nPlease enter choise from 1 to 3");
                            inputInt = keyboard.nextInt();
                            keyboard.nextInt();
                        }

                        // For making changins in the data accoring to user choice. 
                        switch (inputInt) {
                            case 1: {
                                inputNote = enterNote();
                                teamsObjectList.get(aChoise).setShortNote(inputNote);
                            }
                            break;
                            case 2: {
                                status = enterFeeStatus();
                                teamsObjectList.get(aChoise).setTeamFeeStatus(status);

                                inputDouble = enterFee(status);
                                teamsObjectList.get(aChoise).setEnteryFee(inputDouble);
                                break;
                            }
                            case 3: {
                                inputInt = enterTeamMemb();
                                teamsObjectList.get(aChoise).setTeamMemebers(inputInt);
                            }
                        }
                        statusChar = moreTeam("change"); // To call the moreTeam Method but this time will message change instead of add. 
                    } while (statusChar == 'y' || statusChar == 'Y');
                    break;
                }
            }
            // For user choice to quit the program or want to continue. 
            System.out.print("Do you wannt to still continue see the manu again ");
            System.out.println("Please enter 1 for yes and 2 for no: ");
            inputInt = keyboard.nextInt();

            // For input valdiation
            while (inputInt != 1 && inputInt != 2) {
                System.out.println("X Inalid Choise X\n\n Please enter 1 for yes and 2 for no:");
                inputInt = keyboard.nextInt();
            }
                
            } while (inputInt == 1);
            
            // For user choice to quit the program or want to continue. 
            System.out.print("Do you wannt to still continue working with this progrma ");
            System.out.println("Please enter 1 for yes and 2 for no: ");
            inputInt = keyboard.nextInt();

            // For input valdiation
            while (inputInt != 1 && inputInt != 2) {
                System.out.println("X Inalid Choise X\n\n Please enter 1 for yes and 2 for no:");
                inputInt = keyboard.nextInt();
            }

        } while (inputInt == 1);
        
        System.out.println("Below is all the stored information in the program");
        for (int index = 0; index < teamsObjectList.size(); index++) {
            System.out.println("team  " + (index + 1) + "has note " + teamsObjectList.get(index).getTeamName());
            System.out.println("team  " + (index + 1) + "has note " + teamsObjectList.get(index).getShortNote());
            System.out.println("team  " + (index + 1) + "has fee status" + teamsObjectList.get(index).getTeamFeeStatus());
            System.out.println("team  " + (index + 1) + "has fee" + teamsObjectList.get(index).getEnteryFee());
            System.out.println("team  " + (index + 1) + "has memeber" + teamsObjectList.get(index).getTeamMemebers());
            
            
        }
        System.out.println("Thanks and Good bye");
    }

}
