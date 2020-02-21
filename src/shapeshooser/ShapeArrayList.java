package shapeshooser;

public class ShapeArrayList<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new  Object[INIT_SIZE];
    private int pointer = 0;


    /*
    ADD
     */

    public void add(T item){
        if (pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;
    }
    /*
    GET_ITEM
     */
    public T get(int Index) {
        return (T) array[Index];
    }
    /*
    GET SIZE
     */
    public int size(){
        return pointer;
    }

    /*
    RESIZE
     */
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array,0,newArray,0,pointer);
        array = newArray;
    }
}
