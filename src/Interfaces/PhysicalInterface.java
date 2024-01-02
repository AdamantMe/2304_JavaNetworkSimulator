package Interfaces;

import Core.Packet;

public interface PhysicalInterface {
    void sendPacket(Packet packet);
    void receivePacket(Packet packet);
}