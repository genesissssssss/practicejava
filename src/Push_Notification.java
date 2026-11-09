public class Push_Notification implements Notification {

    @Override
    public void sendNotification(String message){

        System.out.println("Sending Push Notification: " + message);

    }
}
