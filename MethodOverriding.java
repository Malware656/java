class OverridableOne{

    void doSomething(){
        System.out.println("Doing some func in overridable one!");
    }
}

class OverridableTwo extends OverridableOne{

    void doSomething(){
        System.out.println("Doing some func in overridable two!");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        OverridableOne overridableOne = new OverridableOne();
        overridableOne.doSomething();

        overridableOne = new OverridableTwo();
        overridableOne.doSomething();
    }   
}
