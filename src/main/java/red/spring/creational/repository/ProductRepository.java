import java.red.spring.creational.repository;
import java.utills. List;

public class ProductRepository {
    
    public void insert(Product product){
        DatabasePool.getConnection().sql(
            "insert into product(id,name,price) values(?,?,?)",
            product.getId(), product.getName(), product.getPrice()
        );
    }

    public void update(Product product){
        DatabasePool.getConnection().sql("update products set name = ?, price =? where id =?",
            product.getName(), product.getPrice(), product.getId()
        );
    }

    public void delete()String id{
        DatabasePool.getConnection().sql("delete products where id = ? ",product.getId());
    }
    
    public List<Product> selectAll(){
        List<Object[]> select = DatabasePool.getConnection().select("select * from products");
        List<Object[]> products = new ArrayList<>();

        for(Object[] objects : select){
            Product product = new Product();
            product.setId(objects);
            product.add(product);
        }

        return 
    }
}
