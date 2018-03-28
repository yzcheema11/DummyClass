public class DryerTest {

    public static void main(String[] args) {
        Dryer dryer = new Dryer(20, 6, true);
        Dryer dryer2 = new Dryer();
        System.out.println("Dryer 1: " + dryer.toString());
        System.out.println("");
        System.out.println("Dryer 2: " + dryer2.toString());
        System.out.println("");
        dryer2.setOn(true);
        System.out.println("Dryer 2: " + dryer2.toString());
    }
}
