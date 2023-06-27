import java.red.spring.creational.repository;
import java.utills. List;

public class Repository {
    
    public static void main(String[] args){
        Product product = new Product();
        product.setId("1");
        product.setName("Example One");
        product.setPrice(1000);

        ProductRepository repository = new ProductRepository();
        repository.insert(product);

        product.setPrice(2000);

        repository.update(product);

        repository.delete(product.getId());

        List<Product> products = repository.selectAll();


        // manual state without using database pool

        // DatabasePool.getConnection().sql("insert into products(id, name, price) values(?,?,?)",
        //     product.getId(), product.getName(), product.getPrice()
        // );

        // DatabasePool.getConnection().sql("update products set name = ?, price = ? where id =?",
        //     product.getName(), product.getPrice(), product.getId()
        // );

    }
}
