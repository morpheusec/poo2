/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import java.awt.SystemColor;
import java.util.Scanner;

/**
 *
 * @author Henry Guerra @morpheusec <morpheusec@gmail.com>
 */
public class Pila {
    int vectorPila[];
    int  cima;
    int  MAX;

    public Pila(int tamanio) {
        vectorPila= new int[tamanio];
        cima=0;
    }
    
    public void Insertar(int dato){
        if(!llena())
        {vectorPila[cima]=dato;
       // System.out.println("cima: "+cima);
        cima++;
        //    System.out.println("cima:"+cima);
        }
        else
        {   System.out.println("pila llena");
        cima--;
        }
    }
    
    public  int Eliminar (){
    int elimina=0;
    if(cima==0)
            System.out.println("la pila esta vacia");
    else
    {
   // eliminar=vectorPila[cima];
   elimina = vectorPila[cima];
      //  vectorPila[cima]=0;
       // System.out.println(elimina);
        //System.out.println("cima antes"+cima);
        //cima--;
        // System.out.println("cima despues"+cima);        
    }
        //int dato;
       
        vectorPila[cima]=0;
         //cima--;
         System.out.println("cima:"+cima);
                 
    return elimina;
    }
    
    public boolean vacio(){
    if(cima==0)
        return true;
    else
        return false;
    
    }
    public boolean llena(){
    if(cima==tamanio())
        return true;
    else
        return false;
    
    }
    public int tamanio(){
    return vectorPila.length;
    
    }
    
    public void  MostrarPila (){
        
    for (int i=tamanio()-1;i>=0;i--)
    {
       
        System.out.println("\nPila["+i+"]="+vectorPila[i]);
     
    }
        //System.out.println("\n");
    }
    public static void main(String[] args) {
        
        Scanner nc = new Scanner(System.in);
        
        //System.out.println("Ingrese el tamaño de la pila");
        //int tam=nc.nextInt();
        
                    // Pila p = new Pila(5);
                     boolean menu=true;
             System.out.println("INgrese el tamaño de la pila:");
            int tam=nc.nextInt();
            Pila p = new Pila(tam);
        do {    
           
            
            System.out.println("Menu Principal");
            System.out.println("<1> Ingresar dato");
            System.out.println("<2> Borrar dato");
            System.out.println("<3> La pila es vacia?");
            System.out.println("<4> Mostrar Pila");
            System.out.println("<5> Salir");
            System.out.println("Ingrese una opcion <1..5>: ");
            
            
            
            int op=nc.nextInt();
            
           
            
           switch(op){
               case 1:
                   System.out.println("Ingrese un numero a la pila: ");
                   int valor=nc.nextInt();
                   p.Insertar(valor);
                   System.out.println("cima:"+p.cima);
                   break;
                   
               case 2:
                   System.out.println("Eliminando:");
                   System.out.println("-- "+p.Eliminar());
                   break;
                   
               case 3:
                   if(p.vacio())
                       System.out.println("pila vacia");
                   else
                       System.out.println("la pila no esta vacia  tiene:"+p.cima);
                   
                break;
                
               case 4:
                   p.MostrarPila();
                   break;
               case 5:
                   menu=false;
                   break;
                   
                   
           }
        } while (menu);
  
    }
    
}
