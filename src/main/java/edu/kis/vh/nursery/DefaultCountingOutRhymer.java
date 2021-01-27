package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intStructures.IntArrayStack;
import edu.kis.vh.nursery.intStructures.IntListInterface;

public class DefaultCountingOutRhymer {
    private IntListInterface stack;

    public DefaultCountingOutRhymer(IntListInterface stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }
}
