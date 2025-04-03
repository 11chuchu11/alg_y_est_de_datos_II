package org.uade.structure.implementation.dynamic;

import org.uade.structure.definition.LinkedListADT;

public class LinkedList implements LinkedListADT {

    protected Node head;
    protected int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }
    public LinkedList(int head){
        this.head = new Node(head);
        this.size = 0;
    }

    @Override
    public void add(int value) {
        if (this.head == null) {
            this.head = new Node(value);
        }else {
            Node current = this.head;
            while (current.getNext()!=null){
                current = current.getNext();
            }
            current.addNext(new Node(value));
        }
        this.size++;
    }

    @Override
    public void insert(int index, int value) {

        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of range");
        }

        Node newNode = new Node(value);

        if(index == 0){
            newNode.addNext(this.head);
            this.head = newNode;
        }

        else {
            Node current = this.head;
            for (int i=0;i<index-1;i++){
                current = current.getNext();
            }
            newNode.addNext(current.getNext());
            current.addNext(newNode);
        }
        this.size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of range");
        }

        if (index == 0){
            this.head = this.head.getNext();
        }
        else {
            Node current = this.head;
            for (int i=0;i<index-1;i++){
                current = current.getNext();
            }
            current.addNext(current.getNext().getNext());
        }
        this.size--;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of range");
        }

        Node current = this.head;
        for (int i=0;i<index;i++){
            current = current.getNext();
        }
        return current.getValue();

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
