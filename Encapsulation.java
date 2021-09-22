import java.io.PrintStream;

class Encapsulation{
    public static void main(String[] args) {

        PrintStream stream = System.out;
        SomeClass someClass = new SomeClass();
        someClass.setAge(22);
        someClass.setName("Some user's name");
        someClass.setGender("Male");

        stream.println(someClass.getName());
        stream.println(someClass.getAge());
        stream.println(someClass.getGender());
    }
}

class SomeClass{

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

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