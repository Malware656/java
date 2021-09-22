abstract class SomeClosedClass{
    abstract void doSomething();
    abstract void doAnotherThing();

    void testFunc(){};
}

class SomeAnotherClass extends SomeClosedClass implements TestInterFace{


    // Must to be implemented methods
    @Override
    void doSomething(){
        System.out.println("Abstract call!");
    }

    @Override
    void doAnotherThing() {
        System.out.println("Abstract call to doAnother thing!");
    }

    @Override
    public void someFunc() {
        System.out.println("Abstract call with interface to someFunc!");
    }

    // Not so important methods ( Optional implementations )
    @Override
    void testFunc(){
        System.out.println("Abstract call to testFunc!");
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        SomeClosedClass anotherClass = new SomeAnotherClass();
        anotherClass.doSomething();
    }
}

interface TestInterFace{
    void someFunc();
}