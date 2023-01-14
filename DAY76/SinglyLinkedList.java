import java.util.Scanner;
class SinglyLinkedList {
    //Create a node
    Node head;
    class Node{
        int data;
        Node next;
       public Node(int data){ 
            this.data=data;
            this.next=null;
        }
         public Node() {       
            this.next = null;    
        }    
    }

    // Insertion at beginning

    public void addBeg(int data){
        Node ptr= new Node(data);
        if(head==null){
            head= ptr;
            return; 
        }
        ptr.next = head;
        head=ptr;
    }

    // Insertion at end

    public void addEnd(int data){
        Node ptr= new Node(data);
        if(head==null){
 head= ptr;
            return;
        }
        Node temp=head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next=ptr;
    }

    
    
        // Delete from first pos

        public void delFirst(){
            if(head==null){
                System.out.println("Can't Delete");
                return;
            }
            head=head.next;
        }

        // Delete from last pos

        public void delLast(){
            if(head==null){
                System.out.println("Can't Delete");
                return;
            }
            else if(head.next==null){
                head=null;
                return;
            }

            Node ptr=head.next;
        Node ptr2=head;
        while(ptr.next!=null){
            ptr=ptr.next;
            ptr2=ptr2.next;
  }
        ptr2.next=null; 
        
        }    
            public void display(){
            if(head==null){
                System.out.println("Empty List ");
                return;
            }
            Node ptr=head;
            while(ptr != null){
                System.out.print(ptr.data+ "-->");
                ptr=ptr.next;    
            }
            System.out.print("NULL"); 
        }


        public static void main(String[] args) {    
            
            SinglyLinkedList s = new SinglyLinkedList();    
            Scanner sc=new Scanner(System.in);
    
            int flag=0;
            while(flag==0){
                System.out.println("1.Insertion at begining");
                System.out.println("2.Insertion at end");
                System.out.println("4.Deletion from begining");
                System.out.println("5.Deletion from end");
            // System.out.println("7.Search");
                System.out.println("7.Display");
                System.out.println("8.Exit");
                int ch=sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter the element to be inserted-");
                        s.addBeg(sc.nextInt());
 break;
    
                    case 2:
                        System.out.println("Enter the element to be inserted-");
                        s.addEnd(sc.nextInt());
                        break;
    
                    case 4:
                        s.delFirst();
                        break;
                    case 5:
                        s.delLast();
                        break;
                    case 6:
                        System.out.println("Enter postion from where element is to be deleted-");
                   // case 7:
                       // System.out.println("Enter the element to be searched-");
                       // s.search(sc.nextInt());
                       // break;
                    case 7:
                    System.out.println("Elements in list");
                        s.display();
                        break;
                    case 8:
                        flag=1;
                        break;
                    default:System.out.println("Wrong Input!!");
                        break;
                }
            }
        }
}
