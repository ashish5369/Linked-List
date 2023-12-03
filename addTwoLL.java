public class addTwoLL {
    public static class node {
        node next;
        int data;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        public static int addHelper(node one, int pv1, node two, int pv2, LinkedList res) {
            if (one == null && two == null) {
                return 0;// this retun is basically the carry
            }
            int data = 0;
            if (pv1 > pv2) {
                addHelper(one.next, pv1 - 1, two, pv2, res);
                data = one.data + oc;
                int nd = data % 10;
                int nc = data / 10;
                res.addFirst(nd);
                return nc;
            } else if (pv1 < pv2) {
                addHelper(one, pv1, two.next, pv2 - 1, res);
                data = two.data + oc;
                int nd = data % 10;
                int nc = data / 10;
                res.addFirst(nd);
                return nc;

            } else {
                int oc = addHelper(one.next, pv1 - 1, two.next, pv2 - 1, res);
                data = one.data + two.data + oc;
                int nd = data % 10;
                int nc = data / 10;
                res.addFirst(nd);
                return nc;

            }

        }

        public static LinkedList add2ll(LinkedList one, LinkedList two) {
            LinkedList res = new LinkedList();
            int oc = addHelper(one.head, one.size, two.head, two.size, res);
            return res;

        }
    }

    public static void main(String[] args) {

    }
}