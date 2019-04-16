package rocks.zipcode.io.objectorientation;


public class Television {
    Integer channel;
    public Boolean isOn;

    public void turnOn() {
       isOn = true;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public TVChannel getChannel() {
        if (!isOn)
            throw new IllegalStateException();
        else
            return TVChannel.getByOrdinal(channel);

    }
}

