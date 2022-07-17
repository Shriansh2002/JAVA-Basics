package OOP.I;

class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Turned On");
    }

    void turnOff() {
        isOn = false;
        System.out.println("Turned Off");
    }

};

public class declaring {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.turnOn();
        lamp.turnOff();
    }
}
