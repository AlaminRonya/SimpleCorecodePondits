import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Node{
    private int data;
    private Node node;

    public Node() {
    }
    public Node(int data) {
        this.data = data;
        this.node = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

}

class LinkedList{
    private Node front;
    private Node newNode(int val){
        Node node = new Node();
        node.setData(val);
        node.setNode(null);
        return node;
    }

    public void push(int val) {
        if(front == null) {
            front = newNode(val);
            return;
        }
        Node t = newNode(val);
        t.setNode(front);
        front = t;
    }

    public Node getFront() {
        return front;
    }

//    public void sortList(){
//        Node current = front, index = null;
//
//        int temp;
//
//        if (front == null) {
//            return;
//        }
//        else {
//            while (current != null) {
//                index = current.getNode();
//
//                while (index != null) {
//                    if (current.getData() > index.getData()) {
//                        temp = current.getData();
//                        current.setData(index.getData());
//                        index.setData(temp);
//                    }
//
//                    index = index.getNode();
//                }
//                current = current.getNode();
//            }
//        }
//    }

    public Node reverse(Node node){
        if ((node == null)||(node.getNode()==null) ){
            return node;
        }
        Node next, prev;
        next = prev = null;
        while (node != null){
            next = node.getNode();
            node.setNode(prev);
            prev = node;
            node = next;
        }
        return prev;
    }


    public void display()
    {
        Node current = reverse(front);


        if (front == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.getData()+ " ");
            current = current.getNode();
        }

        System.out.println();
    }

}



public class ArraySorted {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int item;
        LinkedList linkedList = new LinkedList();
        while (n !=0){
            item = Integer.parseInt(bufferedReader.readLine().trim());
            linkedList.push(item);
            --n;
        }

//        linkedList.sortList();
        linkedList.display();

    }
}

