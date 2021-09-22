import java.io.PrintStream;

class Encapsulation{
    public static void main(String[] args) {

        PrintStream stream = System.out;
        DataClass dataClass = new DataClass();
        dataClass.setAge(22);
        dataClass.setName("Some user's name");
        dataClass.setGender("Male");

        stream.println(dataClass.getName());
        stream.println(dataClass.getAge());
        stream.println(dataClass.getGender());
    }
}

class DataClass{

    private String name;
    private int age;
    private String gender;

    // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
}