//complete// java/io/PrintStream
//load// java/lang/Object
var java_lang_System = 
{    
    arraycopy_5 : function(src, srcPos, dest, destPos, length) 
    {   if (src==null || dest==null) throw new ReferenceError();
        if (!(src._isArray) || !(dest._isArray)) throw new TypeError();
        if (length<0 || srcPos<0 || srcPos+length>src.length
                     || destPos<0 || destPos+length>dest.length) throw new RangeError();
        
        if (destPos<=srcPos) 
        {   for (var i = 0; i < length; i++) 
            {   dest[i + destPos] = src[i + srcPos];
            }
        } 
        else 
        {   for (var i = length-1; i >=0; i--) 
            {   dest[i + destPos] = src[i + srcPos];
            }
        }
    },
    exit_1: function(status) 
    {
    },
    
    currentTimeMillis_0: function() 
    {   return Date.now();
    },
    
    out: new java_io_PrintStream.$()._1(console.log),
    err: new java_io_PrintStream.$()._1(console.warn),       
};
