public class Email_Notification implements Notification {

    @Override
    public void sendNotification(String message){
        System.out.println("Sending Email: " + message);
    }
}
