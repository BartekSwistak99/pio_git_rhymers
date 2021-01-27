package edu.kis.vh.nursery.intStructures;

public class IntArrayStack implements IntListInterface {


    private static final int NUMBERS_SIZE = 12;
    private static final int NO_MORE_NUMBERS = -1;
    private static final int FULL_VALUE = NUMBERS_SIZE - 1;
    private final int[] numbers = new int[NUMBERS_SIZE];
    private int total = EMPTY_VALUE;


    public int getTotal() {
        return total;
    }


    public int getStackCapacity() {
        return NUMBERS_SIZE;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == FULL_VALUE;
    }
    public int peekaboo() {
        if (callCheck())
            return NO_MORE_NUMBERS;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NO_MORE_NUMBERS;
        return numbers[total--];
    }

}
