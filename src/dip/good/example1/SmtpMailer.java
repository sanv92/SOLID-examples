package dip.good.example1;

public class SmtpMailer implements Mailer {
    public void send() {
        System.out.println("Send: SmtpMailer");
    }
}
