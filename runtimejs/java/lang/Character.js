//load// java/lang/Object
var java_lang_Character = function() 
{   this.c = 0;
};

_defclass(java_lang_Character, java_lang_Object, null, 
{  _1: function(c) 
    {   this.c = c;
        return this;
    },
    
    charValue_0: function() 
    {   return this.c;
    },    
    
    equals_1: function(o) 
    {   if (o!==null && (o instanceof java_lang_Character) && o.c===this.c) 
        {   return true;
        }
        return false;
    },
    
    hashCode_0: function() 
    {   return this.c;
    },   
    
    toString_0: function() 
    {   return String.fromCharCode(this.c);
    },
});
 
    
var java_lang_Character_MAX$005fVALUE = 0xffff;
var java_lang_Character_MIN$005fVALUE = 0;

var java_lang_Character_toString_1 = function(c) 
{   return String.fromCharCode(c);
};
var java_lang_Character_valueOf_1 = function(c) 
{   return new java_lang_Character()._1(c);
};
