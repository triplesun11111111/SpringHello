import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("helloworld")
public class HelloWorld {
 
    private String message;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
     
}