package ar.edu.ottokrause.psr.collections;

public class IntegerNode {

    private Integer value;
    private IntegerNode next;
    private IntegerNode previous;

    public IntegerNode() {
    }

    public IntegerNode(Integer value) {
        this.value = value;
    }

    public IntegerNode(IntegerNode next) {
        this.next = next;
    }

    public IntegerNode(IntegerNode next, Integer value) {
        this.next = next;
        this.value = value;
    }

    public IntegerNode(IntegerNode next, IntegerNode previous) {
        this.next = next;
        this.previous = previous;
    }

    public IntegerNode(IntegerNode next,
            Integer value, IntegerNode previous) {

        this.next = next;
        this.value = value;
        this.previous = previous;
    }

    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return this.next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public IntegerNode getPrevious() {
        return this.previous;
    }

    public void setPrevious(IntegerNode previous) {
        this.previous = previous;
    }
}
