package org.uade.structure.implementation.dynamic.extras;

import org.uade.structure.implementation.dynamic.LinkedList;

public class UtilsLinkedList {

     public static void printLinkedList(LinkedList list){

         System.out.print("[ ");
         for(int i = 0; i < list.size(); i++){
             String next = list.size()-1 == i ? " ]":", ";
             System.out.print(list.get(i)+next);
         }
     }
}
