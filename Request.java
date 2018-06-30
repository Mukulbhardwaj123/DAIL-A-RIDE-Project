package com.heckercode.utilities;

public class Request {
    int src;
    int dest;

    public void setSrc(int src) {
        this.src = src;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    int startTime;

    public int getSrc() {
        return src;
    }

    public int getDest() {
        return dest;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    int endTime;
}
