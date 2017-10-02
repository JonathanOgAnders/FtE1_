package com.company;


import java.awt.*;

public class Game
{
    Bille bille;
    Timer timer;

    public Game(int x, int y)
    {
        bille = new Bille(x,y);
        timer = new Timer();
    }

    public Point recMoveBille(Point point)
    {
        System.out.println(point);
        bille.checkWalls(point);
        int count = bille.getWallCounter();
        if(count == 3)
        {
            bille.memory.getSetBlindPrevent().add(point);
            recMoveBille(new Point(bille.memory.getStackFlagStack().pop()));
        }

        if (count == 2)
        {
            for (int i = 0; i < 4; i++)
            {
                switch (i)
                {
                    case 0:
                        bille.setNextPoint(point.x+1,point.y);
                        if(bille.maze.checkLodret(bille.getNextPoint().x, bille.getNextPoint().y) == 0)
                        {
                            if(!(bille.getNextPoint().equals(bille.getPreviousPoint())))
                            {
                                if(!(bille.checkIfInStack(bille.getNextPoint())))
                                {
                                    if(!(bille.checkIfInSet(bille.getNextPoint())))
                                    {
                                        bille.setPrevToCurr();
                                        bille.setCurrToNext();
                                        return recMoveBille(bille.getCurrentPoint());
                                    }
                                }
                            }
                        }
                        break;

                    case 1:
                        bille.setNextPoint(point.x,point.y+1);
                        if(bille.maze.checkVandret(bille.getNextPoint().x, bille.getNextPoint().y) == 0)
                        {
                            if(!(bille.getNextPoint().equals(bille.getPreviousPoint())))
                            {
                                if(!(bille.checkIfInStack(bille.getNextPoint())))
                                {
                                    if(!(bille.checkIfInSet(bille.getNextPoint())))
                                    {
                                        bille.setPrevToCurr();
                                        bille.setCurrToNext();
                                        return recMoveBille(bille.getCurrentPoint());
                                    }
                                }
                            }
                        }
                        break;

                    case 2:
                        bille.setNextPoint(point.x-1,point.y);
                        if(bille.maze.checkLodret(bille.getNextPoint().x+1, bille.getNextPoint().y) == 0)
                        {
                            if(!(bille.getNextPoint().equals(bille.getPreviousPoint())))
                            {
                                if(!(bille.checkIfInStack(bille.getNextPoint())))
                                {
                                    if(!(bille.checkIfInSet(bille.getNextPoint())))
                                    {
                                        bille.setPrevToCurr();
                                        bille.setCurrToNext();
                                        return recMoveBille(bille.getCurrentPoint());
                                    }
                                }
                            }
                        }
                        break;

                    case 3:
                        bille.setNextPoint(point.x,point.y-1);
                        if(bille.maze.checkVandret(bille.getNextPoint().x, bille.getNextPoint().y+1) == 0)
                        {
                            if(!(bille.getNextPoint().equals(bille.getPreviousPoint())))
                            {
                                if(!(bille.checkIfInStack(bille.getNextPoint())))
                                {
                                    if(!(bille.checkIfInSet(bille.getNextPoint())))
                                    {
                                        bille.setPrevToCurr();
                                        bille.setCurrToNext();
                                        return recMoveBille(bille.getCurrentPoint());
                                    }
                                }
                            }
                        }
                        break;

                    default:
                        System.out.println("Something went wrong");
                        break;
                }
            }
        }

        if(count < 2)
        {
            boolean checkCase0;
            boolean checkCase1;
            boolean checkCase2;
            boolean checkCase3;
            bille.memory.getSetBlindPrevent().add(bille.getPreviousPoint());
            bille.memory.getStackFlagStack().push(point);
            for (int i = 0; i < 4; i++)
            {
                switch (i)
                {
                    case 0:
                        bille.setNextPoint(point.x+1,point.y);
                        if(bille.maze.checkLodret(bille.getNextPoint().x, bille.getNextPoint().y) == 0)
                        {
                            if(!(bille.getNextPoint().equals(bille.getPreviousPoint())))
                            {
                                if(!(bille.checkIfInStack(bille.getNextPoint())))
                                {
                                    if(!(bille.checkIfInSet(bille.getNextPoint())))
                                    {
                                        bille.setPrevToCurr();
                                        bille.setCurrToNext();
                                        bille.memory.getSetBlindPrevent().add(bille.getCurrentPoint());
                                        return recMoveBille(bille.getCurrentPoint());
                                    }
                                }
                            }
                            checkCase0 = false;
                        }
                        break;

                    case 1:
                        bille.setNextPoint(point.x,point.y+1);
                        if(bille.maze.checkVandret(bille.getNextPoint().x, bille.getNextPoint().y) == 0)
                        {
                            if(!(bille.getNextPoint().equals(bille.getPreviousPoint())))
                            {
                                if(!(bille.checkIfInStack(bille.getNextPoint())))
                                {
                                    if(!(bille.checkIfInSet(bille.getNextPoint())))
                                    {
                                        bille.setPrevToCurr();
                                        bille.setCurrToNext();
                                        bille.memory.getSetBlindPrevent().add(bille.getCurrentPoint());
                                        return recMoveBille(bille.getCurrentPoint());
                                    }
                                }
                            }

                        }
                        break;

                    case 2:
                        bille.setNextPoint(point.x-1,point.y);
                        if(bille.maze.checkLodret(bille.getNextPoint().x+1, bille.getNextPoint().y) == 0)
                        {
                            if(!(bille.getNextPoint().equals(bille.getPreviousPoint())))
                            {
                                if(!(bille.checkIfInStack(bille.getNextPoint())))
                                {
                                    if(!(bille.checkIfInSet(bille.getNextPoint())))
                                    {
                                        bille.setPrevToCurr();
                                        bille.setCurrToNext();
                                        bille.memory.getSetBlindPrevent().add(bille.getCurrentPoint());
                                        return recMoveBille(bille.getCurrentPoint());
                                    }
                                }
                            }
                        }
                        break;

                    case 3:
                        bille.setNextPoint(point.x,point.y-1);
                        if(bille.maze.checkVandret(bille.getNextPoint().x, bille.getNextPoint().y+1) == 0)
                        {
                            if(!(bille.getNextPoint().equals(bille.getPreviousPoint())))
                            {
                                if(!(bille.checkIfInStack(bille.getNextPoint())))
                                {
                                    if(!(bille.checkIfInSet(bille.getNextPoint())))
                                    {
                                        bille.setPrevToCurr();
                                        bille.setCurrToNext();
                                        bille.memory.getSetBlindPrevent().add(bille.getCurrentPoint());
                                        return recMoveBille(bille.getCurrentPoint());
                                    }
                                }
                            }
                        }
                        break;

                        default:
                            System.out.println("Something went wrong");
                            break;
                }
            }
        }
        return bille.getCurrentPoint();
    }


}
