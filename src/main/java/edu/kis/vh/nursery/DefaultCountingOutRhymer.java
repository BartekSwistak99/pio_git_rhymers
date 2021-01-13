package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    public static final int EMPTY_VALUE = -1;
    public static final int FULL_VALUE = 11;

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
            return EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total--];
    }

}
