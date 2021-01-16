package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    public static final int EMPTY_VALUE = -1;
    public static final int NO_MORE_NUMBERS = -1;
    public static final int FULL_VALUE = NUMBERS_SIZE - 1;

    public int total = EMPTY_VALUE;
    private final int[] numbers = new int[NUMBERS_SIZE];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == FULL_VALUE;
    }

    protected int peekaboo() {
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
