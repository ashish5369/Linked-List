import java.util.Scanner;

public class linkedListFunctions {
    public static class node {
        int data;
        node next;
    }

    public static class LinkedList {
        node head;
        node tail;
        int size;

        void addlast(int val) {

            if (size == 0) {
                node temp = new node();
                temp.data = val;
                temp.next = null;
                head = tail = temp;
                size++;

            }

            else {
                node temp = new node();
                temp.data = val;
                temp.next = null;
                tail.next = temp;
                tail = temp;
                size++;

            }
        }

        public int size() {
            return size;
        }

        public void display() {
            // we'll use tmep to point to the next locations and print them
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }

        void removeFirst() {

            if (size == 0) {
                System.out.println("Linked List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }

        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;

            }
        }

        public void addFirst(int val) {
            node temp = new node();
            temp.data = val;
            temp.next = head;
            head = temp;
            if (size == 0) {
                tail = temp;
            }
            size++;

        }

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid Argument");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addlast(val);
            } else {
                node node1 = new node();
                node1.data = val;

                node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }

                node1.next = temp.next;
                temp.next = node1;
                size++;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("Linked List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                node temp = new node();
                temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
                size--;
            }

        }

        // private and can only be acessed wihtin the class and not outside of the class
        private node getNodeAt(int idx) {
            node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;

        }

        public void reverseListDataIterative() {
            // iteratively--only change the data property not the address
            int li = 0;
            int ri = size - 1;
            while (li < ri) {
                node left = getNodeAt(li);
                node right = getNodeAt(ri);
                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                li++;
                ri--;
            }
        }

        public void reverseListPointerIterative() {
            // here we are not goijng to change the data rather we are going to change the
            // indexes and for that we are going to ask every node to point to its previous
            // nodes address adn because of which we are going to have head pointing to null
            // as there is not node before head and tail will point to second last node and
            // this way we'll be reversing the linked list

            // we are going to have pointers that is current and previous
            // both are going to have differnce of 1
            // then make the current.next =previous this way the new link with the before
            // node is going to get estableished

            node previous = null;
            node current = head;
            while (current != null) {
                node ocn = current.next;
                current.next = previous;
                previous = current;
                current = ocn;
            }

            node temp = head;
            head = tail;
            tail = temp;

        }

        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid Arguments");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.display();

        sc.close();
    }
}