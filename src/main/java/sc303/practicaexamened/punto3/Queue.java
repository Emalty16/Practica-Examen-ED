/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.practicaexamened.punto3;

import sc303.practicaexamened.punto2.Node 

public class Queue <Palco>{
    private Node head;
    private Node end;
    
    public void enqueue(Palco value){
        Node<Palco> newNode = new Node<Palco>(value);
        if(head == null){
            head = newNode;
            end= newNode;
        }
        else{
            end.setNext(newNode);
            end=newNode;
            
        }
    }
    public void llenarDatos(String sector, String hora, int cedula){
        
        Queue co01=new Queue();
        
        Node x = new Node ();
        x.getPersona();
    
}
