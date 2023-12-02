public class merge2sortedLL {
    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        public static LinkedList middle(LinkedList l1, LinkedList l2) {
            node one = l1.head;
            node two = l2.head;
            LinkedList res = new LinkedList();
            while (one != null && two != null) {
                if (one.data < two.data) {
                    res.addLast(one.data);
                    one = one.next;
                } else {
                    res.addLast(two.data);
                    two = two.next;
                }

            }

            // so now if one linked list is empty , so wehave to add the remianing elements
            // of the other linked list here
            while (one != null) {

                res.addLast(one.data);
                one = one.next;

            }
            while (two != null) {

                res.addLast(two.data);
                two = two.next;

            }

            return res;
        }
    }

    public static void main(String[] args) {
    }
}
