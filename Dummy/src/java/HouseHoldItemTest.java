public class HouseHoldItemTest {

    public static void main(String[] args) {
        HouseHoldItem item = new HouseHoldItem("Fan", 20);
        System.out.println("Fan is On: " + item.isOn());
        item.switchOn();
        System.out.println("Fan is On: " + item.isOn() + " and the timer is set for: " + item.getTimer() + " minutes");
    }

}

