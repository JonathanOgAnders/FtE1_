package com.company;

/**
 * Created by Anders on 11-Sep-17.
 */
public class Maze
{

    //sætter en række med -1 for at tjekke for målstregen.
    //starter øverst i venstre hjørne. X vandret y lodret.
    int[][] vandret;
    //starter øverst i venstre hjørne. X vandret y lodret.
    int[][] lodret;

    public Maze()
    {
        vandret = new int[][]{
                {-1,-1,-1,-1,-1,-1},
                { 1, 0, 1, 1, 1, 1},
                { 0, 1, 1, 0, 0, 0},
                { 1, 0, 0, 1, 0, 0},
                { 0, 0, 1, 0, 1, 0},
                { 1, 1, 0, 1, 0, 1},
                { 1, 1, 0, 1, 1, 1},
                {-1,-1,-1,-1,-1,-1}
        };
        lodret = new int[][]{
                {-1,-1,-1,-1,-1,-1,-1},
                { 1, 0, 0, 0, 1, 0, 1},
                { 1, 0, 1, 0, 1, 1, 1},
                { 1, 1, 1, 0, 0, 1, 1},
                { 1, 0, 1, 0, 1, 0, 1},
                { 1, 0, 0, 0, 1, 0, 1},
                {-1,-1,-1,-1,-1,-1,-1}
        };
    }

    public int checkLodret(int x, int y)
    {
        return lodret[y][x];
    }
    public int checkVandret(int x, int y)
    {
        return vandret[y][x];
    }

    public int[][] getVandret()
    {
        return vandret;
    }

    public void setVandret(int[][] vandret)
    {
        this.vandret = vandret;
    }

    public int[][] getLodret()
    {
        return lodret;
    }

    public void setLodret(int[][] lodret)
    {
        this.lodret = lodret;
    }
}
