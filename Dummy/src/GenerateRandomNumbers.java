import java.util.Arrays;
import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberOfRandoms = 0;
        int maxRand = 0;
        // handle different amounts of arguments
        if (args.length >= 2) { // if enough args to run program
            try { // try to parse first two arguments
                // parse arguments to integers
                numberOfRandoms = Integer.parseInt(args[0]);
                maxRand = Integer.parseInt(args[1]);

                // handle negative or zero numberOfRandoms
                if (numberOfRandoms <= 0 || maxRand <= 0) {
                    System.out.println("ERROR: One or both of your arguments: {" + args[0] + ", " + args[1] + "} is not a positive integer." +
                            " Please run program with two positive integers as arguments in command-line (e.g, java GenerateRandomNumbers 10 20).");
                    System.exit(1);
                }

                if (args.length > 2) { // if more than two, notify user that other arguments have been ignored
                    System.out.print("You have entered more than the required arguments. The following arguments were accepted: [" +
                            args[0] + ", " + args[1] + "]. The following arguments have been ignored: [");
                    // iterate through extra args
                    for (int i = 2; i < args.length; i++) {
                        System.out.print(args[i] + ", "); // print arg with separator
                    }

                    System.out.println("\b\b]."); // print double backspace (to erase final separator) and close bracket
                }
            } catch (NumberFormatException e) { // handle exceptions re: parsing integers
                System.out.println("ERROR: One or both of your arguments: {" + args[0] + ", " + args[1] + "} could not be parsed." +
                        " Please run program with two positive integers as arguments in command-line (e.g, java GenerateRandomNumbers 10 20).");
                System.exit(1); // exit
            }
        } else { // else not enough args, notify and exit
            System.out.println("ERROR: This Random Integer Generator requires 2 command-line arguments." +
                    " Please run program with two positive integers as arguments in command-line (e.g, java GenerateRandomNumbers 10 20).");
            System.exit(0);
        }

        // init empty array len numRand
        int[] randomArray = new int[numberOfRandoms];

        for (int j = 0; j < numberOfRandoms; j++) { // populate array
            randomArray[j] = rand.nextInt(maxRand + 1);
        }
        // print out random number array, sum and avg
        System.out.println("The following " + numberOfRandoms + " random numbers between 0 (inclusive) and " +
                maxRand + " (inclusive) have been generated: " + Arrays.toString(randomArray) + ".");
        System.out.println("The sum of the random numbers is " + sumIntArr(randomArray) + ".");
        System.out.println("The average of the random numbers is " + averageArray(randomArray) + ".");
    }

    public static int sumIntArr(int[] numberArray){
        int sum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }

        return sum;
    }

    public static double averageArray(int[] numberArray) {
        return (double)sumIntArr(numberArray) / (double)numberArray.length;
    }
}
