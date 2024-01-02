package Devices;

import Core.Device;
import Core.Packet;

public class Host extends Device {
    public Host(String name) {
        super(name);
    }

    @Override
    public void sendPacket(Packet packet) {
        // For simulation purposes
        System.out.println(getName() + " sent packet to " + packet.getDestination().getName());
    }

    @Override
    public void receivePacket(Packet packet) {
        // For simulation purposes
        System.out.println(getName() + " received packet from " + packet.getSource().getName());
    }
}
