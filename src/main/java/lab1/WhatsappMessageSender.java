package lab1;

/**
 * @author Evgeny Borisov
 */
public class WhatsappMessageSender implements MessageSender {
    @Override
    public void send(Message message) {
        System.out.println("whatsapp was sent. Text is: "+message.getText());
    }
}
