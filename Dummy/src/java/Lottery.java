public class Lottery {

    // Create an int array that will store 6 elements
    static int lotteryNumbers[] = new int[6];

    // Main method to call the methods and run the program
    public static void main(String args[]) {
        createLotteryArray();
        System.out.println("Here are your lotto numbers");
        printLotteryArray();
        System.out.println("Good Luck!");
    }
    // Method that will create and populate the array of lottery numbers from 1-69
    public static void createLotteryArray(){

        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = (int) (Math.random() * 69) + 1;
        }
    }

    // Method will iterate through and print the array
    public static  void printLotteryArray(){

        for (int i = 0; i < lotteryNumbers.length - 1; i++) {
            System.out.println(lotteryNumbers[i]);
        }
        System.out.println("The PowerBall number is: " + lotteryNumbers[5]);
    }

}
