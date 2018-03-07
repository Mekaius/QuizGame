
package neppo.ic;

abstract class user {

    private String firstName;
    private String lastName;
    private String eMail;
    private int age;
    
    public user(String firstName, String lastName, String eMail, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.age = age;

    }

    public String getLastName() {
        return lastName;
    }

    public void lastName(String lastName) {
            this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}
