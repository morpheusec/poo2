/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Henry Guerra @morpheusec <morpheusec@gmail.com>
 */
public class Paciente {
       private  String Nombre;
    private int ficha;

    public Paciente() {
        this.Nombre="";
        this.ficha=0;
    }

    public Paciente(String Nombre, int ficha) {
        this.Nombre = Nombre;
        this.ficha = ficha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }
    
    public static void mostrar(Queue<Paciente> cola) {
        int n = cola.size();
        System.out.println("Cola de Usuarios");
        System.out.println("_____________________________");
        for (int i = 0; i < n; i++) {
            Paciente pa = cola.remove();
            System.out.println(" Paciente: " + pa.getNombre() +" Turno: "+pa.getFicha());
            cola.add(pa);
        }
    }
    public static void main(String[] args) {
        int op;
        Queue<Paciente> cola = new LinkedList<>();
        
        
       /* cola.add(new Paciente("Nombre 1 ", 1));
        cola.add(new Paciente("Nombre 2 ", 2));
        cola.add(new Paciente("Nombre 3 ", 3));
        cola.add(new Paciente("Nombre 4 ", 4));
       Paciente.mostrar(cola);
       cola.remove();
        System.out.println("\n");
       Paciente.mostrar(cola);
       */
       boolean salir=false;
       int c=1;
        while (!salir) {            
        System.out.println("\nMenu Principal");
        System.out.println("<1> Asignar un turno");
        System.out.println("<2> Pase a la Ventanilla disponible");
        System.out.println("<3> Mostrar turnos en cola");
        System.out.println("<4> Salir");
        Scanner sc = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        op=sc.nextInt();
        switch(op){
            case 1:
                Paciente pa = new Paciente();
                System.out.println("Ingrese el Nombre del paciente: ");
                String no=nom.nextLine();
               // String nom = no;
              //  System.out.println("Paciente: "+no+" Tiene el turno:"+ c);
                pa.setNombre(no);
                cola.add(new Paciente(pa.getNombre(), c));
                System.out.println("Cola de Pacientes: ");
                Paciente.mostrar(cola);
                c++;
             break;

            case 2:
               cola.remove();
               Paciente.mostrar(cola);
                //c--;
                break;
            case 3:
                
             Paciente.mostrar(cola);  
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
