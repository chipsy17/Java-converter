//load// java/lang/Object
var java_lang_StringBuffer = function() 
{   this._parts = null;
    this._length = 0;
};
_defclass(java_lang_StringBuffer, java_lang_Object, null, 
{  _0: function() 
    {   this._parts = [];        
        return this;
    },
    
    _1: function(initialvalue) 
    {   this._parts = [initialvalue];        
        this._length = initialvalue.length;
        return this;
    },

    append_1: function(x) 
    {   var s = (x===null) ? "null" : x.toString_0();
        this._length += s.length;
        this._parts.push(s);
        return this;
    },
    
    length_0: function() 
    {   return this._length;
    },
  
    toString_0: function() 
    {   return this._parts.join("");
    },
}); 
 