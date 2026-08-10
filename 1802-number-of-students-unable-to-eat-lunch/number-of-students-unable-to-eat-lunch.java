import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        // Students → Queue
        for (int student : students) {
            q.offer(student);
        }

        // Sandwiches → Stack
        // Push from right to left so sandwiches[0] becomes top
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            st.push(sandwiches[i]);
        }

        int count = 0;

        while (!q.isEmpty() && !st.isEmpty()) {

            // Student wants the top sandwich
            if (q.peek().equals(st.peek())) {
                q.poll();
                st.pop();
                count = 0;
            }

            // Student doesn't want it
            else {
                q.offer(q.poll());
                count++;
            }

            // Entire queue refused the sandwich
            if (count == q.size()) {
                break;
            }
        }

        return q.size();
    }
}