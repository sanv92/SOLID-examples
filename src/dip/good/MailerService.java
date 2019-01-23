package dip.good;

public class MailerService {
    private Mailer mailer;

    public MailerService(Mailer mailer) {
        this.mailer = mailer;
    }

    public void send() {
        this.mailer.send();
    }
}
