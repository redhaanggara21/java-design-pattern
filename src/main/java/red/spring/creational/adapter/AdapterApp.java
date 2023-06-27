public class AdapterApp {

    List<Object> list = new ArrayList<>();
    List<Object> listUsingAdapter = new ArrayList<>();

    // Book
    list.add(new Book("LinkedList", "Mr. Dao"));
    list.add(new Book( "Queue", "Mr. Bob"));
    list.add(new Book("Memmory Computer", "Mr. Mat"));
    list.add(new Book("Stack", "Sir. Kal"));

    // Film
    list.add(new Screencast("LinkedList", "Mr. Dao", 100L));
    list.add(new Screencast("Queue", "Mr. Bob", 140L));
    list.add(new Screencast("Memmory Computer", "Mr. Mat", 160L));
    list.add(new Screencast("Stack", "Sir. Kal", 180L));

    // Book Using Catalog Adapter
    listUsingAdapter.add(new BookCatalogAdapter(new Book("LinkedList", "Mr. Dao")));
    listUsingAdapter.add(new BookCatalogAdapter(new Book("Queue", "Mr. Bob")));
    listUsingAdapter.add(new BookCatalogAdapter(new Book("Memmory Computer", "Mr. Mat")));
    listUsingAdapter.add(new BookCatalogAdapter( new Book("Stack", "Sir. Kal")));

    // Book Using Screencast Adapter
    listUsingAdapter.add(
       new ScreencastCatalogAdapter(new Screencast("LinkedList", "Mr. Dao", 100L))
    );
    listUsingAdapter.add(
        new ScreencastCatalogAdapter(new Screencast("Queue", "Mr. Bob", 140L))
    );
    listUsingAdapter.add(
        new ScreencastCatalogAdapter(new Screencast("Memmory Computer", "Mr. Mat", 160L))
    );
    listUsingAdapter.add(
        new ScreencastCatalogAdapter(new Screencast("Stack", "Sir. Kal", 180L))
    );
    

    list.forEach(item -> {

        // without adapter
        // if(item instanceof Book){
        //     Book book = (Book) item;
        //     System.out.println(book.getTitle() + "by:" + book.getAuthor());
        // } else if(item instanceof Screencast){
        //     Screencast screencast = (Screencast) item;
        //     System.out.println(book.getTitle() + "by:" + book.getAuthor());
        // }

        // using adapter
        System.out.println(item.getCatalogTitle());
    });
}
