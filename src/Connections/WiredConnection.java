package Connections;

import Core.Connection;
import Core.Device;
import Core.Packet;

public class WiredConnection extends Connection {
    public WiredConnection(Device device1, Device device2) {
        super(device1, device2);
    }

    @Override
    public void transmitPacket(Packet packet) {

    }
}