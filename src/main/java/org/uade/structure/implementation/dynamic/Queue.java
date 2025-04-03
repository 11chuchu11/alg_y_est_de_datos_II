package org.uade.structure.implementation.dynamic;

import org.uade.exception.EmptyADTException;
import org.uade.structure.definition.QueueADT;

public class Queue implements QueueADT {
    private Node head;

    public Queue() {
        head = null;
    }
    public Queue(int value){
        head = new Node(value);
    }

    /**
     * Descripcion: Devuelve el primer elemento de la estructura.
     * Precondición: La estructura debe tener elementos.
     */
    @Override
    public int getElement() {
        if (this.isEmpty()) {
            throw new EmptyADTException("This queue is empty");
        }
        return head.getValue();
    }

    /**
     * Descripcion: Agrega un elemento al final de la estructura.
     * Precondición: La estructura no debe sobrepasar la capacidad.
     *
     * @param value
     */
    @Override
    public void add(int value) {
        if (this.isEmpty()) {
            this.head = new Node(value);
        }
        else{
            Node current = head;
            while (current.getNext()!=null){
                current = current.getNext();
            }
            current.addNext(new Node(value));
        }
    }

    /**
     * Descripcion: Elimina el primer elemento que existe.
     * Precondición: La estructura debe tener elementos.
     */
    @Override
    public void remove() {
        if (this.isEmpty()) {
            throw new EmptyADTException("This queue is empty");
        }
        this.head = this.head.getNext();
    }

    /**
     * Descripcion: Debe comprobar si la estructura tiene o no valores.
     * Precondición: No tiene.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
