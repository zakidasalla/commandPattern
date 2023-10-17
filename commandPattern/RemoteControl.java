package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> buttons = new ArrayList<>();

    public void addButton(Command command) {
        buttons.add(command);
    }
    public void pressButton(int choice) {
        buttons.get(choice).execute();
        buttons.clear();
    }
}
