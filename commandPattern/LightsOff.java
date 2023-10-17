package commandPattern;

public class LightsOff implements Command{
    private Lights lights;

    public LightsOff(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println(lights.turnOff());
    }
}
