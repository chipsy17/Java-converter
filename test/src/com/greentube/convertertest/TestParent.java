package com.greentube.convertertest;

import java.util.*;


// Parent parent class of java2flash test class to show various features 
// concerning inheritance.

public class TestParent 
{
    Vector dummyvector;
    static int staticparentattribute = 66;

    public TestParent() 
    {   dummyvector = new Vector();
        dummyvector.addElement ("el:0");
    }

    public TestParent(int vectorsize) 
    {   dummyvector = vectorsize>0 ? new Vector() : null;
        for (int i=0; i<vectorsize; i++) 
        {   dummyvector.addElement("el:"+i);
        }
    }

    public DummyClass gimmedummy() 
    {   return null;
    }

    public String toString()
    {   return "TestParent"+dummyvector.size();
    }

    public static int staticmethod() 
    {   return 88;
    }

    public int depth() 
    {   return 1;
    }

    public int depth(int multiplier) 
    {   return multiplier;
    }
}
