import java.util.LinkedList;
// here we want the odd numbers first and then the even numbers
//constant space

public class oddEvenList {

    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        public void oddEven() {
            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();
            while (this.size() > 0) {
                int val = this.getFirst();
                this.removeFirst();
                if (val % 2 == 0) {
                    even.addLast(val);
                } else {
                    odd.atLast(val);
                }
            }
            if (odd.size > 0 && even.size > 0) {
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.zize + even.size;
            }

            else if (odd.size > 0) {
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.zize;

            } else if (even.size > 0) {
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.zize;

            }
        }

        public static void main(String[] args) {

        }
    }
}
