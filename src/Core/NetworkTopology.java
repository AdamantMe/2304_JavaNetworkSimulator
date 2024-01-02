package Core;

import java.util.ArrayList;
import java.util.List;

public class NetworkTopology {
    private List<Device> devices;
    private List<Connection> connections;

    public NetworkTopology() {
        this.devices = new ArrayList<>();
        this.connections = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void addConnection(Connection connection) {
        connections.add(connection);
    }
}
