import java.util.*;

public class LLToStack {
    public static class LLtoStackAdapter {
        LinkedList<Integer> list;

        public LLtoStackAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.addFirst(val);
        }

        int pop() {
            if (list.size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return list.removeFirst();
            }
        }

        int top() {
            if (list.size() == 0) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return list.getFirst();
            }

        }

    }

    public static void main(String[] args) {
    }
}
