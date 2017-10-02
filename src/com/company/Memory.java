package com.company;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Memory
{
//har contains og search, så det behøver vi ikke selv lave

    private Stack<Point> flagStack;

    private Set<Point> blindPrevent;
    public Memory()
    {
        blindPrevent = new HashSet<>();
        flagStack = new Stack<>();
    }

    public Stack<Point> getStackFlagStack()
    {
        return flagStack;
    }

    public Set<Point> getSetBlindPrevent()
    {
        return blindPrevent;
    }
}
