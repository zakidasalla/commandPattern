package commandPattern;

public class TVOn implements Command{
    private TV tv;

    public TVOn(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println(tv.turnOn());
    }
}

