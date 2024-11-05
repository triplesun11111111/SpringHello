import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("cat")
@Scope("prototype")
public class Cat {
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
