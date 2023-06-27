public class OrderDetailService {

    public void save(String orderId, String product){

        // Manual Conneciton
        // Connection connection = new Connection(
        //     "localhost",
        //     "root",
        //     "root"
        // )

        Connection Connection = DatabasePool.getConnection();
        connection.sql("INSERT INTO ORDER_DETAILS..");
        DatabasePool.close(connection);
    }

}
