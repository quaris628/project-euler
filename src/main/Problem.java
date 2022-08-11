package main;

import static lib.util.IO.formatTime;

public abstract class Problem {
    private long startTime;
    private long endTime;
    private long doNotCountTime;

    protected Problem() {
        // make it obvious that initial startTime and endTime are garbage values
        startTime = -1;
        endTime = -2; // make endTime be before startTime so difference is negative
        // doNotCountTime starts with a legit 0 though
        doNotCountTime = 0;
    }

    public long runTimed() {
        System.out.println(this.getClass().getName().split("\\.")[1]);
        System.out.println(" ----- Starting -----");
        startTime = System.currentTimeMillis();
        long result = run();
        endTime = System.currentTimeMillis();
        System.out.println(" ----- Complete -----");
        System.out.print("Time: " + formatTime(endTime - startTime - doNotCountTime));
        System.out.println(" (" + formatTime(doNotCountTime) + " uncounted)");
        System.out.println("Result: " + result);
        return result;
    }

    protected abstract long run();

    protected void log(Object o) {
        long startDoNotCountTime = System.currentTimeMillis();
        System.out.println(o);
        doNotCountTime += System.currentTimeMillis() - startDoNotCountTime;
    }

    protected void log(Object message, Object o) {
        long startDoNotCountTime = System.currentTimeMillis();
        System.out.print(message);
        System.out.print(": ");
        System.out.println(o);
        doNotCountTime += System.currentTimeMillis() - startDoNotCountTime;
    }

    protected void logTime() {
        long startDoNotCountTime = System.currentTimeMillis();
        System.out.print("t=");
        System.out.println(formatTime(startDoNotCountTime - startTime - doNotCountTime));
        doNotCountTime += System.currentTimeMillis() - startDoNotCountTime;
    }

    protected void logTime(Object message) {
        long startDoNotCountTime = System.currentTimeMillis();
        System.out.print(message);
        System.out.print("t=");
        System.out.println(formatTime(startDoNotCountTime - startTime - doNotCountTime));
        doNotCountTime += System.currentTimeMillis() - startDoNotCountTime;
    }

}
