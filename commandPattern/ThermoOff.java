package commandPattern;

public class ThermoOff implements Command{
    private Thermostat thermo;

    public ThermoOff(Thermostat thermo){
        this.thermo = thermo;
    }

    @Override
    public void execute() {
        System.out.println(thermo.turnOff());
    }
}
