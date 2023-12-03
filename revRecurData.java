public class revRecurData {

    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        public void reverseDRhelper(node right, int floor) {
            if (right == null) {
                return;
            }
            reverseDRhelper(right.next, floor + 1);
            while (floor > size / 2) {
                int temp = right.data;
                right.data = rleft.data;
                rleft.data = temp;
                rleft = rleft.next;
            }
        }

        node rleft;// this is like we have two pointers one on the head nad other on the tail and
                   // we move both the pointers till they meet at the same point
        // so this rlefyt is the head and right will give us the right pointer and as we
        // return fromt the recursion the righ pointer will automiatically moves inwards
        // that is towards the inner node adn we will do left.next to make the left node
        // to move toweards the center

        public void reverseDR() {
            rleft = head;
            reverseDRhelper(head, 0);

        }

    }

    public static void main(String[] args) {

    }
}