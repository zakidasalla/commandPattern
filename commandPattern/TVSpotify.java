package commandPattern;

public class TVSpotify implements Command{
    private TV tv;

    public TVSpotify(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println(tv.openSpotify());
    }
}