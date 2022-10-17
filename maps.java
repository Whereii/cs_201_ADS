import java.util.*;

public class maps {

    //declaring the hashmap and filling it
    public static HashMap<String, String> capital_map() {
        HashMap <String, String> capital_cities = new HashMap<String, String>();
        capital_cities.put("alabama", "montgomery");
        capital_cities.put("alaska", "juneau");
        capital_cities.put("arizona", "phoenix");
        capital_cities.put("arkansas", "little rock");
        capital_cities.put("california", "sacramento");
        capital_cities.put("colorado", "denver");
        capital_cities.put("connecticut", "hartford");
        capital_cities.put("delaware", "dover");
        capital_cities.put("florida", "tallahassee");
        capital_cities.put("georgia", "atlanta");
        capital_cities.put("hawaii", "honolulu");
        capital_cities.put("idaho", "boise");
        capital_cities.put("illinois", "springfield");
        capital_cities.put("indiana", "indianapolis");
        capital_cities.put("iowa", "des moines");
        capital_cities.put("kansas", "topeka");
        capital_cities.put("kentucky", "frankfort");
        capital_cities.put("louisiana", "baton rouge");
        capital_cities.put("maine", "augusta");
        capital_cities.put("maryland", "annapolis");
        capital_cities.put("massachusetts", "boston");
        capital_cities.put("michigan", "lansing");
        capital_cities.put("minnesota", "saint paul");
        capital_cities.put("mississippi", "jackson");
        capital_cities.put("missouri", "jefferson city");
        capital_cities.put("montana", "helena");
        capital_cities.put("nebraska", "lincoln");
        capital_cities.put("nevada", "carson city");
        capital_cities.put("new hampshire", "concord");
        capital_cities.put("new  jersey", "trenton");
        capital_cities.put("new mexico", "santa fe");
        capital_cities.put("new york", "albany");
        capital_cities.put("north carolina", "raleigh");
        capital_cities.put("north dakota", "bismarck");
        capital_cities.put("ohio", "columbus");
        capital_cities.put("oklahoma", "oklahoma city");
        capital_cities.put("oregon", "salem");
        capital_cities.put("pennsylvania", "harrisburg");
        capital_cities.put("rhode island", "providence");
        capital_cities.put("south carolina", "columbia");
        capital_cities.put("south dakota", "pierre");
        capital_cities.put("tennessee", "nashville");
        capital_cities.put("texas", "austin");
        capital_cities.put("utah", "salt lake city");
        capital_cities.put("vermont", "montpelier");
        capital_cities.put("virginia", "richmond");
        capital_cities.put("washington", "olympia");
        capital_cities.put("west virginia", "charleston");
        capital_cities.put("wisconsin", "madison");
        capital_cities.put("wyoming", "cheyenne");
        return capital_cities;
    }
    //iterator for the hashmap to display it
    public static void display_map (HashMap<String, String> map) {
        Iterator map_iterator = map.entrySet().iterator();

        while (map_iterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)map_iterator.next();
            String city = ((String)mapElement.getValue());

            System.out.println(mapElement.getKey() + " : " + city);
        }
    }


    //Use the TreeMap class to sort the map while storing it in a binary tree
    public static TreeMap<String, String> tree_sort (HashMap<String, String> hash_map) {
        TreeMap<String, String> capitals_sorted = new TreeMap<>(hash_map);
        return capitals_sorted;
    }

    //Ask the user for a state and then give them the state's capital
    public static void ask_state (TreeMap<String, String> tree) {
        String answer = "";
        Scanner scn = new Scanner(System.in);
        System.out.println("At any time you can type in 'quit' to terminate the program.");
        while (!answer.equalsIgnoreCase("quit")) {
            System.out.println("Please enter a state: ");
            answer = scn.nextLine();
            if(answer == "quit") {
                System.out.println("Shutting Down");
                break;
            }
            if(tree.containsKey(answer)) {
                System.out.println("The capital of " + answer + " is " + tree.get(answer) + ".");
            } else if (!answer.equalsIgnoreCase("quit")){
                System.out.println("I have never heard of that state before. Try again or type 'quit'.");
            }

        }
    }

    public static void main(String[] args) {
        //prints the hashmap
        display_map(capital_map());
        //prints the tree map
        System.out.println(tree_sort(capital_map()));
        //runs the state to capital application
        ask_state(tree_sort(capital_map()));
    }
}

