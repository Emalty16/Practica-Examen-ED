/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.practicaexamened.punto2;

/**
 *
 * @author usuario
 */
public class Stack {
    private Node cima;
    private Node end; 
    
    
    public Stack(){
        this.cima = null;
        this.end = null;
    }
    public boolean isEmpty(){
        if (cima==null){
            return true;
        }else{
            return false;
        }
    }
    public void push(Camisa value){
        Node<Camisa> newNode= new Node<Camisa>(value);
        Camisa c = new Camisa("Lola", "S", "Blanca", "Levis", 0); 
        Node nuevo = new Node();
        
        if(cima== null){
            cima=newNode;
            
            if(c.getMarca().equals("Bunny")){
                end = nuevo;
            }
        } else{
            newNode.setNext(cima);
            cima = newNode;
        }
        
    }
      
    public void mostrar(){
        System.out.println("El resultado de la pila es:"+ cima);
    }
}
