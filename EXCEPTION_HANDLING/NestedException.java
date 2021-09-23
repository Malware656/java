import java.util.logging.Logger;

public class NestedException {
    public static void main(String[] args) {
        int x = 10;
        try{
            try{
                x = x/0;
            }
            catch(ArithmeticException e){
                System.err.println(e);
            }
            // Whatever exception may arise those are caught in above catch which prevent program from terminating
            // Performing some other task regardless of any error
            Integer.parseInt("23r"); // throws Exception
            System.out.println("Parsed the String");
        }
        catch(NumberFormatException e){
            System.err.println(e);
        }
        finally{
            // Killing the JVM finally 
            System.out.println("Program Execution Finished!");
            System.exit(0);
        }
    }
}
