
import java.util.Stack;

class MyQueue {

    private Stack<Integer> real;
    private Stack<Integer> sub;

    public MyQueue() {
        this.real = new Stack<>();
        this.sub = new Stack<>();
    }

    public void push(int x) {
        if (real.isEmpty()) {
            real.push(x); 
        }else {
            while (!this.real.isEmpty()) {
                this.sub.push(this.real.pop());
            }
            this.real.push(x);
            while (!this.sub.isEmpty()) {
                this.real.push(this.sub.pop());
            }
        }
    }

    public int pop() {
        return real.pop();
    }

    public int peek() {
      return real.peek();
    }

    public boolean empty() {
      return real.isEmpty();
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
