package commandPattern;

public class LightsOn implements Command{
    private Lights lights;

    public LightsOn(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println(lights.turnOn());
    }
}
