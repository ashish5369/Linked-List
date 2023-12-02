import java.util.*;

public class LLtoQueue {

    public static class LLtoQueueAdapter {
        LinkedList<Integer> list;

        LLtoQueueAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.addLast(val);
        }

        int pop() {
            if (size() == 0) {
                return -1;
            } else {
                return list.removeFirst();
            }
        }

        int peek() {
            if (size() == 0) {
                return -1;
            } else {
                return list.getFirst();
            }

        }

    }

    public static void main(String[] args) {

    }
}
