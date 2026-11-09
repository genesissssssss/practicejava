import java.util.ArrayList;
import java.util.List;

public class Notification_System {
    public static void main(String[] args){

        List<Notification> notifications = new ArrayList<>();

        notifications.add(new Email_Notification());
        notifications.add(new Push_Notification());
        notifications.add(new Sms_Notification());

        String alertMessage = "Your package has been shipped!";

        for (Notification notification : notifications){
            notification.sendNotification(alertMessage);
        }




    }
}
