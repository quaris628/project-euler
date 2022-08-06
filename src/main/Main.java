package main;

import problem.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ----- Starting -----");
        long startTime = System.currentTimeMillis();
        int result = ActiveProblem.ACTIVE_PROBLEM.run(startTime);
        long endTime = System.currentTimeMillis();
        System.out.println(" ----- Complete -----");
        long duration = endTime - startTime;
        System.out.printf("Time elapsed: %1$3d.%1$ds",duration / 1000, duration % 1000);
        System.out.println("\nResult: " + result);
    }

}
