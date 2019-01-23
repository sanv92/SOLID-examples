package dip.good;

public class SendGridMailer implements Mailer {
    public void send() {
        System.out.println("Send: SendGridMailer");
    }
}
