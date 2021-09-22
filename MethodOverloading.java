class OverLoading{

    void someFunc(){}

    void someFunc(int some){}

    void someFunc(String someData, int some){}
}
public class MethodOverloading extends OverLoading{
    public static void main(String[] args) {
        OverLoading overLoading = new OverLoading();
        overLoading.someFunc();
        overLoading.someFunc(22);
        overLoading.someFunc("Name", 21);
    }
}
