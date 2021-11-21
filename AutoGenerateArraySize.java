import java.util.ArrayList;

public class AutoGenerateArraySize {
    private static int size = 2;
    private static int top=-1;
    private  int[]  theArray ;

    public AutoGenerateArraySize() {
        this.theArray = new int[size];
    }
    public void addElement(int item){
        top++;
        if (top==size){
            grow();
        }
        theArray[top]=item;

    }
    private void grow(){
        int[] tempArray;
        tempArray = theArray;
        theArray = new int[size+20];
        for (int i = 0; i<tempArray.length;i++){
            theArray[i] = tempArray[i];
        }
    }
    public void show(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i<=top; i++){
            System.out.print(" "+theArray[i]);
        }
        System.out.println();
    }
    public int removeItem(){
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }
        return theArray[top--];
    }
    private boolean isEmpty(){
        return top==-1;
    }

}
