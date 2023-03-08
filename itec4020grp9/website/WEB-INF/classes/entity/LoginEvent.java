
public class LoginEvent {
    public int code=-1;
    public String message="";

    public static LoginEvent create(int code,String message){
        var event=new LoginEvent();
        event.code=code;
        event.message=message;
        return event;
    }
}
