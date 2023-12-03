public class MergeSortLL {
    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        public static LinkedList mergeSort(node head, node tail) {
            if (head == tail) {
                LinkedList br = new LinkedList();
                br.addLast(head.data);
                return br;

            }
            node mid = midNode(head, tail);
            LinkedList fsh = mergeSort(head, mid);
            LinkedList ssh = mergeSort(mid.next, tail);
            LinkedList cl = LinkedList.mergeSort(fsh, ssh);
            return cl;

        }

        public static node midNode(node head, node tail) {
            node f = head;
            node s = tail;
            while (f.next != null && f.next.next != null) {
                f = f.next.next;
                s = s.next;
            }
            return s;
        }

    }

    public static void main(String[] args) {
    }
}
