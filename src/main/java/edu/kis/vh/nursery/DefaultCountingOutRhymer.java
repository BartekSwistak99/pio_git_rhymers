package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private IntArrayStack stack;

    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }

    public int getTotal() {
        return stack.getTotal();
    }

    public int getStackCapacity() {
        return stack.getStackCapacity();
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }
}










//package edu.kis.vh.nursery;
//
//public class DefaultCountingOutRhymer {
//
//    public  static final int EMPTY_VALUE = -1;
//    private static final int NUMBERS_SIZE = 12;
//    private static final int NO_MORE_NUMBERS = -1;
//    private static final int FULL_VALUE = NUMBERS_SIZE - 1;
//    private final int[] numbers = new int[NUMBERS_SIZE];
//    private int total = EMPTY_VALUE;
//
//    public int getTotal() {
//        return total;
//    }
//
//    public int getStackCapacity() {
//        return NUMBERS_SIZE;
//    }
//
//    public void countIn(int in) {
//        if (!isFull())
//            numbers[++total] = in;
//    }
//
//    public boolean callCheck() {
//        return total == EMPTY_VALUE;
//    }
//
//    public boolean isFull() {
//        return total == FULL_VALUE;
//    }
//
//    protected int peekaboo() {
//        if (callCheck())
//            return NO_MORE_NUMBERS;
//        return numbers[total];
//    }
//
//    public int countOut() {
//        if (callCheck())
//            return NO_MORE_NUMBERS;
//        return numbers[total--];
//    }
//
//}
