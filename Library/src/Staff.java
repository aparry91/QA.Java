import java.util.ArrayList;
import java.util.List;

public class Staff extends Person {

    private String password;
    private static int uniqueId = 2017;
    private int staffId;


    List<Staff> staffList = new ArrayList<>();


    public Staff(String firstName, String lastName, boolean registered) {
        super(firstName, lastName, registered);
        uniqueId++;
        this.staffId = uniqueId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login(int staffId, String password) {
        //login using staffId

        if (isRegistered() == false) {
            return "Please register";
        }
        if (isRegistered() == true) {
        }
        if ((getStaffId() == staffId) && (getPassword() == password)) {
            return "Logged in";
        } else if ((getStaffId() == staffId) && (getPassword() != password)) {
            return "Incorrect Password";
        } else {
            return "Invalid Credentials";
        }
    }


    public void registerLogin() {
    }

    public void deleteLogin() {
    }

    public void ammendLogin() {
    }


}
