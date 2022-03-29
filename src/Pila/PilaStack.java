/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;
import java.util.Stack;
/**
 *
 * @author Henry Guerra @morpheusec <morpheusec@gmail.com>
 */
public class PilaStack {
    
    
    public static void main(String[] args) {
        Stack pila = new Stack();
        
        pila.push(1);
        pila.push("hola");
        pila.push(3);
        pila.push("chao");
        //pila.pop();
       //  pila.pop();
        
        System.out.println("elultimoelmento es:"+pila.peek());
        while(pila.empty()==false)
            System.out.println(pila.pop());
        
        
    }
    
    
}
