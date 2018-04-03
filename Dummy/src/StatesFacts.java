import java.util.Scanner;

public class StatesFacts {
    //create lists of states birds and flowers
    String[] stateList = {"ALABAMA", "ALASKA", "ARIZONA", "ARKANSAS", "CALIFORNIA", "COLORADO", "CONNECTICUT",
            "DELAWARE", "FLORIDA", "GEORGIA", "HAWAII", "IDAHO", "ILLINOIS", "INDIANA", "IOWA", "KANSAS",
            "KENTUCKY", "LOUISIANA", "MAINE", "MARYLAND", "MASSACHUSETTS", "MICHIGAN", "MINNESOTA",
            "MISSISSIPPI", "MISSOURI", "MONTANA", "NEBRASKA", "NEVADA", "NEW HAMPSHIRE", "NEW JERSEY",
            "NEW MEXICO", "NEW YORK", "NORTH CAROLINA", "NORTH DAKOTA", "OHIO", "OKLAHOMA", "OREGON",
            "PENNSYLVANIA", "RHODE ISLAND", "SOUTH CAROLINA, SOUTH DAKOTA", "TENNESSEE", "TEXAS", "UTAH",
            "VERMONT", "VIRGINIA", "WASHINGTON", "WEST VIRGINIA", "WISCONSIN", "WYOMING"};

    String[] stateBirds = {"Yellowhammer", "Willow Ptarmigan", "Cactus Wren", "Mockingbird", "California Valley Quail",
            "Lark Bunting", "Robin", "Blue Hen Chicken", "Mockingbird", "Brown Thrasher", "Nene",
            "Mountain Bluebird", "Cardinal", "Cardinal", "Eastern Goldfinch", "Western Meadowlark",
            "Cardinal", "Eastern Brown Pelican", "Chickadee", "Baltimore Oriole", "Chickadee", "Robin",
            "Common Loon", "Mockingbird", "Bluebird", "Western Meadowlark", "Western Meadowlark",
            "Mountain Bluebird", "Purple Finch", "Eastern Goldfinch", "Roadrunner", "Bluebird",
            "Cardinal", "Western Meadowlark", "Cardinal", "Scissor-tailed Flycatcher",
            "Western Meadowlark", "Ruffed Grouse", "Rhode Island Red", "Great Carolina Wren",
            "Ring-necked Pheasant", "Mockingbird", "Mockingbird", "Common American Gull",
            "Hermit Thrush", "Cardinal", "Willow Goldfinch", "Cardinal", "Robin", "Western Meadowlark"};

    String[] stateFlowers = {"Camellia", "Forget Me Not", "Saguaro Cactus Blossom", "Apple Blossom", "Golden Poppy",
            "Rocky Mountain Columbine", "Mountain Laurel", "Peach Blossom", "Orange Blossom",
            "Cherokee Rose", "Hibiscus", "Syringa", "Violet", "Peony", "Wild Rose", "Sunflower",
            "Goldenrod", "Magnolia", "White Pine Cone and Tassel", "Black-eyed Susan", "Mayflower",
            "Apple Blossom", "Lady Slipper", "Evergreen Magnolia", "Hawthorn", "Bitterroot",
            "Goldenrod", "Sagebrush", "Purple Lilac", "Purple Violet", "Yucca", "Rose", "Dogwood",
            "Wild Prairie Rose", "Scarlet Carnation", "Mistletoe", "Oregon Grape", "Mountain Laurel",
            "Violet", "Carolina Yellow Jessamine", "American Pasqueflower", "Iris", "Bluebonnet",
            "Sego Lily", "Red Clover", "American Dogwood", "Coast Rhododendron", "Rhododendron",
            "Wood Violet", "Indian Paintbrush"};

    //create an array to store state locations
    int[] stateArray = new int[50];
    int counter = 0;
    int whileCounter = 0;

    //
    public StatesFacts() {
        //loop until none is typed
        while (true) {
            // Use the Scanner class to input data
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a State or None to exit: ");
            String state = scanner.nextLine();
            String stateUpper = state.toUpperCase().trim();
            //search for state enter in the list and add the location to the stateArray
            for (int i = 0; i < stateList.length; i++) {
                if (stateList[i].equals(stateUpper)) {
                    stateArray[counter] = i;
                    counter++;
                }

            }
            //enter none to stop adding states
            if (stateUpper.equals("NONE")) {
                break;
            }

        }
        // print out a report
        System.out.println("**** Thank You *****");
        System.out.println("A summary report for each State, Bird, and Flower is: ");
        // loop through the arrays and print out the states data
        for (int i = 0; i < counter; i++) {
            System.out.println(stateList[stateArray[i]] + ", " + stateBirds[stateArray[i]] + ", " + stateFlowers[stateArray[i]]);
        }
        System.out.println("Please visit our site again!");
    }
}
