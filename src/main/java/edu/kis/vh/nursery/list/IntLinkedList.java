package edu.kis.vh.nursery.list;
/**
 * Linked list of integer values
 */
public class IntLinkedList {
    /**
     * Error return value
     */
    public static final int EMPTY_VALUE = -1;
    Node last;
    int i;
    /**
     *Add i  value to Linked List
     * @param i int value to add to the listed List
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }
    /**
     * Check if list is empty
     * @return true  if list is empty, false otherwise
     */
    public boolean isEmpty() {
        return last == null;
    }
    /**
     * Check if Linked List is full
     * @return true or false if list is full
     */
    public boolean isFull() {
        return false;
    }
    /**
     * return last value of list
     * @return last value
     */
    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.value;
    }
    /**
     * return last value of list and remove it
     * @return last value
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }
    private class Node {
         int value;
         Node prev;
         Node next;
        public Node(int i) {
            value = i;
        }
    }
}
