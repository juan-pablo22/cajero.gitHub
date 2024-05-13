package Cajero;

import java.util.Scanner;    

public class Cajero {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int saldo = 30000, retiro =0, deposito =0, opcion =0;
           System.err.println("****************");
        do{System.out.println("banco claribel");
           System.err.println("****************");
            System.out.println("""
                   
                     
                                  Elige una opcion
                                  1.-consultar saldo
                                  2.-retirar efectivo
                                  3.-Deposito
                                  4.-salir
                                """);        
                                          
                opcion = entrada.nextInt();             
            

            switch(opcion){
            case 1: System.err.println("tu saldo:  "+saldo+" pesos MXN");break;
            case 2: System.err.println("Ingresa la cantidad a retirar");
            retiro = entrada.nextInt();
            if(retiro > saldo){
                System.err.println("saldo insuficiente");
            }else{
            saldo = saldo - retiro;
            System.err.println("tu saldo es: " +saldo+" pesos MXN");  
            }
        
          }

    
        }while(opcion !=4);

    }


}  

