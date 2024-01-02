package Core;

public abstract class Packet {
    protected Device source;
    protected Device destination;
    protected String data;
    protected int size;

    public Packet(Device source, Device destination, String data, int size) {
        this.source = source;
        this.destination = destination;
        this.data = data;
        this.size = size;
    }

    public Device getSource() {
        return source;
    }

    public Device getDestination() {
        return destination;
    }

    public String getData() {
        return data;
    }

    public int getSize() {
        return size;
    }
}
