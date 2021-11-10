package lab1;

/**
 * @author Evgeny Borisov
 */
public class EmailMessageSender implements MessageSender {
    @Override
    public void send(Message message) {
        // todo 40 lines of code which really send mail
        System.out.println("mail was sent. Text is: "+message.getText());
    }
}
