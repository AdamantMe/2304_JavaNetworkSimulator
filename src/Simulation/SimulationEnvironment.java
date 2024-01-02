package Simulation;

import jdk.jfr.Event;

import java.util.PriorityQueue;
import java.util.Queue;

public class SimulationEnvironment {
    private Queue<Event> events;

    public SimulationEnvironment() {
        this.events = new PriorityQueue<>();
    }

    public void scheduleEvent(Event event) {
        events.add(event);
    }

    public void run() {
    }
}