package OOPS.Encapsulations;

// here i create a student class
class student{
    // keeping name as private
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
public class Encapsulation {
    
    public static void main(String[] args) {
        // creating student object
        student s = new student();
        s.setName("harish");
        System.err.println(s.getName());
    }
}
