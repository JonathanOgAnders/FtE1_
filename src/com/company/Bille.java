package com.company;

import java.awt.*;

public class Bille
{

    Maze maze;
    Memory memory;
    private Point previousPoint;
    private Point currentPoint;
    private Point nextPoint;

    private int wallCounter;



    public Bille(int x, int y)
    {
        currentPoint = new Point(x, y+1);
        previousPoint = new Point(-99,-99);
        nextPoint = new Point(0,0);
        maze = new Maze();
        memory = new Memory();
        memory.getSetBlindPrevent().add(new Point(x,y-1));
    }

    public void checkWalls(Point point)
    {
        wallCounter = 0;
        if(reachedFinishLine(point))
        {
            //mangler timer + mere
            System.out.println("Done!");
        }

        if(maze.checkVandret(point.x, point.y+1) == 1)
            wallCounter++;
        if(maze.checkVandret(point.x, point.y) == 1)
            wallCounter++;
        if(maze.checkLodret(point.x+1, point.y) == 1)
            wallCounter++;
        if(maze.checkLodret(point.x, point.y) == 1)
            wallCounter++;
    }

    public boolean reachedFinishLine(Point point)
    {
        if(maze.checkVandret(point.x, point.y+1) == -1)
            return true;
        if(maze.checkVandret(point.x, point.y) == -1)
            return true;
        if(maze.checkLodret(point.x+1, point.y) == -1)
            return true;
        if(maze.checkLodret(point.x, point.y) == -1)
            return true;
        return false;
    }

    public boolean checkIfInSet(Point point)
    {
        return memory.getSetBlindPrevent().contains(point);
    }
    public boolean checkIfInStack(Point point)
    {
        if(memory.getStackFlagStack().search(point) == -1)
        {
            return false;
        }
        return true;
    }

    public boolean checkIfPrevious(Point nextPoint)
    {
        return (nextPoint.equals(previousPoint));
    }

    public int getWallCounter()
    {
        return wallCounter;
    }
    public void setWallCounter(int wallCounter)
    {
        this.wallCounter = wallCounter;
    }

    public Point getPreviousPoint()
    {
        return previousPoint;
    }
    public void setPrevToCurr()
    {
        this.previousPoint = currentPoint;
    }

    public Point getCurrentPoint()
    {
        return currentPoint;
    }
    public void setCurrToNext()
    {
        this.currentPoint = nextPoint;
    }

    public Point getNextPoint()
    {
        return nextPoint;
    }
    public void setNextPoint(int x, int y)
    {
        this.nextPoint = new Point(x,y);
    }


}
