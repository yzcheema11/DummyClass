import java.util.*;

public class DummyClassTwo {

    int twoDArray [][];


    public DummyClassTwo(){
        Random r = new Random(10);
        twoDArray = new int[5][10];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                twoDArray[i][j]= (int)r.nextInt(10);
            }
        }
    }
    public void display(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.println(twoDArray[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        DummyClassTwo dummyClassTwo = new DummyClassTwo();
        dummyClassTwo.display();
    }
}