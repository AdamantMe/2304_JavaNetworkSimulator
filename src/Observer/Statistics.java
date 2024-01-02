package Observer;

import Core.Packet;

public class Statistics implements Observer {
    private int lostPackets;
    private float averageTravelTime;

    @Override
    public void update(Object arg) {
        if (arg instanceof Packet) {
        }
    }
}