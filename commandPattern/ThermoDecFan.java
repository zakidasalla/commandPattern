package commandPattern;

public class ThermoDecFan implements Command{
    private Thermostat thermo;

    public ThermoDecFan(Thermostat thermo){
        this.thermo = thermo;
    }

    @Override
    public void execute() {
        System.out.println(thermo.decreaseFan());
    }
}
