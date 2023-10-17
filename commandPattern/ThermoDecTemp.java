package commandPattern;

public class ThermoDecTemp implements Command{
    private Thermostat thermo;

    public ThermoDecTemp(Thermostat thermo){
        this.thermo = thermo;
    }

    @Override
    public void execute() {
        System.out.println(thermo.decreaseTemp());
    }
}
