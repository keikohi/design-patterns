package visitor;

public class PrintPathVisitor implements Visitor {

	private String currentDir = "";
	private static final String SEPARATOR = System.getProperty("file.separator");

	@Override
	public void visit(File file) {
		System.out.println(currentDir + SEPARATOR + file.getName());
	}

	@Override
	public void visit(Dir dir) {
		String backup = currentDir;
		currentDir = String.join(SEPARATOR, currentDir, dir.getName());
		for (Entry entry : dir.getChilds()) {

			System.out.println(currentDir);
			entry.accept(this);
		}
		currentDir = backup;
	}

}
