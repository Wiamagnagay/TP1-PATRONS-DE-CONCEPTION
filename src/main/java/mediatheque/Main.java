package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new Book("VICTOR HUGO", "Les Misérables"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        mediatheque.addItem( new CD(20, "TOTO"));

        mediatheque.printCatalog();
         System.out.println("=== Catalogue complet ===");
        mediatheque.accept(new PrintCatalogVisitor());

        System.out.println("\n=== Livres seulement ===");
        mediatheque.accept(new PrintOnlyBooksVisitor());

        System.out.println("\n=== CD seulement ===");
        mediatheque.accept(new PrintOnlyCDsVisitor());


//mediatheque.printOnlyBooks();
        //mediatheque.printOnlyCDs();
    }
}
