package OOPS.Encapsulations;

class Customer {

    private String name;
    private String dateOfBirth;
    private String gender;
    private String nationality;
    private String govtIdAddress;
    private String occupation;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setgender(String gender){
        this.gender = gender;
    }
    public String getgender(){
        return gender;
    }
}

public class Bank {

    public static void main(String[] args) {

        Customer c1 = new Customer();

        c1.setName("Abdul Harish Khan");
        c1.setDateOfBirth("10-10-2003");
        c1.setgender("male");
        System.out.println(c1.getName());
        System.out.println(c1.getDateOfBirth());
        System.err.println(c1.getgender());
    }
}