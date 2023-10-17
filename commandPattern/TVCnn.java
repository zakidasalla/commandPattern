package commandPattern;

public class TVCnn implements Command{
    private TV tv;

    public TVCnn(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println(tv.openCNN());
    }
}
