public class DynamicArray {
    private int[] theArray;
    private int numItems=0;
    public DynamicArray(){
        theArray = new int[1];
        numItems = 0;
    }
    public void addItem(int item){
        if (numItems == theArray.length){
            growArray();
        }
        theArray[numItems++] = item;
    }

    private void growArray() {
        int[] tempArray = new int[theArray.length+1];
        for (int i=0; i<numItems; i++){
            tempArray[i] = theArray[i];
        }
        theArray = tempArray;
    }

    public void print(){
        for (int i = 0; i<numItems; i++){
            System.out.print(theArray[i]+" ");
        }
        System.out.println();
    }
    public int size(){
        return theArray.length;
    }
}
