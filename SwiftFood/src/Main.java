import com.infy.Customer;
import com.infy.Order;
import com.infy.Resturant;

public class Main {
    public static void main(String[] args) {

        Customer cust = new Customer("Buhari", 5098401987L, "D089, St. Louis street, Springfiel, 62729");
        cust.displayCustomerDetails();
//        cust.payBill(500, 10);
        Order order = new Order(101, "Alfredo","ordered", 35.0 );
        order.displaceOrderDetails();
        System.out.println("The Total Price: " +order.calculateTotalPrice(350));
        Resturant rest = new Resturant("Vue", 555666777L, "Abuja FCT", 4.1F);
        rest.displayResturantDetails();

    }

}