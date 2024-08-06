public class Message implements MessageInterface {
    String senderName;
    String receiverName;
    String textMessage;
    MessageStatus status;

public Message(String senderName, String receiverName, String textMessage) {
    this.senderName = senderName;
    this.receiverName = receiverName;
    this.textMessage = textMessage;
    this.status= MessageStatus.SENT;

}


    @Override
    public String getSenderName() {
        return senderName;
    }

    @Override
    public String getReceiverName() {
        return receiverName;
    }

    @Override
    public String getTextMessage() {
        return textMessage;
    }

    @Override
    public MessageStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(MessageStatus status) {
    this.status = status;

    }
}
