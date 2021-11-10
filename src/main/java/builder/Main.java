package builder;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer(29, 3, 6);

        Customer customer = Customer.builder().age(29).numberOfAccidents(3).build();
        System.out.println(customer.getAge());
    }
}
