package org.uade.algorithm;

import org.uade.structure.implementation.dynamic.LinkedList;
import org.uade.structure.implementation.dynamic.Stack;

// import static org.uade.structure.implementation.dynamic.extras.UtilsLinkedList.printLinkedList;
import static org.uade.structure.implementation.dynamic.extras.UtilsStack.*;


public class Prueba {
    public static void main(String[] args) {
       /*
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        printLinkedList(list);

        System.out.println();
        list.remove(9);
        printLinkedList(list);

        System.out.println();
        list.add(10);
        printLinkedList(list);

        System.out.println();
        list.insert(3,11);
        printLinkedList(list);

        System.out.println(list.get(3));
*/

        Stack stack = new Stack();
        for (int i = 0; i < 20; i++) {
            stack.add(i);
        }

        Stack copy = copyStack(stack);
        printStack(copy);
        printStack(stack);
        System.out.println(stack.isEmpty());
        Stack reversedCopy = reverseCopyStack(stack);
        printStack(reversedCopy);

        System.out.println(countStack(reversedCopy));
        printStack(stack);

        System.out.println(countStack(stack));
        System.out.println(countStack(copy));

    }
}
