public class Sms_Notification implements Notification{

    @Override
    public void sendNotification(String message){

        System.out.println("Sending sms: " + message);

    }
}
