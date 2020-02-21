public class ArrayUtil {

    /*
    * Define the array size in the constructor
    * insert
    * removeAT
    * print
    * indexOf
    * */

    int[] items;
    int count;

    public ArrayUtil(int size) {
        items = new int[size];
    }

    public void print(){
        for (int i = 0; i < count ; i++) {
            System.out.println(items[i]);
        }
    }

    public int indexOf(int item){
        for (int i = 0; i < count; i++) {
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }

    public void insert(int item){
        //Array is full
        if(items.length == count){
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index){
        if(index < 0 || index > count-1){
            throw  new IllegalArgumentException();
        }
        //  0 1 2 3 index
        //  1 2 3 4 value
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
            count--;
        }

    }
}


