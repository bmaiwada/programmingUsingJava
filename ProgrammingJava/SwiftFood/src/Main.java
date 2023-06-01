import com.infy.Customer;

public class Main {
    public static void main(String[] args) {

        Customer cust = new Customer();
        cust.customerId = "C12";
        cust.customerName = "Buhari";
        cust.contactNumber = 5098401987L;
        cust.address = "D089, St. Louis street, Springfiel, 62729";

        cust.displayCustomerDetails();
    }
}