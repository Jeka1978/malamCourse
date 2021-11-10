package lab1;

/**
 * @author Evgeny Borisov
 */
public class Message {
    private String text;
    private String distributionType;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(String distributionType) {
        this.distributionType = distributionType;
    }
}
