import java.util.ArrayList;

public class Association{
    public static void main(String[] args) {

        ArrayList<Details> studentDetails =  new ArrayList();
        Contact contact = new Contact("8759729933", "475982349402");

        studentDetails.add(new Details("Gokul", "22", contact));
        System.out.println(studentDetails.get(0).contact.home);
    }
}
class Details{
    String name;
    String age;
    Contact contact;
    public Details(String name, String age, Contact contact){
        this.name = name;
        this.age = age;
        this.contact = contact;
    }
}

class Contact{
    String home;
    String office;

    public Contact(String home, String office){
        this.home = home;
        this.office = office;
    }
}