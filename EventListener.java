package de.evianwasser.jevents;

public interface EventListener<T extends Event> {
    void onEvent(T event);

    default int getPriority() {
        return 0;
    }
}
