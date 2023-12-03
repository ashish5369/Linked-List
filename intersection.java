public class intersection {
    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        public static int intersectionLL(LinkedList one, LinkedList two) {
            node t1 = one.head;
            node t2 = two.head;
            int delta = Math.abs(one.size - two.size);

            if (one.size > two.size) {
                for (int i = 0; i < delta; i++) {
                    t1 = t1.next;
                }
            } else {
                for (int i = 0; i < delta; i++) {
                    t2 = t2.next;
                }

            }

            while(t1!=t2){
                t1=t1.next;
                t2-t2.next;
            }
            return t1.data;

        }
    }

    public static void main(String[] args) {

    }
}
