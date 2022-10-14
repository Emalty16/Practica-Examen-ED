/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.practicaexamened.punto2;

/**
 *
 * @author usuario
 */
public class Node <Camisa> {
    
    private Camisa value;
    private Node<Camisa> next;
    private Node<Camisa> back;

    public Node(Camisa value) {
        this.value = value;
    }
    
    public Node() {
    }

    public Camisa getValue() {
        return value;
    }

    public void setValue(Camisa value) {
        this.value = value;
    }

    public Node<Camisa> getNext() {
        return next;
    }

    public void setNext(Node<Camisa> next) {
        this.next = next;
    }

    public Node<Camisa> getBack() {
        return back;
    }

    public void setBack(Node<Camisa> back) {
        this.back = back;
    }
}
