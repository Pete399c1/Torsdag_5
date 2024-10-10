package Task_1;

import java.util.ArrayList;

public class main1 {
    public static  void main(String[]args){
        ArrayList<Customer> customers = new ArrayList<Customer>();
        // add instanser til listen når det er et object
        customers.add(new Customer("Peter","Marcher","Pete399c"));
        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers){
        for(Customer c : customers){
            System.out.println(c);
        }
    }
}
