package Core;

import Interfaces.NetworkInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class Device {
    protected String name;
    protected List<NetworkInterface> interfaces;

    public Device(String name) {
        this.name = name;
        this.interfaces = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public abstract void sendPacket(Packet packet);
    public abstract void receivePacket(Packet packet);
}
