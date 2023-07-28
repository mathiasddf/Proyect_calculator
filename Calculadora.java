class Calculadora{
	public static void main(String[] args){
<<<<<<< HEAD
		System.out.println(Raiz(-27,3));
=======
		Raiz(-4,2);	
>>>>>>> e70488571194393e94933ae9a47df80f245283a3
		
	}
	
	
<<<<<<< HEAD
	public static double Raiz( double n, double a){
	    if( a == 0){
			return Math.sqrt(-1) ;
		}
		double raiz = 1/a;
		if(n > 0) {
			return Math.pow(n,raiz);
		}
		else if ((n < 0) && (a == 2)){
		     return Math.sqrt(-1);
		}
		else if (( n < 0) && ( a > 2)){
		     return Math.pow(n,raiz);
		}
		else{
			return Math.sqrt(-1);
=======
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
>>>>>>> e70488571194393e94933ae9a47df80f245283a3
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
