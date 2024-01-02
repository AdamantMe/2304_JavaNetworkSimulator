package Observer;

public class Logger implements Observer {
    @Override
    public void update(Object arg) {
        // Implementation for logging events or updates.
        if (arg instanceof String) {
            System.out.println("Log: " + arg);
        }
    }
}