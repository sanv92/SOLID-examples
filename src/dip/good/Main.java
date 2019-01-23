package dip.good;

public class Main {
    public static void main(String[] args) {
        Mailer smtpMailer = new SmtpMailer();
        MailerService mailerService = new MailerService(smtpMailer);

        mailerService.send();
    }
}
