import java.io.IOException;
//kendi oluşturduğumuz Exception classımız: InvalidAgeException2
public class InvalidAgeException2 extends IOException { //IOException dan Extend ettik (checked exceptiondan ettik yani)
                                           // checked exceptiondan extend ettiğimiz için InvalidAgeException2 de checked exception oldu.
    public InvalidAgeException2(String message) {  // constructor.
        super(message);        
    }
    
    @Override
    public void printStackTrace() {  // override ettik ve doldurduk kafamıza göre
        System.out.println("Bu bir invalid age hatasıdır...");
    }    
}

