package de.evianwasser.jevents;

public abstract class CancelableEvent extends Event {
    private boolean canceled;

    public boolean isCanceled() {
        return canceled;
    }

    public void cancel() {
        canceled = true;
    }
}
