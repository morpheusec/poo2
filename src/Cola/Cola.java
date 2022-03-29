/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Henry Guerra @morpheusec <morpheusec@gmail.com>
 */
public class Cola{
    
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
      
        for (int i=0; i< 11;i++){
             cola.add(i);
        }
        System.out.println("cola:"+cola);
        while(!cola.isEmpty()){
             
        System.out.println(""+cola.poll());
             }
        
        
        System.out.println("el primer elemento es:"+cola.peek());
       /* System.out.println("borra");
        cola.remove();
        System.out.println("borra");
        cola.remove();
         cola.add("hola");
        cola.add("chao");
        cola.add("Henry");
                System.out.println("cola:"+cola);

        System.out.println("el primer elemento es:"+cola.peek());
        
        System.out.println("el tamaño de la cola es:;"+cola.size());
        
        if(cola.isEmpty())
            System.out.println("esta vacia");
        else
            System.out.println("no esta vacia");
    */    
    }
    
    
}
