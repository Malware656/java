import java.util.ArrayList;

public class Association{
    public static ArrayList<Details> studentDetails =  new ArrayList<Details>();
    public static void main(String[] args) {
        populate();
        for(Details i : studentDetails){
            System.out.println(i.name);
        }
        System.out.println(studentDetails.get(0).contact.home);
    }
    
    static void populate(){
        Contact contact = new Contact("8759729933", "475982349402");
        studentDetails.add(new Details("Gokul", "22", contact));
        studentDetails.add(new Details("Satish", "22", contact));
        studentDetails.add(new Details("Thangavel", "22", contact));
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