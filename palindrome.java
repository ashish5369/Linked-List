public class palindrome {
    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        // same concept as the reverese recursive data
        public boolean isPalindromeHelper(node right) {
            if (right == null) {
                return true;
            }
            boolean rres = isPalindromeHelper(right.next);
            if (rres = false) {
                return false;
            } else if (left.data != right.data) {
                return false;
            } else {
                left = left.next;
                return true;
            }

        }

        node left;// this is in heap , that it is global, but right is in stack

        public boolean isPalindrome() {
            left = head;
            isPalindromeHelper(left);
        }

    }

    public static void main(String[] args) {

    }
}
