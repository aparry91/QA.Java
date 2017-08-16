import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private String password;
    private static int uniqueId = 56920;
    private int customerId;
    List<Customer> customerList = new ArrayList<>();

    public Customer(String firstName, String lastName, boolean registered) {
        super(firstName, lastName, registered);

        uniqueId++;
        this.customerId = this.uniqueId;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(int customerId, String password) {
        //using customerId
        for (Customer c : customerList) {
            if (isRegistered() == false) {
                System.out.println("Please register");
            }
            while (isRegistered() == true) {
                if ((getCustomerId() == customerId) && (getPassword() == password)) {
                    System.out.println("Logged in");
                    break;
                } else if ((getCustomerId() == customerId) && (getPassword() != password)) {
                    System.out.println("Incorrect Password");
                    break;
                } else {
                    System.out.println("Invalid Credentials");
                    break;
                }
            }
        }
    }

    public void searchCustomer(String firstName) {
        //using customerId
        for (Customer c : customerList) {
            if (getFirstName().equals(firstName)) {
                System.out.println(c);
            }
        }
    }

    public void addCustomer(Customer c) {
        customerList.add(c);
    }

    public void registerPassword(int customerId, String password){
        for (Customer c : customerList){
            if (getCustomerId() == customerId) {
                setPassword(password);
                System.out.println("Password registered to : " + getPassword());
            } else {
                System.out.println("Error");
            }
        }
    }

    public void removeCustomer(int customerId, String password) {
        for (Customer c : customerList) {
            if (isRegistered() == false) {
                System.out.println("Please register");
            }
                while (isRegistered() == true) {
                    if ((getCustomerId() == customerId) && (getPassword() == password)) {
                        customerList.remove(c);
                        System.out.println("Deleted");
                        break;
                    } else if ((getCustomerId() == customerId) && (getPassword() != password)) {
                        System.out.println("Incorrect Password");
                        break;
                    } else {
                        System.out.println("Invalid Credentials");
                        break;
                    }

                }
            }
        }


    public void outputCustomerList(int customerId) {
        for (Customer c : customerList) {
            if (getCustomerId() == customerId) {
                System.out.println(c);
            } else {
                System.out.println("That customer does not exist");
            }
        }
    }

    public void ammendLogin(int customerId, String password, String firstName, String lastName) {

        for (Customer c : customerList) {
            if (isRegistered() == false) {
                System.out.println("Please register");
            }
                    while (isRegistered() == true) {
                        if ((getCustomerId() == customerId) && (getPassword() == password)) {
                            c.setFirstName(firstName);
                            c.setLastName(lastName);
                            System.out.println("First name: " + firstName + ", and Last name: " + lastName + ", succesfully ammended.");
                            break;
                        } else if ((getCustomerId() == customerId) && (getPassword() != password)) {
                            System.out.println("Incorrect Password");
                            break;
                        } else {
                            System.out.println("Invalid Credentials");
                            break;
                        }

                }
            }
        }


    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName=" + getLastName() +
                ", customerId=" + getCustomerId() +
                '}';
    }
}
