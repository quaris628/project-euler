package problem;

public abstract class Problem {
    private long startTime;

    public int run(long startTime) {
        this.startTime = startTime;
        return run();
    }

    protected abstract int run();

    protected void log(Object o) {
        System.out.println(o);
    }

    protected void log(String message, Object o) {
        System.out.println(message + ": " + o);
    }

    protected void logTime() {
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
