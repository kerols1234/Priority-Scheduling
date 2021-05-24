package com.company;

public class Process {
    private String name;
    private int ArrivalTime;
    private int ExecutionTime;
    private int priority;
    private int waitingTime;
    private int turnAroundTime;

    public Process(String name, int arrivalTime, int executionTime, int priority) {
        this.name = name;
        ArrivalTime = arrivalTime;
        ExecutionTime = executionTime;
        this.waitingTime = 0;
        this.turnAroundTime = executionTime;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public int getExecutionTime() {
        return ExecutionTime;
    }

    public void setExecutionTime(int executionTime) {
        ExecutionTime = executionTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

}
