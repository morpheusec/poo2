/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import Cola.Paciente;
import java.util.Random;
import java.util.Scanner;

import java.util.Stack;

/**
 *
 * @author Henry Guerra @morpheusec <morpheusec@gmail.com>
 */
public class Usuario {
        int id;
        String login;
        String password;

    public Usuario(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

   
        
      public  static void mostrarPila(Stack<Usuario> usuarios){
        System.out.println("\nPila de Usuarios");
        System.out.println("==================");
        //Utilizamos foreach para acceder a cada registro usuario y mostrarlo
        for(Usuario u: usuarios){
            System.out.println("Id: " + u.getId());
            System.out.println("Nombre: " + u.getLogin());
            System.out.println("Password: " + u.getPassword());
            System.out.println("==============");
        }
    }
      
      public void setPassword(int tam) {
        String May = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Minus = May.toLowerCase();
        String digitos = "1234567890";
        String letras = May + Minus + digitos;
        this.password = generarcontrasenia(tam, letras);
    }   
       public  String generarcontrasenia(int length, String seedChars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        Random rand = new Random();
        while (i < length) {
            sb.append(seedChars.charAt(rand.nextInt(seedChars.length())));
           // sb.append(digits.charAt(rand.nextInt(digits.length())));
            i++;
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
        
        Stack<Usuario> pila = new Stack<Usuario>();
        int op;
            
        boolean salir=false;
       int c=1;
        while (!salir) {            
        System.out.println("\nMenu Principal");
        System.out.println("<1> Nuevo Usuario");
        System.out.println("<2> Borrar Usuario de la pila");
        System.out.println("<3> Mostrar Usuarios");
        System.out.println("<4> Salir");
        Scanner sc = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        op=sc.nextInt();
        switch(op){
            case 1:
               // Paciente pa = new Paciente
                Usuario usu= new Usuario();
                System.out.println("Ingrese el Usuario: ");
                String no=nom.nextLine();
               // String nom = no;
              //  System.out.println("Paciente: "+no+" Tiene el turno:"+ c);
                usu.setId(c);
                usu.setLogin(no);
                usu.setPassword(6);
                pila.add(new Usuario(usu.getId(),usu.getLogin(),usu.getPassword()));
                System.out.println("Pila de Usuarios: ");
                Usuario.mostrarPila(pila);
                c++;
             break;

            case 2:
               pila.pop();
               Usuario.mostrarPila(pila);
                //c--;
                break;
            case 3:
                
             Usuario.mostrarPila(pila);  
             break;
             
            case 4:
                
                salir= true;
             break;
             
             default:
                 
               salir = true;
               
        }
        
        }
    }
    
    
}
