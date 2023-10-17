package commandPattern;

public class ThermoIncFan implements Command{
    private Thermostat thermo;

    public ThermoIncFan(Thermostat thermo){
        this.thermo = thermo;
    }

    @Override
    public void execute() {
        System.out.println(thermo.increaseFan());
    }
}
