class MyQueue {

    Stack primary;
    Stack secondary;

    public MyQueue() {
        primary = new Stack();
        secondary = new Stack();
    }

    public void push(int x) {
        primary.push(x);
    }

    public int pop() {
        while (!primary.isEmpty()) {
            secondary.push(primary.pop());
        }

        int temp = secondary.pop();

        while (!secondary.isEmpty()) {
            primary.push(secondary.pop());
        }

        return temp;
    }

    public int peek() {
        while (!primary.isEmpty()) {
            secondary.push(primary.pop());
        }

        int temp = secondary.peek();

        while (!secondary.isEmpty()) {
            primary.push(secondary.pop());
        }

        return temp;
    }

    public boolean empty() {
        return primary.isEmpty();
    }

    class Stack {

        int[] data;
        int ptr = -1;

        Stack() {
            data = new int[10];
        }

        void push(int x) {
            if (ptr == data.length - 1) {
                int[] temp = new int[data.length * 2];

                for (int i = 0; i < data.length; i++) {
                    temp[i] = data[i];
                }

                data = temp;
            }

            data[++ptr] = x;
        }

        int pop() {
            return data[ptr--];
        }

        int peek() {
            return data[ptr];
        }

        boolean isEmpty() {
            return ptr == -1;
        }
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */