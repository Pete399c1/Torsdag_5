package Task_1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    static int counter;

    public Customer(String firstName,String lastName,String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter++;
    }

    public String toString(){
        return (firstName + ": " + lastName +": " + userName +": " + id);
    }

}
