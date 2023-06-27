package red.spring.creational.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonApplication {

  // @Bean
  // public Counter counter(){
  //   return new Counter();
  // }

  // public void save (String orderId, String product){
  //   Connection connection = new Connection(
  //     "localhost",
  //     "root",
  //     "root"
  //   );
  //   connection.sql("INSERT INTO ORDER_DETAILS...")
  // }

  public static void main(String[] args){
    OrderService orderService = new OrderService();
    orderService.save("001");

    OrderDetailService orderDetailService = new OrderDetailService();
    orderDetailService.save(
      "0001",
      "IndoMie"
    );
    orderDetailService.save(
      "0002",
      "Sabun"
    );
    orderDetailService.save(
      "0003",
      "Pepsodent"
    );
  }
}
