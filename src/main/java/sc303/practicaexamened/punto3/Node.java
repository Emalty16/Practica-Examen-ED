/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.practicaexamened.punto3;

/**
 *
 * @author usuario
 */
public class Node  {
    private Ingreso ingreso;
    private Node next;
    
    public Node(){ //aqui se inicia la cola
        this.ingreso = ingreso; 
        this.next = null;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

     
}
