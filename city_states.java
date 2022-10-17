import java.util.*;

public class city_states {

    public static String[][] locations () {

        String[][] container_arry = new String[50][50];
        container_arry[0][0] = "alabama";
        container_arry[0][1] = "montgomery";
        container_arry[1][0] = "alaska";
        container_arry[1][1] = "juneau";
        container_arry[2][0] = "arizona";
        container_arry[2][1] = "phoenix";
        container_arry[3][0] = "arkansas";
        container_arry[3][1] = "little rock";
        container_arry[4][0] = "california";
        container_arry[4][1] = "sacramento";
        container_arry[5][0] = "colorado";
        container_arry[5][1] = "denver";
        container_arry[6][0] = "connecticut";
        container_arry[6][1] = "hartford";
        container_arry[7][0] = "delaware";
        container_arry[7][1] = "dover";
        container_arry[8][0] = "florida";
        container_arry[8][1] = "tallahassee";
        container_arry[9][0] = "georgia";
        container_arry[9][1] = "atlanta";
        container_arry[10][0] = "hawaii";
        container_arry[10][1] = "honolulu";
        container_arry[11][0] = "idaho";
        container_arry[11][1] = "boise";
        container_arry[12][0] = "illinois";
        container_arry[12][1] = "springfield";
        container_arry[13][0] = "indiana";
        container_arry[13][1] = "indianapolis";
        container_arry[14][0] = "iowa";
        container_arry[14][1] = "des moines";
        container_arry[15][0] = "kansas";
        container_arry[15][1] = "topeka";
        container_arry[16][0] = "kentucky";
        container_arry[16][1] = "frankfort";
        container_arry[17][0] = "louisiana";
        container_arry[17][1] = "baton rouge";
        container_arry[18][0] = "maine";
        container_arry[18][1] = "augusta";
        container_arry[19][0] = "maryland";
        container_arry[19][1] = "annapolis";
        container_arry[20][0] = "massachusetts";
        container_arry[20][1] = "boston";
        container_arry[21][0] = "michigan";
        container_arry[21][1] = "lansing";
        container_arry[22][0] = "minnesota";
        container_arry[22][1] = "saint paul";
        container_arry[23][0] = "mississippi";
        container_arry[23][1] = "jackson";
        container_arry[24][0] = "missouri";
        container_arry[24][1] = "jefferson city";
        container_arry[25][0] = "montana";
        container_arry[25][1] = "helena";
        container_arry[26][0] = "nebraska";
        container_arry[26][1] = "lincoln";
        container_arry[27][0] = "nevada";
        container_arry[27][1] = "carson city";
        container_arry[28][0] = "new hampshire";
        container_arry[28][1] = "concord";
        container_arry[29][0] = "new jersey";
        container_arry[29][1] = "trenton";
        container_arry[30][0] = "new mexico";
        container_arry[30][1] = "santa fe";
        container_arry[31][0] = "new york";
        container_arry[31][1] = "albany";
        container_arry[32][0] = "north carolina";
        container_arry[32][1] = "raleigh";
        container_arry[33][0] = "north dakota";
        container_arry[33][1] = "bismarck";
        container_arry[34][0] = "ohio";
        container_arry[34][1] = "columbus";
        container_arry[35][0] = "oklahoma";
        container_arry[35][1] = "oklahoma city";
        container_arry[36][0] = "oregon";
        container_arry[36][1] = "salem";
        container_arry[37][0] = "pennsylvania";
        container_arry[37][1] = "harrisburg";
        container_arry[38][0] = "rhode island";
        container_arry[38][1] = "providence";
        container_arry[39][0] = "south carolina";
        container_arry[39][1] = "columbia";
        container_arry[40][0] = "south dakota";
        container_arry[40][1] = "pierre";
        container_arry[41][0] = "tennessee";
        container_arry[41][1] = "nashville";
        container_arry[42][0] = "texas";
        container_arry[42][1] = "austin";
        container_arry[43][0] = "utah";
        container_arry[43][1] = "salt lake city";
        container_arry[44][0] = "vermont";
        container_arry[44][1] = "montpelier";
        container_arry[45][0] = "virginia";
        container_arry[45][1] = "richmond";
        container_arry[46][0] = "washington";
        container_arry[46][1] = "olympia";
        container_arry[47][0] = "west virginia";
        container_arry[47][1] = "charleston";
        container_arry[48][0] = "wisconsin";
        container_arry[48][1] = "madison";
        container_arry[49][0] = "wyoming";
        container_arry[49][1] = "cheyenne";

        return container_arry;

    }


    //the bubble sort method that runs the sort on the capitals of the locations array
    public static String[][] bubble_sort (String[][] arry) {
        int len = arry.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j ++) {
                if (arry[j][1].compareTo(arry[j + 1][1]) > 0) {
                    String temp = arry[j][1];
                    arry[j][1] = arry[j + 1][1];
                    arry[j + 1][1] = temp;
                }
            }
        }
        return arry;
    }

    //simple function to print out the locations array
    public static void print_locations (String[][] arry) {
        for(int i = 0; i < arry.length; i++) {
            System.out.println("The state of " + arry[i][0] + " has the capitol of " + arry[i][1]);
        }
    }

    //this function when run starts a game where the user has to guess the capitals of each city and it keeps count using total_count
    public static void guess_capitals (String [][] arry) {
        int len = arry.length;
        int total_count = 0;
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i <len; i++){
            System.out.println("Enter the capital of " + arry[i][0]);
            String capital = scn.nextLine();
            if(arry[i][1].compareTo(capital.toLowerCase()) == 0){
                total_count++;
            }
            if(total_count == 1) {
                System.out.println("You correctly guessed " + total_count + " capital.");
            } else {
                System.out.println("You correctly guessed " + total_count + " capitals.");
            }
        }
    }

    public static void main(String[] args) {
        //prints out the array with each state having its capital
        print_locations(locations());
        System.out.println("#####################################################");
        //prints the same array but sorted by its capital
        print_locations(bubble_sort(locations()));
        //runs the game that asks for guesses
        guess_capitals(locations());
    }

}