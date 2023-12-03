//make two list ,one with the sorted data and another with results
// we are going to do remove firsty from the original list and add last it to the result listand only if the data is diffrent fromt the tail of resukl list then only add last to the list

import java.util.LinkedList;

public class duplicateInSorted {
    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        public void removeDuplicates() {
            LinkedList res = new LinkedList();
            // this the linkedlist that we are receiving from the user so
            while (this.size() > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if (res.size == 0 || res.tail.data != val) {
                    res.addLast(val);
                }
                // it is linear time complexity and o(1) space complexity as the number of nodes
                // is never exceeding n, if there were n nodes in the this list,at last we will
                // have n or less than n nodes, it will never exceed as we are always removing
                // from the this list but only adding in res list if the data is different
            }
            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size;
        }
    }

    public static void main(String[] args) {

    }
}
