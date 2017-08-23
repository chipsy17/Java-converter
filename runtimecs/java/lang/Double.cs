
namespace java.lang 
{
	public class Double 
	{		
//		static System.Globalization.CultureInfo culture = null;
		   
		private readonly double value;

		public Double(double d) 
		{
			value = d;
		}

		public double doubleValue() 
		{
			return value;
		}
        
        public bool isNaN() {
            return isNaN(value);
        }
        
        public bool isInfinite() {
            return isInfinite(value);
        }
        
		public override bool Equals(System.Object o) 
		{
			if (o==null || !(o is Double)) return false;
			return ((Double)o).value == value;
		}

		public override int GetHashCode()
		{
            long l = System.BitConverter.DoubleToInt64Bits( value );       
            int a = (int) (l>>32);
            int b = (int) l;
			return  a ^ b;
		}

		public override System.String ToString() 
		{
            return java.lang.SYSTEM.str(value);
		}

        public static bool isNaN(double d) {
            return System.Double.IsNaN(d);
        }
        
        public static bool isInfinite(double d) {
            return System.Double.IsInfinity(d);
        }
        
		public static System.String toString(double d)
		{
            return java.lang.SYSTEM.str(d);
		}
        
        public static java.lang.Double valueOf(double d)
        {
            return new java.lang.Double(d);
        }

        
		public const double MIN__VALUE_f = 4.9E-324;
		public const double MAX__VALUE_f = 1.7976931348623157E308;
		public const double POSITIVE__INFINITY_f = 1.0/0.0;
		public const double NEGATIVE__INFINITY_f = -1.0/0.0;
		
	}
}
