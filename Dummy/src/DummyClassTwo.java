import java.util.*;

public class DummyClassTwo {
    public static void main(String[] args) {

        for (int i = 1; i < 55; i++) {// for loop that starts at 0 and increments by 1 up to 55
            if (i % 2 == 0) {// if statement that checks if each increment is even. If there is no remainder, the number is even and the program will continue.
                System.out.println("Even #s are: " + i);// the results will be print if the number is even
            }
        }
    }
}