package dip.bad.example1;

public class MailerService {
    private SmtpMailer smtpMailer;
    private SendGridMailer sendGridMailer;

    public MailerService() {
        this.smtpMailer = new SmtpMailer();
        this.sendGridMailer = new SendGridMailer();
    }

    public void send(MailerType mailerType) {
        if("SMTP".equalsIgnoreCase(mailerType.toString()))
        {
            this.smtpMailer.send();
        }
        else if("SEND_GRID".equalsIgnoreCase(mailerType.toString()))
        {
            this.sendGridMailer.send();
        }
    }
}
