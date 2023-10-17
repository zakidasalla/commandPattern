package commandPattern;

public class Thermostat {

    public String turnOn() {
        return "The Thermostat is turned on";
    }

    public String turnOff() {
        return "The Thermostat is turned off";
    }
    public String increaseTemp() {
        return "The temperature increased";
    }

    public String decreaseTemp() {
        return "The temperature decreased";
    }

    public String increaseFan() {
        return "The Fan Speed increased";
    }

    public String decreaseFan() {
        return "The Fan Speed decreased";
    }
}
