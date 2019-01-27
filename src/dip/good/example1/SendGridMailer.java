package dip.good.example1;

public class SendGridMailer implements Mailer {
    public void send() {
        System.out.println("Send: SendGridMailer");
    }
}
