class Base{
    public static void someFunction(){
        System.out.println("Performing a task in Base class");
    }
}
public class Single extends Base {
    public static void main(String[] args) {
        someFunction();
    }
}
