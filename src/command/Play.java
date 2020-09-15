package command;

import java.util.List;

import org.junit.Test;

public class Play {
	@Test
	public void play() {
		ListStrage strage = new ListStrage();

		{
			List<Command> commands = List.of(new Insert("小"), new Insert("平"), new Insert("圭"));
			strage.accept(commands);
			strage.execute();
		}

		{
			strage.execute(new Select());
			strage.undoLastCommand();
			strage.execute(new Select());
			List<Command> commands = List.of(new Insert("圭"), new Insert("祐"));
			strage.accept(commands);
			strage.execute();
			strage.execute(new Select());
		}

	}
}
