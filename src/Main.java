import Core.*;
import Devices.*;
import Connections.*;
import Packets.*;
import Builder.*;

public class Main {
    public static void main(String[] args) {
        // Initialize a TopologyBuilder. Although we're not using the Builder pattern yet, the class is intended to incrementally
        // construct a NetworkTopology. The buildTopology method will be expanded later, to include detailed setup steps.
        TopologyBuilder builder = new TopologyBuilder();
        NetworkTopology networkTopology = builder.buildTopology("Basic Topology");

        // Create instances of network devices. Later we'll use the Factory pattern to create these objects.
        Device router1 = new Router("Router1");
        Device switch1 = new Switch("Switch1");
        Device host1 = new Host("Host1");
        Device host2 = new Host("Host2");

        // Add devices to the topology. The NetworkTopology class will eventually manage a complex graph of devices and connections.
        networkTopology.addDevice(router1);
        networkTopology.addDevice(switch1);
        networkTopology.addDevice(host1);
        networkTopology.addDevice(host2);

        // Manually create connections between devices. These could also be created using a Factory pattern to handle different types
        // of connections such as wired, wireless, optical, etc. This would provide a single interface for connection creation.
        Connection wiredConnection1 = new WiredConnection(router1, switch1);
        Connection wiredConnection2 = new WiredConnection(switch1, host1);
        Connection wiredConnection3 = new WiredConnection(switch1, host2);

        // Adding the connections to the network topology. Can expand the Builder pattern and integrate it there.
        networkTopology.addConnection(wiredConnection1);
        networkTopology.addConnection(wiredConnection2);
        networkTopology.addConnection(wiredConnection3);

        // Construct a packet to simulate network traffic. In an actual simulation, packets would be created dynamically based on
        // network activity. The Factory pattern can be useful here to generate different types of packets.
        Packet packet = new IPPacket(host1, host2, "Hello, Host2!", 1024);

        // Simulate sending a packet in the network. In a full simulation, the packet would go through a series of transmission steps
        // determined by the implemented protocols at the Physical, Data Link, and Network layers (represented by same name interfaces).
        host1.sendPacket(packet);

        // For now, directly handing off the packet to host2. In a more complex simulation, packets would travel through the network.
        host2.receivePacket(packet);

        // The simulation is currently very simple and straightforward.
        // Later, use the Observer pattern for a more dynamic simulation based on events.
        // Additionally, use the Singleton pattern for shared resources like a network configuration manager or a centralized logger.

        System.out.println("Simulation completed.");
    }
}