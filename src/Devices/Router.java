package Devices;

import Core.Device;
import Core.Packet;

public class Router extends Device {
    public Router(String name) {
        super(name);
    }

    @Override
    public void sendPacket(Packet packet) {
    }

    @Override
    public void receivePacket(Packet packet) {
    }
}