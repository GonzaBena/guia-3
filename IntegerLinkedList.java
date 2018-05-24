package ar.edu.ottokrause.psr.collections;

public class IntegerLinkedList {

    private IntegerNode first;
    
    public IntegerLinkedList() {
        this.first = null;
    }
    
    public boolean add(Integer value) {
        
    }
    
    public Integer get(int index) {
        
    }
    
    public int size() {
        int count = 0;
        IntegerNode node = this.first;
        
        while (node != null) {
            count++;
            node = node.getNext();
        }
        
        return count;
    }
}
