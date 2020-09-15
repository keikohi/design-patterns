package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListStrage {
	private final List<String> strage = new ArrayList<>();

	private final OptionalQueue<Command> queue = new OptionalQueue<>();
	private final OptionalQueue<Command> finished = new OptionalQueue<>();

	public void accept(List<Command> commands) {
		commands.forEach(c -> queue.add(c));
	}

	private boolean executeCommand() {
		Optional<Command> op = queue.poll();
		if (op.isPresent()) {
			op.get().execute(strage);
			finished.add(op.get());
			return true;
		} else {
			return false;
		}

	}

	public void execute() {
		while (executeCommand()) {
		}
	}

	public void execute(Command c) {
		c.execute(strage);
		finished.add(c);
	}

	public boolean undoLastCommand() {
		Optional<Command> op = finished.poll();
		if (op.isPresent()) {
			Command c = op.get();
			c.undo(strage);
			return true;
		} else {
			return false;
		}

	}

}
