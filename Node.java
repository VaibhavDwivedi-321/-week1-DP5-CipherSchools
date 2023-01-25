public class Node {
    int data;
    Node next;
    public Node random;
    Node(int data){
        this.data = data;
        next = null;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
}
