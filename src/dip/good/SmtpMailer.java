package dip.good;

public class SmtpMailer implements Mailer {
    public void send() {
        System.out.println("Send: SmtpMailer");
    }
}
