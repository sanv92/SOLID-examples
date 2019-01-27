package dip.good.example1;

public class MailerService {
    private Mailer mailer;

    public MailerService(Mailer mailer) {
        this.mailer = mailer;
    }

    public void send() {
        this.mailer.send();
    }
}
