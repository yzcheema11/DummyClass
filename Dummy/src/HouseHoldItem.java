public class HouseHoldItem {
    private boolean isOn;
    private String itemName;
    private int timer;

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public HouseHoldItem(String itemName, int timer) {
        this.itemName = itemName;
        this.timer = timer;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void switchOn() {
        this.isOn = true;
    }
}
