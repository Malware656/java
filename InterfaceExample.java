class SecondInterface{

    private SomeInterface interface1;

    // Assingning the param interface value to current class interface
    public SecondInterface(SomeInterface interface1){
        this.interface1 = interface1;
    }

    // Performing the task of Main class interface from Secondary class
    public void performTasks(){
        interface1.executeSomething("Called form Secondary");
        interface1.killSomethin(true);
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
class InterfaceExample{
    private static SomeInterface someInterface;
    public static void main(String[] args) {
        // Creating a new instance of interface
        someInterface = new SomeInterface(){
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
        };

        // Passing interface to secondary
        SecondInterface secondInterface = new SecondInterface(someInterface);
        secondInterface.performTasks();
        System.out.println();
        // Calling interface from current class
        someInterface.executeSomething("Called from Main");
        someInterface.killSomethin(false);
        System.out.println();

        new ThirdInterface();
        
    }

}

interface SomeInterface{
    
    void executeSomething(String arg);
    void killSomethin(boolean canKill);
}