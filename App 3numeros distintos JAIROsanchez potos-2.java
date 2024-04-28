import java.util.Scanner;

public class App { 
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner( System.in);
        //solicitar al usuraario que ingrese 3 numeros distintos 

        int a,b,c;
        System.out.println( "ingrese 3 numeros");
        a = leer.nextInt();
        System.out.println( "ingrese el 2 numero");
        b = leer.nextInt();
        System.out.println( "ingrese el 3 numero");
        c = leer.nextInt();

       

       
        if ((a < b)&& (c < b )) {
            if (a < b) {
                if (c < b) {
                    int SumaMenores= a + c;
                    System.out.println(" la suma de los menores es "+ SumaMenores);
                    
                }
                
            }
            
        }


        if ((b < a) && (c < a) ){
            if (b < a) {
                if (c < a) {
                    int SumaMenores = b + c;
                    System.out.println("la suma de los menores es "+ SumaMenores);
                    
                }
                

            }
            
        }
        if ((a < c)&& (b < c )) {
            if (a < c ) {
                if (b < c ) {
                    int SumaMenores= a + b;
                    System.out.println(" la suma de los menores es "+ SumaMenores);
                    
                }
                
            }
            
        }

    
            
        //Determinar cual de los tres es el mayor
    

        if (a != b && a != c && b !=c){
            if (a > b) {
                if (a > c) {
                    System.out.println( "El numero mayor es "+a);
                    

                }
                else{
                    System.out.println("el numero mayor es "+c);

                }
            }
            else{
                if (b > c) {
                    System.out.println("el numero mayor es "+b);
                }
                else{
                    System.out.println("el numero mayor es "+c);
                }
            }
        }
        else{
            System.out.println("los numeros deben ser diferentes");
        }
        // Hallar la diferencia entre los mayores 
    if ((a > b)&& (b > c )) {
        if (a > c ) {
            if (b > c ) {
                int diferenciaMayores= a - b;
                System.out.println(" la diferencia de los mayores es  "+ diferenciaMayores);
                
            }
            
        }
        
        
    }
    if ((b > c)&& (c > a )) {
        if (b > a ) {
            if (c > a ) {
                int diferenciaMayores= b - c;
                System.out.println(" la diferencia de los mayores es  "+ diferenciaMayores);
                
            }
        }   
        
        
    }
    if ((a > c)&& (c > b )) {
        if (a > b ) {
            if (c > b ) {
                int diferenciaMayores= a - c;
                System.out.println(" la diferencia de los mayores es  "+ diferenciaMayores);
                
            }
            
        }
        
        
    }
//Jairo José Sanche Potosme. NU= 2024-1662U

    
 }
}
