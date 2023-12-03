//eg the k=3 so we are going to reverse every 3 elements
//if some is not in group of 3 then dont reverse it
public class kReverse {
    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        public void kreverse(int k) {
            LinkedList prev = new LinkedLIst();
            while (this.size > 0) {
                LinkedList cur = new LinkedList();
                if (this.size >= k) {
                    for (int i = 0; i < k; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        cur.addFirst(val);

                    }
                } else {
                    int s = this.size();
                    for (int i = 0; i < s; i++) {
                        int val = this.getFirst();
                        this.removeFirst();
                        curr.addLast(val);

                    }
                }
                if (prev == null) {
                    prev = curr;
                } else {
                    prev.tail.next = curr.head;
                    prev.tail = curr.tail;
                    prev.size += curr.size;

                }

            }
            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;

        }

    }

    public static void main(String[] args) {

    }
}
