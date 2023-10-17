package commandPattern;

public class TVOff implements Command{
    private TV tv;

    public TVOff(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println(tv.turnOff());
    }
}
