package commandPattern;

public class LightsCoolTone implements Command{
    private Lights lights;

    public LightsCoolTone(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println(lights.changeToCoolTone());
    }
}
