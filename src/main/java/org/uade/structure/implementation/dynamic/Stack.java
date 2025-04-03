package org.uade.structure.implementation.dynamic;

import org.uade.exception.EmptyADTException;
import org.uade.structure.definition.StackADT;

public class Stack implements StackADT {

    private Node tail;

    public Stack() {
        this.tail = null;
    }

    public Stack(int tail) {
        this.tail = new Node(tail);
    }


    /**
     * Descripcion: Devuelve el último elemento de la estructura.
     * Precondición: La estructura debe tener elementos.
     */
    @Override
    public int getElement() {
        if (this.isEmpty()){
            throw new EmptyADTException("This stack is empty");
        }

        return this.tail.getValue();
    }

    /**
     * Descripcion: Agrega un elemento al final de la estructura.
     * Precondición: La estructura no debe sobrepasar la
     * capacidad.
     *
     * @param value
     */
    @Override
    public void add(int value) {
        if (this.isEmpty()){
            this.tail = new Node(value);
        }
        else {
            Node newNode = new Node(value);
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }
    }

    /**
     * Descripcion: Elimina el último elemento que existe.
     * Precondición: La estructura debe tener elementos.
     */
    @Override
    public void remove() {
        if (this.isEmpty()) {
            throw new EmptyADTException("This stack is empty");
        }
            this.tail = this.tail.getPrev();
    }

    /**
     * Descripcion: Debe comprobar si la estructura tiene o no valores.
     * Precondición: No tiene.
     */
    @Override
    public boolean isEmpty() {
        return tail == null;
    }
}
