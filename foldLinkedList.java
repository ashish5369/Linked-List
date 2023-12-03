public class foldLinkedList {
    public static class node {
        node next;
        int data;
    }

    // same concept as the palindrome and the reverse ll using recusrion for data
    public static class LinkedList {
        node head;
        node tail;
        int size;

        node left;

        public void foldHelper(node right, int floor) {
            if (right == null) {
                return;
            }
            foldHelper(right.next, floor + 1);
            if (floor > size / 2) {
                node temp = left.next;
                left.next = right;
                right.next = temp;
                left = temp;
            } else if (floor == size / 2) {
                tail = right;
                tail.next = null;
            }
        }

        public void fold() {
            left = head;
            foldHelper(left, floor);
        }
    }

    public static void main(String[] args) {

    }
}
