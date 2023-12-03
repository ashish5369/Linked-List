public class reverseRecursive {
    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        private void displayReverseHelper(node node1) {
            if (node == null) {
                return;
            }
            displayReverseHelper(node1.next);
            System.out.println(node1.data + " ");
        }
    }

    public static void main(String[] args) {

    }
}
