package command;

import java.util.List;

public interface Command {
	public void execute(List<String> commands);

	public void undo(List<String> commands);
}
