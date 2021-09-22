package POLYMORPHISM;
class PrimaryClass{
    // Base methods
    void doSomething(){
        System.out.println("Doing some func in overridable one!");
    }
}

class SecondaryClass extends PrimaryClass{
    @Override // Overriding the pre-implemented method and modifying it's contents
    void doSomething(){
        System.out.println("Doing some func in overridable two!");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        PrimaryClass primary = new PrimaryClass();
        primary.doSomething();

        primary = new SecondaryClass();
        primary.doSomething();
    }   
}

