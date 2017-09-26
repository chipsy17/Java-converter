package com.greentube.javaconverter;

import java.util.*;

public class LibraryList 
{   static String[][] supported = 
    {   
        { "java.io.PrintStream",
            "void print(boolean)",
            "void print(double)",
            "void print(char)",
            "void print(int)",
            "void print(java.lang.Object)",
            "void print(java.lang.String)",
            "void println()",
            "void println(boolean)",
            "void println(double)",
            "void println(char)",
            "void println(int)",
            "void println(java.lang.Object)",
            "void println(java.lang.String)",
        },
        { "java.lang.Boolean",
            "<init>(boolean)", 
            "boolean booleanValue()",     
            "java.lang.String toString(boolean)",
            "java.lang.Boolean valueOf(boolean)",
            "FALSE",
            "TRUE",
        },
        { "java.lang.Byte",
            "<init>(byte)",
            "byte byteValue()",
            "java.lang.String toString(byte)",
            "java.lang.Byte valueOf(byte)",
            "MIN_VALUE",
            "MAX_VALUE",
        },
        { "java.lang.Character",
            "<init>(char)",
            "char charValue()",
            "java.lang.String toString(char)",
            "java.lang.Character valueOf(char)",
            "MIN_VALUE",
            "MAX_VALUE",
        },
        { "java.lang.Double",
            "<init>(double)", 
            "double doubleValue()", 
            "boolean isInfinite()",
            "boolean isInfinite(double)",
            "boolean isNaN()",
            "boolean isNaN(double)",
            "java.lang.String toString(double)",
            "java.lang.Double valueOf(double)",
            "MIN_VALUE",
            "MAX_VALUE",
            "POSITIVE_INFINITY",
            "NEGATIVE_INFINITY",
        },
        { "java.lang.Enum",
            "java.lang.String name()", 
            "int ordinal()", 
        },
        { "java.lang.Integer",
            "<init>(int)",
            "int intValue()",
            "java.lang.String toString(int)",
            "java.lang.Integer valueOf(int)",
            "MIN_VALUE",
            "MAX_VALUE",
        },
        { "java.lang.Iterable",
            "java.util.Iterator iterator()"
        },
        { "java.lang.Object",
            "<init>()",
        },
        { "java.lang.Math",
            "double abs(double)",
            "int abs(int)",
            "double acos(double)", 
            "double asin(double)", 
            "double atan(double)", 
            "double atan2(double, double)", 
            "double ceil(double)", 
            "double cos(double)", 
            "double cosh(double)", 
            "double exp(double)", 
            "double expm1(double)", 
            "double floor(double)",
            "double hypot(double, double)",
            "double IEEEremainder(double, double)",
            "double log(double)", 
            "double log10(double)", 
            "double log1p(double)", 
            "double max(double, double)", 
            "int max(int, int)", 
            "double min(double, double)", 
            "int min(int, int)", 
            "double pow(double, double)", 
            "double rint(double)", 
            "long round(double)",  // only allowed if immediately casting the result to int or double 
            "double signum(double)",
            "double sin(double)", 
            "double sinh(double)", 
            "double sqrt(double)", 
            "double tan(double)", 
            "double tanh(double)", 
            "double toDegrees(double)",
            "double toRadians(double)",
            "E",
            "PI",
        },
        { "java.lang.Runnable",
            "void run()",
        },
        { "java.lang.String",
            "<init>(char[])",
            "<init>(char[], int, int)",
            "char charAt(int)",
            "int compareTo(java.lang.String)",
            "java.lang.String concat(java.lang.String)",
            "boolean endsWith(java.lang.String)",
            "int indexOf(java.lang.String)",        
            "int indexOf(int)",        
            "int indexOf(java.lang.String, int)",
            "int indexOf(int, int)",
            "boolean isEmpty()",
            "int lastIndexOf(java.lang.String)",
            "int lastIndexOf(int)",
            "int lastIndexOf(java.lang.String, int)",
            "int lastIndexOf(int, int)",
            "int length()",            
            "java.lang.String replace(char, char)",
            "boolean startsWith(java.lang.String)",
            "java.lang.String substring(int)",
            "java.lang.String substring(int, int)",
            "char[] toCharArray()",
            "java.lang.String trim()",			
        },
        { "java.lang.StringBuffer",
            "<init>()",
            "<init>(java.lang.String)",
            "java.lang.StringBuffer append(java.lang.Object)",
            "java.lang.StringBuffer append(java.lang.String)",
            "java.lang.StringBuffer append(boolean)",
            "java.lang.StringBuffer append(char)",
            "java.lang.StringBuffer append(int)",
            "java.lang.StringBuffer append(double)",
            "int length()",			
        },
        { "java.lang.StringBuilder",
            "<init>()",
            "<init>(java.lang.String)",
            "java.lang.StringBuilder append(java.lang.Object)",
            "java.lang.StringBuilder append(java.lang.String)",
            "java.lang.StringBuilder append(boolean)",
            "java.lang.StringBuilder append(char)",
            "java.lang.StringBuilder append(int)",
            "java.lang.StringBuilder append(double)",
            "int length()",			
        },
        { "java.lang.System",
            "out",
            "err",
            "void arraycopy(java.lang.Object, int, java.lang.Object, int, int)",
            "void exit(int)",
        },
        { "java.util.AbstractCollection",
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",        
            "int size()",
            "java.lang.Object[] toArray()",			
        },
        { "java.util.AbstractList",
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",	

            "java.lang.Object get(int)",
            "java.lang.Object set(int, java.lang.Object)",
            "void add(int, java.lang.Object)",
            "java.lang.Object remove(int)",        
            "boolean add(java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "boolean removeAll(java.lang.Collection)",
            "boolean retainAll(java.lang.Collection)",
        },	
        { "java.util.ArrayList",
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",	

            "java.lang.Object get(int)",
            "java.lang.Object set(int, java.lang.Object)",        
            "void add(int, java.lang.Object)",
            "java.lang.Object remove(int)",        
            "boolean add(java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "boolean removeAll(java.lang.Collection)",
            "boolean retainAll(java.lang.Collection)",

            "<init>()",
            "<init>(java.util.Collection)",			
            "void trimToSize()",						
        },
        { "java.util.Collection",
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",
        },
        { "java.util.Comparator",
            "int compare(java.lang.Object, java.lang.Object)",
            "boolean equals(java.lang.Object)",
        },
        { "java.util.Enumeration",
            "boolean hasMoreElements()",		
            "java.lang.Object nextElement()",			
        },
        { "java.util.HashMap",
            "<init>()",
            "<init>(java.util.Map)",
            "void clear()",        
            "boolean containsKey(java.lang.Object)", 
            "boolean containsValue(java.lang.Object)",                    
            "java.lang.Object get(java.lang.Object)",        
            "boolean isEmpty()",
            "java.util.Set keySet()",
            "java.lang.Object put(java.lang.Object, java.lang.Object)", 
            "void putAll(java.util.Map)",
            "java.lang.Object remove(java.lang.Object)", 
            "int size()",
            "java.util.Collection values()",        
        },
        { "java.util.HashSet",
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",

            "<init>()",
            "<init>(java.util.Collection)",
            "boolean add(java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "void clear()",                
            "boolean remove(java.lang.Object",
            "boolean removeAll(java.util.Collection",			
            "boolean retainAll(java.util.Collection",
        },
        { "java.util.Hashtable",
            "<init>()",
            "<init>(java.util.Map)",
            "void clear()",        
            "boolean containsKey(java.lang.Object)", 
            "boolean containsValue(java.lang.Object)",                    
            "java.lang.Object get(java.lang.Object)",        
            "boolean isEmpty()",
            "java.util.Set keySet()",
            "java.lang.Object put(java.lang.Object, java.lang.Object)", 
            "void putAll(java.util.Map)",
            "java.lang.Object remove(java.lang.Object)", 
            "int size()",
            "java.util.Collection values()",        

            "java.lang.Object clone()",
            "boolean contains(java.lang.Object)",
            "java.util.Enumeration elements()",
            "java.util.Enumeration keys()",
        },
        { "java.util.Iterator",
            "boolean hasNext()",		
            "java.lang.Object next()",
            "void remove()",
        },
        { "java.util.LinkedList",
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",	

            "java.lang.Object get(int)",
            "java.lang.Object set(int,java.lang.Object)",
            "void add(int, java.lang.Object)",
            "java.lang.Object remove(int)",        
            "boolean add(java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "boolean removeAll(java.lang.Collection)",
            "boolean retainAll(java.lang.Collection)",

            "<init>()",
            "<init>(java.util.Collection)",
            "void addFirst(java.lang.Object)",
            "void addLast(java.lang.Object)",
            "java.lang.Object getFirst()",
            "java.lang.Object getLast()",
            "java.lang.Object removeFirst()",
            "java.lang.Object removeLast()",			
        },
        { "java.util.List",
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",

            "boolean add(java.lang.Object)",
            "void add(int, java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "java.lang.Object get(int)",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "java.lang.Object remove(int)",
            "boolean removeAll(java.util.Collection)",
            "boolean retainAll(java.util.Collection)",
            "java.lang.Object set(int, java.lang.Object)",    		    
        },
        { "java.util.Map",
            "void clear()",
            "boolean containsKey(java.lang.Object)",	
            "boolean containsValue(java.lang.Object)",
            "java.lang.Object get(java.lang.Object)",
            "boolean isEmpty()",
            "java.util.Set keySet()",
            "java.lang.Object put(java.lang.Object, java.lang.Object)",
            "void putAll(java.util.Map)",
            "java.lang.Object remove(java.lang.Object)",
            "int size()",
            "java.util.Collection values()",
        },
        { "java.util.Set",
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",
        },
        { "java.util.Vector",
            "boolean contains(java.lang.Object)",
            "boolean containsAll(java.util.Collection)",
            "boolean isEmpty()",
            "java.util.Iterator iterator()",
            "int size()",
            "java.lang.Object[] toArray()",	

            "java.lang.Object get(int)",
            "java.lang.Object set(int, java.lang.Object)",        
            "void add(int, java.lang.Object)",
            "java.lang.Object remove(int)",        
            "boolean add(java.lang.Object)",
            "boolean addAll(java.util.Collection)",
            "boolean addAll(int, java.util.Collection)",
            "void clear()",
            "int indexOf(java.lang.Object)",
            "int lastIndexOf(java.lang.Object)",
            "boolean removeAll(java.lang.Collection)",
            "boolean retainAll(java.lang.Collection)",

            "<init>()",
            "<init>(java.util.Collection)",
            "void addElement(java.lang.Object)",
            "java.lang.Object clone()",
            "void copyInto(java.lang.Object[])",        
            "java.lang.Object elementAt(int)",
            "java.util.Enumeration elements()",
            "java.lang.Object firstElement()",
            "int indexOf(java.lang.Object, int)",
            "void insertElementAt(java.lang.Object, int)",
            "java.lang.Object lastElement()",
            "int lastIndexOf(java.lang.Object, int)",
            "void removeAllElements()",
            "boolean removeElement(java.lang.Object)",
            "void removeElementAt(int)",
            "void setElementAt(java.lang.Object, int)",
            "void setSize(int)",
            "void trimToSize()",                                    
        }
    };


    static HashMap<String,HashSet<String>> map = null;

    public static void buildList(boolean supportbenchmark) 
    {   map = new HashMap<>();
        for (int i=0; i<supported.length; i++) 
        {   String classname = supported[i][0];
            HashSet<String> members = new HashSet<>();
            map.put(classname,  members);
            
            for (int j=1; j<supported[i].length; j++) 
            {   members.add(supported[i][j]);
            }
            // support these on any object:
            members.add("boolean equals(java.lang.Object)");    
            members.add("int hashCode()");
            members.add("java.lang.String toString()");
            // provide support methods for benchmarking only
            if (supportbenchmark && classname.equals("java.lang.System"))
            {   members.add("long currentTimeMillis()");
            }
        }          
    }

    public static boolean isAllowed(String fullclassname, String membername)
    {   // generate map at first call for fast retrieval if not done already
        if (map==null) buildList(false);
        // unknown classes are not restricted
        if (!map.containsKey(fullclassname)) return true;    
        // provided class only allows whitelisted members
        return map.get(fullclassname).contains(membername);	
    }
}
