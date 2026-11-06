package mediatheque;

public class PrintCatalogVisitor implements ItemVisitor {

	@Override
	public void visit(Book book) {
		System.out.println(book);
	}

	@Override
	public void visit(CD cd) {
		System.out.println(cd);
	}
}