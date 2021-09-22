package ABSTRACTION;
class SecondInterface{

    private SomeInterface mInterface;

    // Assingning the param interface value to current class interface
    public SecondInterface(SomeInterface mInterface){
        this.mInterface = mInterface;
    }

    // Performing the task of Main class interface from Secondary class
    public void performTasks(){
        mInterface.executeSomething("Called form Secondary");
        mInterface.killSomethin(true);
    }
    
}

class InterfaceExample implements SomeInterface{
    private static SomeInterface mInterface;
    public static void main(String[] args) {
        // Creating a new instance of interface
        mInterface = new InterfaceExample();
        
        // Passing interface to secondary
        SecondInterface secondInterface = new SecondInterface(mInterface);
        secondInterface.performTasks();
        System.out.println();
        // Calling interface from current class
        mInterface.executeSomething("Called from Main");
        mInterface.killSomethin(false);
        System.out.println();

        new ThirdInterface();
        
    }


    @Override
    public void executeSomething(String arg) {
        System.out.println(arg);        
    }

    @Override
    public void killSomethin(boolean canKill) {
        if(canKill){
            System.out.println("Killed someone");
        }
        else{
            System.out.println("Cannot kill");
            mInterface.permisssionError();
        }
    }

}


class ThirdInterface implements SomeInterface{

    public ThirdInterface(){
        executeSomething("Executed from Third class");
        killSomethin(true);
    }

    @Override
    public void executeSomething(String arg) {
        System.out.println(arg);        
    }

    @Override
    public void killSomethin(boolean canKill) {
        if(canKill){
            System.out.println("Killed someone");
        }
        else{
            System.out.println("Cannot kill");
        }
    }

}
interface SomeInterface{
    
    void executeSomething(String arg);
    void killSomethin(boolean canKill);

    default void permisssionError(){
        System.out.println("Permission Error!");
    }
    default void authenticationError(){
        System.out.println("Permission Error!");
    }
}