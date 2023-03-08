
import com.example.demo.entity.LoginEvent;
import com.example.demo.util.UserInfoHelper;

public class UserService {
    public static LoginEvent userLogin(String id, String pwd){
        String fakeId= UserInfoHelper.userName;
        String fakePwd= UserInfoHelper.password;

        if (!id.equals(fakeId)) return LoginEvent.create(1,"Wrong Id or Password");
        if (!id.equals(fakePwd)) return LoginEvent.create(1,"Wrong Id or Password");

        return LoginEvent.create(0,"Login Successful");
    }
}
