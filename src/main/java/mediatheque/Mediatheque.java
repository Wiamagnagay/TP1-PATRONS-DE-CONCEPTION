package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	// Fait visiter tous les items par le visiteur donné
	public void accept(ItemVisitor visitor) {
		for (Item i : items)
			i.accept(visitor);
	}

	public void printCatalog() {
		accept(new PrintCatalogVisitor());
	}

	public void printOnlyBooks() {
		accept(new PrintOnlyBooksVisitor());
	}

	public void printOnlyCDs() {
		accept(new PrintOnlyCDsVisitor());
	}

}
