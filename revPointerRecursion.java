public class revPointerRecursion {
    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        private void reversePRHelper(node node1) {
            if (node1 == null) {
                return;
            }
            if (node1 == tail) {
                // do nothing
            } else {
                node1.next.next = node;
            }
            reversePRHelper(node1.next);

        }

        public void reversePR() {
            reversePRHelper(head);
            head.next = null;
            node temp = head;
            head = tail;
            tail = temp;
        }
    }

    public static void main(String[] args) {
    }
}
