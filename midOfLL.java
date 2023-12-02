//cannot use size property
//in one traversal
//and can only use iteration
//if even the last node of the first half is the middle
public class midOfLL {
    public static class node {
        node next;
        int data;
    }

    public static class linkedlist {
        node head;
        node tail;
        int size;

        public int middle() {
            node s = head;
            node f = head;

            while (f.next != null && f.next.next != null) {
                s = s.next;
                f = f.next.next;
            }
            return s.data;

        }
    }

    public static void main(String[] args) {

    }
}
