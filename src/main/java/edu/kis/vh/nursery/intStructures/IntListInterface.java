package edu.kis.vh.nursery.intStructures;

public interface IntListInterface {
    int EMPTY_VALUE = 0;

    boolean isFull();
    boolean isEmpty();
    void push(int i);
    int top();
    int pop();
}
