//cannot use size property
//in one traversal
//and can only use iteration
public class kthFromEndLL {
    public static class node {
        node next;
        int data;
    }

    public static class linkedlist {
        node head;
        node tail;
        int size;

        public int kthfromlast(int k) {
            node s = head;
            node f = head;
            for (int i = 0; i < k; i++) {
                f = f.next;
            }
            while (f != tail) {
                s = s.next;
                f = f.next;
            }
            return s.data;

        }
    }

    public static void main(String[] args) {
    }
}
