package Simulation;

public class Event implements Comparable<Event> {
    private long time;
    private Runnable action;

    public Event(long time, Runnable action) {
        this.time = time;
        this.action = action;
    }

    public void execute() {
        action.run();
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.time, other.time);
    }
}