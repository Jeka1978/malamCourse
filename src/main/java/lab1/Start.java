package lab1;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {
        DistributionService distributionService = new DistributionService();

        Message message = new Message();
        message.setText("I love pink floyd");
        message.setDistributionType("sms");


        distributionService.sendMessage(message);
    }
}
