package commandPattern;

public class ThermoIncTemp implements Command{
    private Thermostat thermo;

    public ThermoIncTemp(Thermostat thermo){
        this.thermo = thermo;
    }

    @Override
    public void execute() {
        System.out.println(thermo.increaseTemp());
    }
}
