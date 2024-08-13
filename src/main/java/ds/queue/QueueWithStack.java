package ds.queue;

import java.util.Stack;

public class QueueWithStack {

    Stack<String> stack = new Stack();
    Stack<String> stack2 = new Stack();

    public static void main(String[] args) {
        QueueWithStack queueWithStack = new QueueWithStack();
        queueWithStack.enQueue("Vishitha");
        queueWithStack.enQueue("Aparna");
        queueWithStack.enQueue("Vishrutha");
        System.out.println(queueWithStack);
        System.out.println("Dequeuing starts");
        System.out.println(queueWithStack.deQueue());
        System.out.println(queueWithStack.deQueue());
        System.out.println(queueWithStack.deQueue());
        System.out.println(queueWithStack);
    }

    private QueueWithStack enQueue(String data) {
        this.stack.push(data);
        return this;
    }

    private String deQueue() {
        while (!this.stack.isEmpty()) {
            this.stack2.push(this.stack.pop());
        }
        String returnVal = this.stack2.pop();
        while (!this.stack2.isEmpty()) {
            this.stack.push(this.stack2.pop());
        }
        return returnVal;
    }

    @Override
    public String toString() {
        return "QueueWithStack{" +
                "\nstack=" + stack +
                ", \nstack2=" + stack2 +
                "\n}";
    }
}
