class MyQueue {

    int[] stack1 = new int[100];
    int[] stack2 = new int[100];

    int top1 = -1;
    int top2 = -1;

    public MyQueue() {
    }

    public void push(int x) {
        stack1[++top1] = x;
    }

    public int pop() {

        moveElements();

        return stack2[top2--];
    }

    public int peek() {

        moveElements();

        return stack2[top2];
    }

    public boolean empty() {
        return top1 == -1 && top2 == -1;
    }

    private void moveElements() {

        if (top2 == -1) {

            while (top1 >= 0) {
                stack2[++top2] = stack1[top1--];
            }
        }
    }
}
