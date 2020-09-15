package command;

import java.util.List;

public class Select implements Command {

	@Override
	public void execute(List<String> commands) {
		System.out.println(String.join(", ", commands));

	}

	@Override
	public void undo(List<String> commands) {
		System.out.println("do not anything....");
	}

}
