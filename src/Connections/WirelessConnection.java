package Connections;

import Core.Connection;
import Core.Device;
import Core.Packet;

public class WirelessConnection extends Connection {
    public WirelessConnection(Device device1, Device device2) {
        super(device1, device2);
    }

    @Override
    public void transmitPacket(Packet packet) {

    }
}