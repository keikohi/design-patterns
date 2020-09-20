package memento;

import java.util.Stack;

import memento.memento.Commit;
import memento.memento.WorkSpace;

public class Repository {
	public static void main(String[] args) {
		Stack<Commit> branch = new Stack<>();

		WorkSpace workSpace = new WorkSpace("1 ");

		Commit commit = workSpace.createCommit();
		branch.add(commit);
		workSpace.showCode();

		workSpace.addCode("2");
		workSpace.showCode();
		branch.add(workSpace.createCommit());

		workSpace.addCode("3");
		workSpace.showCode();
		branch.add(workSpace.createCommit());

		workSpace.restore(branch.pop());
		workSpace.showCode();

		workSpace.restore(branch.pop());
		workSpace.showCode();

		workSpace.restore(branch.pop());
		workSpace.showCode();

	}
}
