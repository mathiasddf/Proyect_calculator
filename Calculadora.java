class Calculadora{
	public static void main(String[] args){
		System.out.println(Raiz(-27,2));
		
	}
	
	
	public static double Raiz( double n, double a){
	    if( a <= 0){
			return Math.sqrt(-1) ;
		}
		double raiz = 1/a;
		if(n > 0){
			return Math.pow(n,raiz);
		}
		else{
			return Math.sqrt(-1);
		}
	}
        public static double suma( double p, double q){
            return p + q ;   
	}
        public static double resta( double f, double g){
            return f - g ;   
	}
         public static double multiplicacion( double x, double y){
            return x * y ;   
	}
        public static void division( double x, double y){
            if( y == 0){
                 return "error";
            }
            return x / y ;   
	}
        
        
        
        
        
        	
}
