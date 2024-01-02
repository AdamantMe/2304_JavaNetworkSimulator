package Packets;

import Core.Device;
import Core.Packet;

public class IPPacket extends Packet {
    public IPPacket(Device source, Device destination, String data, int size) {
        super(source, destination, data, size);
    }
}