package lab1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class DistributionService {

    private Map<String, MessageSender> messageSenderMap = new HashMap<>();

    public DistributionService() {
        messageSenderMap.put("mail", new EmailMessageSender());
        messageSenderMap.put("whatsapp", new WhatsappMessageSender());
        messageSenderMap.put("sms", new SmsMessageSender());


    }

    public void sendMessage(Message message) {
        String type = message.getDistributionType();
        MessageSender messageSender = messageSenderMap.get(type);
        if (messageSender == null) {
            throw new IllegalStateException(type + " not supported yet");
        }
        messageSender.send(message);

    }
}
