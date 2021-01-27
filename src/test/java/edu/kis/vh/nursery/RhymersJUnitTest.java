package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intStructures.IntArrayStack;
import edu.kis.vh.nursery.intStructures.IntListInterface;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertTrue(result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());

        for (int i = 0; i < IntArrayStack.NUMBERS_SIZE; i++) {
            boolean result = rhymer.isFull();
           System.out.println(i+" "+result);
            Assert.assertFalse(result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertTrue(result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.peekaboo();
        Assert.assertEquals(IntListInterface.EMPTY_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {

        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int result = rhymer.countOut();
        Assert.assertEquals(IntListInterface.EMPTY_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(IntListInterface.EMPTY_VALUE, result);
    }

}
