
package juego_adivina_el._numero_jaas;

import java.util.Scanner;


public class Juego_Adivina_el_numero_JAAS {


    public static void main(String[] args) {
      
        Scanner entrada=new Scanner(System.in);
                

        String resp;//variable para la respuesta del do while
        
         System.out.println("En este momento la computadora ha pensado en un numero del 1 al 10");
        
        System.out.println("\nTendras tres oportunidades para adivinar cual es el numero\n"
                + "Dependiendo del intento en el que aciertes, ganaras las siguientes cantidades de puntos:"
                + "\n****1er intento (30 pts)"
                + "\n****2do intento (20 pts)"
                + "\n****3er intento (10 pts)");
        
        System.out.println("\nSi no aciertas en ninguno de los tres intentos, la computadora gana");
        
        
 
        do{
        int NumA = (int) ((Math.random() * 10)+1);
        int NumIn;
        int i;//variable para el for
        int contador=0;//variable para el contador de los intentos
        
        
        System.out.println("\nIngresa un numero del 1 al 10:"
                +"\n1er intento:");
        NumIn=entrada.nextInt();
        
        for (i=0; i<=3; i++) {

            if (NumA == NumIn) {
            System.out.println("\n¡Has acertado! el numero era el: "+NumA);
            break; }


            else if (i==3) { 
            System.out.println("\n Has perdido, El número era el: " + NumA);
            if(i==3){
                contador=contador+1;
            }
            break; } 


            if (i ==1) {
             System.out.print("\nIncorrecto, 2do Intento: "); 
             NumIn = entrada.nextInt(); }

            if(i==1)
           {
               contador=contador+1;
           }

             else if (i ==2) { 
             System.out.print("\n3er Intento(Ultima oportunidad): ");
             NumIn = entrada.nextInt(); }

            if(i==2)
           {
               contador=contador+1;
           }
        
       }//fin del FOR
        
        //Mensajes finales
         if(contador==0){
         System.out.println("\nAcertaste en el primer intento recibes 30 pts");
        }
        
        else if(contador==1){
         System.out.println("\nAcertaste en el segundo intento recibes: 20 pts");
        }
        
        if(contador==2){
         System.out.println("\nAcertaste en el tercer intento recibes 10 pts");
        }
        else if(contador>2){
            System.out.println("\nRecibes 0 pts, la computadora gana");
        }
        
        System.out.println("\nQuieres volver a jugar? (si/no)");
            resp=entrada.next();
        }while(resp.equalsIgnoreCase("si"));
        
    }
    
}
