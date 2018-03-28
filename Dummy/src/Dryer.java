public class Dryer {

    private boolean isOn;
    private int heat;
    private int timer;

    //variables
    String results = "";
    String onOrOff = "";
    String heatLevel = "";
    String isTimed = "";

    //Default constructor
    public Dryer() {
        timer = 0;
        heat = 0;
        isOn = false;
    }

    //constructor
    public Dryer(int time, int level, boolean c) {
        timer = time;
        heat = level;
        isOn = c;
    }

    //getter methods
    public int getTimer() {
        return timer;
    }

    public int getHeat() {
        return heat;
    }

    public boolean isOn() {
        return isOn;
    }
    //setter methods

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String toString() {
        if (isOn) {
            onOrOff = "The Dryer is on, ";
            if (heat > 5) {
                heatLevel = "and it is drying the clothes at high heat, ";
            } else {
                heatLevel = "and it is drying the clothes at low heat, ";
            }
            if (timer > 0) {
                isTimed = "and your clothes will be dry in " + timer + " minutes";
            } else {
                isTimed = "and timer needs to be set";
            }
            results = onOrOff + heatLevel + isTimed;
        } else {
            results = "Please turn the dryer on";
        }
        return results;
    }
}
