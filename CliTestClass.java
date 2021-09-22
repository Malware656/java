public class CliTestClass {
    public static void main(String[] args) {
      String name;
      int age;
      name = System.getProperty("userName");
      
      try{
        if(name == null){
          System.out.println("Name not provided");
        }
        else if(System.getProperty("age") == null){
          System.out.println("Age not provided");
        }
        else{
          age = Integer.parseInt(System.getProperty("age"));
          System.out.printf("Name : %s \n", name);
          System.out.printf("Age : %d \n", age);
        }
      }
      catch (NumberFormatException e){
        System.out.println("Give proper integer as Age");
      }
    }
}

// To Run javac CliTestClass.java && java -DuserName=someName -Dage=23 CliTestClass 
