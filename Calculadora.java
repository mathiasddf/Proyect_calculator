import java.util.*;
class Calculadora{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                while(true){
                    	System.out.println("Ingrese que operacion desea utilizar");
			String[] operaciones = {"1:Suma","2:Resta","3:Multiplicacion","4:Division","5:Raiz","6:Potencia","7:Modulo"};
			for(String operacion:operaciones){
			System.out.println(operacion);
			}
			int op = sc.nextInt();
			System.out.println("Ingrese dos numeros");
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			switch (op){
				case 1:
					double sum = suma(n1,n2);
					System.out.println("Suma: "+sum);
					break;
				case 2:
					double rest = resta(n1,n2);
					System.out.println("Resta: "+rest);
					break;
				case 3:
					double mult = multiplicacion(n1,n2);
					System.out.println("Multiplicacion: "+mult);
					break;
				case 4:
					System.out.print("Division: ");
					division(n1,n2);
					break;
				case 5:
			    		System.out.print("Raiz: ");
					raiz(n1,n2);
					break;
				case 6:
					System.out.print("Potencia: ");
					potencia(n1,n2);
					break;
				case 7:
					System.out.print("Modulo: ");
					modulo((int)n1,(int)(n2));
					break;
			}
                        System.out.println("¿Desea hacer otra operacion? (si/no)");
                        String rpta = sc.next();
                        if(rpta.equalsIgnoreCase("no")){
                            break;
                        }

                   
                }
		
	
	}
	public static void raiz( double n, double a){
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
            System.out.println("Indefinido");
        }else{
		System.out.println(x/y);
			}  
	}
    public static void modulo(int x, int y){
	    if(y == 0){
	    	System.out.println("error"); 
	    }
	    System.out.println ( x%y );
	}
	public static void potencia(double x, double y){
	    System.out.println( Math.pow(x,y));
	}
        
        
        
        
        	
}
