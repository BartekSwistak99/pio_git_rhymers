package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intStructures.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected;

    public HanoiRhymer(IntArrayStack stack) {
        super(stack);
        this.totalRejected = 0;
    }

    public HanoiRhymer() {
        super();
        this.totalRejected = 0;
    }

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected ++;
        else
            super.countIn(in);
    }
    public int getTotalRejected() {
        return totalRejected;
    }


}
