abstract class SomeAbstractClass{
    abstract void doSomething();
    abstract void doAnotherThing();

    void testFunc(){};
}

class SecondClass extends SomeAbstractClass implements TestInterFace{


    // Must to be implemented methods
    @Override
    void doSomething(){
        System.out.println("Abstract call!");
        doAnotherThing();
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
        SomeAbstractClass anotherClass = new SecondClass();
        anotherClass.doSomething();
    }
}

interface TestInterFace{
    void someFunc();
}