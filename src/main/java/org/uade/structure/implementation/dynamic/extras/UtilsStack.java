package org.uade.structure.implementation.dynamic.extras;

import org.uade.structure.implementation.dynamic.Stack;

public class UtilsStack {

    public static void printStack(Stack s, boolean ln){
        Stack copy = copyStack(s);

        while (!copy.isEmpty()){
            System.out.print(copy.getElement()+" ");
            copy.remove();
        }
        if (ln){
            System.out.println();
        }
    }

    public static void printStack(Stack s){
        Stack copy = copyStack(s);

        while (!copy.isEmpty()){
            System.out.print(copy.getElement()+" ");
            copy.remove();
        }

        System.out.println();
    }

    public static Stack copyStack(Stack s){
        Stack copy = new Stack();
        Stack aux = new Stack();

        while(!s.isEmpty()){
            aux.add(s.getElement());
            s.remove();
        }
        while(!aux.isEmpty()){
            copy.add(aux.getElement());
            s.add(aux.getElement());
            aux.remove();
        }

        return copy;
    }

    public static Stack reverseCopyStack(Stack s){
        Stack copy = new Stack();
        int value;

        while(!s.isEmpty()){
            value = s.getElement();
            s.remove();
            copy.add(value);
        }


        return copy;
    }

    public static int countStack (Stack s){
        int count = 0;
        Stack copy = copyStack(s);

        while(!copy.isEmpty()){
            count++;
            copy.remove();
        }

        return count;
    }

    public static int sumStack (Stack s){
        int sum = 0;
        Stack copy = copyStack(s);
        while(!copy.isEmpty()){
            sum += copy.getElement();
            copy.remove();
        }
        return sum;
    }

    public static int averageStack (Stack s){
        int sum = sumStack(s);
        int count = countStack(s);
        return sum/count;
    }

}
