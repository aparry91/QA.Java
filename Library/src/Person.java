public abstract class Person implements SystemLogin {

    private String firstName;
    private String lastName;
    private boolean registered;

    public Person (String firstName, String lastName, boolean registered){
        this.firstName = firstName;
        this.lastName = lastName;
        this.registered = registered;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public void login(){
    }

    public void registerLogin(){
    }

    public void deleteLogin(){
    }

    public void ammendLogin(){
    }

}
