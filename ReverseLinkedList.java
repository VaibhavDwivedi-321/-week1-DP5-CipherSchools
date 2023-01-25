public class ReverseLinkedList {
    public static Node reverselinkedListUsingRecursion(Node head){
        if(head==null || head.next == null){
            return head;
        }
        Node rest = reverselinkedListUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
    public static Node reverseLinkedList(Node head){
        Node rest=null;
        Node presentNode = head;
        Node pastNode = null;
        while(presentNode!=null){
            rest=presentNode.next;
            presentNode.next=pastNode;
            pastNode=presentNode;
            presentNode=rest;
        }
        head=pastNode;
        return head;
    }
    
    
    
    
    public static void main(String[] args) {
    Node head =NodeUse.createrandomLinkedList(6);
    NodeUse.printLinkedList(head);
    System.out.println();
    System.out.println();
    Node newHead = reverseLinkedList(head);
    NodeUse.printLinkedList(newHead);
   
    }
}
