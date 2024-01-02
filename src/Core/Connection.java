package Core;

public abstract class Connection {
    protected Device device1;
    protected Device device2;
    protected String status;
    protected int delay;

    public Connection(Device device1, Device device2) {
        this.device1 = device1;
        this.device2 = device2;
        this.status = "active"; // default
        this.delay = 0; // default
    }

    public abstract void transmitPacket(Packet packet);
}