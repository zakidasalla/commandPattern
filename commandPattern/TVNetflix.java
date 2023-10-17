package commandPattern;

public class TVNetflix implements Command{
    private TV tv;

    public TVNetflix(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println(tv.openNetflix());
    }
}