package com.company;

public class Timer
{

    private long startTimer;
    private long endTimer;

    public void setStartTime()
    {
        this.startTimer = System.currentTimeMillis();
    }
    public void setEndTime()
    {
        this.endTimer = System.currentTimeMillis();
    }

    public long calcTime()
    {
        return endTimer - startTimer;
    }
}
