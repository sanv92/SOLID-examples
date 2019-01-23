package dip.bad;

public class Main {
    public static void main(String[] args) {
        MailerService mailerService = new MailerService();

        // Send SMTP message
        mailerService.send(MailerType.SMTP);

        // Send SEND_GRID message
        mailerService.send(MailerType.SEND_GRID);
    }
}
