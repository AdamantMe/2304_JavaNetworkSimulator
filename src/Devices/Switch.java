package Devices;

import Core.Device;
import Core.Packet;

public class Switch extends Device {
    public Switch(String name) {
        super(name);
    }

    @Override
    public void sendPacket(Packet packet) {
    }

    @Override
    public void receivePacket(Packet packet) {
    }
}