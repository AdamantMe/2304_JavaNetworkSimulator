package Packets;

import Core.Device;
import Core.Packet;

public class EthernetFrame extends Packet {
    public EthernetFrame(Device source, Device destination, String data, int size) {
        super(source, destination, data, size);
    }
}