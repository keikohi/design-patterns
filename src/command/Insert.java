package command;

import java.util.List;

public class Insert implements Command {

	private final String record;

	public Insert(String record) {
		this.record = record;
	}

	@Override
	public void execute(List<String> commands) {
		commands.add(record);

	}

	@Override
	public void undo(List<String> commands) {
		commands.remove(commands.size() - 1);
	}

}
