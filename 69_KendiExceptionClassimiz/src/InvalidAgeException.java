//kendi oluşturduğumuz Exception classımız: InvalidAgeException
public class InvalidAgeException extends ArithmeticException { //ArithmeticException dan Extend ettik (unchecked exceptiondan ettik yani)
                                           // unchecked exceptiondan extend ettiğimiz için InvalidAgeException da unchecked exception oldu.
    public InvalidAgeException(String message) {  // constructor.
        super(message);        
    }
    
    @Override
    public void printStackTrace() {  // override ettik ve doldurduk kafamıza göre
        System.out.println("Bu bir invalid age hatasıdır...");
    }    
}
