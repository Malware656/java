class OverLoadableMethod{
    // Create some methods with different params
    void someFunc(){}

    void someFunc(int some){}

    void someFunc(String someData, int some){}
}
public class MethodOverloading extends OverLoadableMethod{
    public static void main(String[] args) {
        OverLoadableMethod overLoadableMethod = new OverLoadableMethod();
        overLoadableMethod.someFunc();
        overLoadableMethod.someFunc(22);
        overLoadableMethod.someFunc("Name", 21);
    }
}
