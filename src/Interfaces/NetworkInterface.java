package Interfaces;

import Core.Packet;

public interface NetworkInterface {
    void routePacket(Packet packet);
}