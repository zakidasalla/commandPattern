package commandPattern;

public class ThermoOn implements Command{
    private Thermostat thermo;

    public ThermoOn(Thermostat thermo){
        this.thermo = thermo;
    }

    @Override
    public void execute() {
        System.out.println(thermo.turnOn());
    }
}
