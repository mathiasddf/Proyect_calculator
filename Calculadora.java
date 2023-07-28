class Calculadora{
	public static void main(String[] args){
		Raiz(-4,2);	
		
	}
	
	
	public static void Raiz( double n, double a){
	    if(a == 0){
			System.out.println("Indefinido") ;
			return;
		}
		double raiz = 1/a;
		if(n >= 0){
			System.out.println(Math.pow(n,raiz));
		}else{
			if(n<0){
				n=n*-1;
				System.out.println(Math.pow(n,raiz)+" i");
			}
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
                System.out.println("error");
            }else{
				System.out.println(x/y);
			}  
	}
        
        
        
        
        
        	
}
