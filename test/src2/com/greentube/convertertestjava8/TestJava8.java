package com.greentube.convertertestjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.greentube.convertertestjava7.TestJava7;

public class TestJava8 extends TestJava7
{

    public static void main(String[] args) 
    {   TestJava7.main(args);

        System.out.println ("-- converter test suite for java 8" );
        
        lambdatest();
        methodreferencetest();
        interfacemethodstest();
        foreachtest();
    }
    
    public static void lambdatest()
    {
        System.out.println("- lambda expression");
        
        List<String> l = makelist("hey", "this", "is", "nice");
        assertO(l.toString(), "[hey, this, is, nice]");
        
        String seperator = "/";        
        List<String> d = apply(l, s -> s+seperator+s);
        
        assertO(d.toString(), "[hey/hey, this/this, is/is, nice/nice]");   
    }
    
    public static void methodreferencetest()
    {
        System.out.println("- method reference");
    
        List<String> l = makelist("hey", "this", "is", "nice");
        assertO(l.toString(), "[hey, this, is, nice]");      
          
        List<String> d = apply(l, TestJava8::twice);
        
        assertO(d.toString(), "[heyhey, thisthis, isis, nicenice]");
    }
    
    
    private static List<String> makelist(String... elements)
    {
        ArrayList<String> l = new ArrayList<>();
        for (String t:elements)
        {   l.add(t);
        }
        return l;
    }
    
    private static <T> List<T> apply(List<T> l, Function<T,T> f)
    {
        ArrayList<T> r = new ArrayList<T>();
        for (T t:l) 
        {   r.add(f.apply(t));
        }
        return r;
    }
    
    public static String twice(String a)
    {
        return a+a;
    }
    
    public static void interfacemethodstest()
    {
        System.out.println("- interface methods");
        
        assertI(TeaProvider.more(7), 21);

        TeaProvider tp = new EarlGrey();        
        assertO(tp.makeTea(100), "100ml of earl grey");
        assertO(tp.makeMoreTea(50), "150ml of earl grey");
        
        TeaProvider tp2 = new BigPot();
        assertO(tp2.makeTea(70), "70ml of generic tea");
        assertO(tp2.makeMoreTea(70), "700ml of generic tea");
        
        TeaProvider tp3 = new DarjeelingPot();
        assertO(tp3.makeTea(90), "90ml of darjeeling");
        assertO(tp3.makeMoreTea(90), "180ml of darjeeling");
    }
    
    public static void foreachtest()
    {
        System.out.println("- forEach");
    
        List<String> l = makelist("hey", "this", "is", "nice");
        List<String> target = new ArrayList<>();
        
        l.forEach(e -> target.add(e+"!"));
        assertO(target.toString(), "[hey!, this!, is!, nice!]");
    }
}
