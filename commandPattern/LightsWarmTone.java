package commandPattern;

public class LightsWarmTone implements Command{
    private Lights lights;

    public LightsWarmTone(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println(lights.changeToWarmTone());
    }
}
