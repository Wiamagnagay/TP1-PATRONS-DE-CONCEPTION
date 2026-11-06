package mediatheque;

public class PrintOnlyCDsVisitor implements ItemVisitor {

	@Override
	public void visit(Book book) {
	}

	@Override
	public void visit(CD cd) {
		System.out.println(cd);
	}
}