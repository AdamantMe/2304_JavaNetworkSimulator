package Interfaces;

import Core.Packet;

public interface DataLinkInterface {
    void framePacket(Packet packet);
    void deframePacket(Packet packet);
}