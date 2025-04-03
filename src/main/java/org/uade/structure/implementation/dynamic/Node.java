package org.uade.structure.implementation.dynamic;

public class Node {
    protected  int value;
    protected Node next;
    protected Node prev;

    public Node(int x){
        this.value = x;
        this.next = null;
        this.prev = null;
    }
    public void addNext(Node nextNode){
        this.next = nextNode;
    }

    public Node getNext(){
        return this.next;
    }

    public int getValue(){
        return this.value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
