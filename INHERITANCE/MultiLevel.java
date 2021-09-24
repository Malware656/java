class BaseClass{
    // Base class
    void someFunction(){
        System.out.println("Doing a task in Base class!");
    }
}

class Derived extends BaseClass{
    // Derived class extending Base class
    void anotherFunction(){
        System.out.println("Some another function in Derived class!");
    }
}
class SecondDerived extends Derived{
    // Derived class extending another derived 
    void derivedFunciton(){
        System.out.println("Function executing in second Derived class!");
    }
}
public class MultiLevel extends SecondDerived{
    public static void main(String[] args) {
        MultiLevel mLevel = new MultiLevel();
        mLevel.someFunction();
        mLevel.anotherFunction();
        mLevel.derivedFunciton();
        
    }
}