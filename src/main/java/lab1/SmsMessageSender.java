package lab1;

/**
 * @author Evgeny Borisov
 */
public class SmsMessageSender implements MessageSender {
    @Override
    public void send(Message message) {
        //to 55 lines of code which really send sms
        System.out.println(message.getText()+" was sent by sms");

    }
}
