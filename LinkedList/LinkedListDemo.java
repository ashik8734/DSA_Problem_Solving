class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedListDemo {
    
    // Array To Linked List: 
    private static Node converting(int[] arr) {

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    
    // Length of the LinkedList
    private static int lengthLinkedlist(Node head ){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

   // Checking element present or Not: 
    private static boolean dataCheck(Node head, int value){
        Node temp=head;
        while(temp!=null){
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    // Deleting Head Node:

    private static Node deleteHead(Node head){
        //edge Case:
        if(head==null) return head;

        head=head.next;
        return head;
    }

    // Deleting Tail of LinkedList:

    private static Node deleteTail(Node head){
        if(head==null||head.next==null){
            return null;
        }

        Node temp=head;

        while(temp.next.next!=null){
            temp=temp.next;
        }

        temp.next=null;

        return head;
    }

    // Deleting Kth  Element in LinkedList:
    
    private static Node deleteK(Node head,int k){
    
        // If there is Empty LinkedList:
        if(head==null){
            return head;
        }

        // If k=1 , i.e head :
        if(k==1){
            head=head.next;
            return head;
        }
        
        //Deleting kth Node
        int count=0; 
        Node temp=head;
        Node priv=null;

        while(temp!=null){
            count++;
            if(count==k){
                priv.next=priv.next.next;
            }
            priv=temp;
            temp=temp.next;
        }
        return head;
    }

    // delete base on value:       
    private static Node deleteElem(Node head,int element){
    
        // If there is Empty LinkedList:
        if(head==null){
            return head;
        }

        // If element is in 1st position , i.e head :
        if(head.data==element){
            head=head.next;
            return head;
        }
        
        
        Node temp=head;
        Node priv=null;

        while(temp!=null){
            if(temp.data==element){
                priv.next=priv.next.next;
            }
            priv=temp;
            temp=temp.next;
        }
        return head;
    }

    // Inserting new head
    private static Node insertFirst(Node head,int val){
      Node temp=new Node(val, head);
      return temp;
    }

    //inserting New Node at the last:

    private static Node insertLast(Node head,int val){
        Node newNode=new Node(val,null); // new Node

        if(head==null){
            return newNode;
        }
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

        return head;
    }

    //insering New node at Kth position:

    private static Node insertK(Node head,int element,int position){
        // if LinkeList is Empty:
        if(head==null){
            if(position==1){
             return new Node(element);
            }else{
                return null;
            }
        }

        //Inserting at 1st position , i.e. head
        if(position==1){
          Node temp=new Node(element, head);
          return temp;
        }

        //Inserting at K position:
        Node temp=head;
        int count=0;
        while(temp!=null){
          count++;
          if(count==position-1){
           Node newNode=new Node(element);
           newNode.next=temp.next;
           temp.next=newNode;
           return head;
          }
          temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12,23,25,32};
        Node head = converting(arr);
       
        Node temp=head;
        
        //length:
        int length=lengthLinkedlist(head);
        System.out.println(length);

         // Checking element present or Not:
        int value=12;
        boolean present=dataCheck(head, value);
        System.out.println(present);

        // Traversing Through LinkedList:
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }

        //Deleting Head Node:
        // Node newHead =deleteHead(head);
        // Deleting Tail of LinkedList:
        // Node newTail=deleteTail(head);


        // Deleting Kth  Element in LinkedList:

        // Node kDelHead=deleteK(head, 5);
        // while(kDelHead!=null){
        //     System.out.print(kDelHead.data+" ");
        //     kDelHead=kDelHead.next;
        // }
        
        // delete base on value: 
        // Node DelEleHead=deleteElem(head, 25);
        // while(DelEleHead!=null){
        //     System.out.print(DelEleHead.data+" ");
        //     DelEleHead=DelEleHead.next;
        // }
    
       //Inserting new head
    //    Node newHead=insertFirst(head, 51);
    //    while(newHead!=null){
    //     System.out.print(newHead.data+" ");
    //     newHead=newHead.next;
    // }

    // Inserting new tail:
    Node newTail=insertLast(head, 47);
        while(newTail!=null){
        System.out.print(newTail.data+" ");
        newTail=newTail.next;
    }

   }
}
