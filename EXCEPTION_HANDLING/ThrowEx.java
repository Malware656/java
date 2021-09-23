class Validate{
    
    void checkUserNamePassword(String username, String password) throws AuthenticationException{
        if(username.length() <= 5){
            throw new AuthenticationException(AuthenticationException.ErrorMessages.INVALID_USERNAME, 403);
            // throw new InvalidUsernamException();
        }
        else if(username != "gokul656"){
            throw new AuthenticationException(AuthenticationException.ErrorMessages.INCORRECT_USERNAME, 201);
            // throw new IncorrectUsernameException();
        }
        else if(password.length() < 8){
            throw new AuthenticationException(AuthenticationException.ErrorMessages.INCORRECT_PASSWORD, 223);
            // throw new IncorrectPasswordException();
        }

    }
}
public class ThrowEx {
    public static void main(String[] args) {
        if(doValidate() == 0){
            System.out.println("Authentication Failed");
        }
        else{
            System.out.println("Authentication Successful");
        };
    }

    static int doValidate(){
        try{
            Validate val = new Validate();
            val.checkUserNamePassword("gokul656", "pssword");
            return 1;
        }
        catch(AuthenticationException e){
            /* 
                Handling multiple exceptions messages with AuthenticationException 
                ( One class with multiple messages )
            */
            System.out.printf("%s - ERROR CODE: %d\n", e.message, e.code);
        }
        finally{
            System.out.println("Process Finished");
        }
        return 0;
    }
}

// One Exception Class with multiple messages
class AuthenticationException extends Throwable{

    public ErrorMessages message;
    public int code;

    enum ErrorMessages{INCORRECT_PASSWORD, INVALID_USERNAME, INCORRECT_USERNAME};

    public AuthenticationException(ErrorMessages message, int code){
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message.name();
    }
}

// Multiple Exceptions classes with different purposes

/* class InvalidUsernamException extends Throwable{
    public InvalidUsernamException(){}
}
class IncorrectUsernameException extends Throwable{
    public IncorrectUsernameException(){}
}
class IncorrectPasswordException extends Exception{
    public IncorrectPasswordException(){}
} */
