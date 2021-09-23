import java.util.ArrayList;

public class SmallFunction {
    public static void main(String[] args) {
        DemoDataClass dataClass = new DemoDataClass();
        dataClass.setName("GOkul");

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(
            (item) -> System.out.println(item)
        );
        
    }
}

class DemoDataClass{
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}