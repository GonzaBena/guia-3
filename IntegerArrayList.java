package ar.edu.ottokrause.psr.collections;
import java.util.ArrayList;
/*
Crear una clase IntegerArrayList que implemente la interfaz IntegerList utilizando arreglos como el
medio de almacenamiento subyacente. Al momento de agregarse un elemento de una instancia
de IntegerArrayList, el arreglo que contiene los elementos debe ser copiado a uno nuevo que
tenga lugar para almacenar el nuevo elemento que se desea agregar.
*/
public class IntegerArrayList implements IntegerList{
    
    private int tamañoInicial;
    Integer[] array;

    public IntegerArrayList() {
        this.tamañoInicial = 50;
        array = new Integer[tamañoInicial];
    }

    @Override
    public boolean add(Integer element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            this.array[i] = null;
        }
    }

    @Override
    public boolean contains(Integer element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                return i;
            }
        }
        return null;        
    }

    @Override
    public boolean isEmpty() {
        return array[0] == null;
    }

    @Override
    public int lastIndexOf(Integer element) {
        Integer count = null;
        for (int i = array.length; i > 0; i--) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int remove(int index) {
        array[index]
    }
    @Override
    public int size() {
        return this.array.length;
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
