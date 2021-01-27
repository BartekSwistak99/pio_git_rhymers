package edu.kis.vh.nursery.intStructures;

public class IntArrayStack implements IntListInterface {

    public static final int NUMBERS_SIZE = 12;
    private static final int NO_MORE_NUMBERS = 0;
    private static final int FULL_VALUE = NUMBERS_SIZE -1;

    private final int[] numbers = new int[NUMBERS_SIZE];
    //Test isFull() failed
    private int total = EMPTY_VALUE;


    public int getTotal() {
        return total;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    @Override
    public boolean isEmpty() {
        return total == EMPTY_VALUE;
    }


    //Test isFull() failed
    @Override
    public boolean isFull() {
        return total == FULL_VALUE;
    }
    @Override

    public int top() {
        if (isEmpty())
            return NO_MORE_NUMBERS;
        return numbers[total];
    }
    @Override
    public int pop() {
        if (isEmpty())
            return NO_MORE_NUMBERS;
        return numbers[total--];
    }

}
