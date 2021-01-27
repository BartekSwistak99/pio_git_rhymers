package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intStructures.IntArrayStack;
import edu.kis.vh.nursery.intStructures.IntLinkedList;

//kombinacja alt + <- w Intellij zmienia kartę z wcześniej otwartym plikiem
public class FIFORhymer extends DefaultCountingOutRhymer {
//    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntLinkedList());
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntArrayStack());

    public FIFORhymer(IntArrayStack stack) {
        super(stack);
    }

    public FIFORhymer() {
        super();
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());
        return ret;
    }
}
