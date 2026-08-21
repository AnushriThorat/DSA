import java.util.Scanner;

public class SinglyLinkedList {
    Node root;

    public void insertLeft(int data){

        Node n=new Node(data); //create new node
        if(root==null){
            root=n;
        }
        else{
            n.next=root;
            root=n;
        }
    }

    public void insertRight(int data){
        Node n=new Node(data);

        if(root==null){
            root=n;
        }
        else{
            Node t=root;
            while(t.next!=null){
                t=t.next;
            }
            t.next=n;
        }
    }


    public void leftDelete(){
        if(root==null){
            System.out.println("List is Empty");
        }
        else{
            Node t=root;
            root=root.next;
            System.out.println("Deleted left element:"+t.data);
        }
    }

    public void rightDelete(){
        if(root==null){
            System.out.println("List is Empty");
        }
        else{
            Node t1,t2;
            t2=t1=root;


            while(t1.next!=null){
                t2=t1;
                t1=t1.next;
            }
            t2.next=null;
            System.out.println("Deleted left element:"+t1.data);
        }
    }

    public void print(){
        if(root==null){
            System.out.println("empty list");
        }
        else{
            Node t=root;
            while(t!=null){
                System.out.print("|"+t.data+"|");
                t=t.next;
            }
            System.out.print("NULL");
        }
    }

    void search(int key){
        if(root==null){
            System.out.println("List is empty");
        }
        else{
            Node t=root;
            while(t!=null){
                if(t.data==key){
                    System.out.println(key+"Element found");
                }
                t=t.next;
            }
            System.out.println(key+"Not found");
        }
    }

    void insertAfter(int data,int key){
        Node n=new Node(data);
        if(root==null){
            root=n;
        }
        else{
            Node t=root;
            while(t!=null){
                if(t.data==key){
                    n.next=t.next;
                    t.next=n;
                    return;
                }
                t=t.next;
            }
        }
    }

    void delete(int data){
        if(root==null){
            System.out.println("List is empty");
        }
        else{
            Node t1,t2;
            t1=t2=root;
            while(t1!=null){
                if(t1.data==data){
                    if(t1==root){
                        root=root.next;
                    }
                    else if(t1.next==null){
                        t2.next=null;
                    }
                    else {
                        t2.next = t1.next;
                    }
                }
                t2=t1;
                t1=t1.next;
            }
        }
    }

    public void revprintList(){
        if(root==null){
            System.out.println("List is empty");
        }
        else{
            Node prev=null;
            Node curr=root;

            while(curr!=null){
                Node next=curr.next;
                curr.next=prev;

                prev=curr;
                curr=next;
            }
       root=prev;
        }
    }

    void length(){
        int count=0;
        if(root==null){
            System.out.println("Null");
        }
        else{
            Node t=root;
            while(t!=null){
                count++;
                t=t.next;
            }
            System.out.println("Length of linkedList is:"+count);
        }
    }

    public void findMiddle(){
        if(root==null){
            System.out.println("Null");
        }
        else{
            Node slow=root;
            Node fast=root;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            System.out.println("The middle element is:"+slow.data);
        }
    }

    public void removeLastN(int n){
        Node slow=root;
        Node fast=root;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    }

    void cycleDetect(){
        Node fast=root;
        Node slow=root;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                System.out.println("Cycle detect");
                return;
            }
        }
            System.out.println("No cycle");
    }

    //sorted list required
    void removeDuplicates(){
        Node first=root;

        while(first!=null && first.next!=null){
            if(first.data==first.next.data){
                first.next=first.next.next;
            }
            else{
                first=first.next;
            }
        }
    }

    void checkPallindrome(){
        Node fast=root;
        Node slow=root;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        Node prev=null;
        Node curr=slow;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node first=root;
        Node second=prev;

        while(second!=null){
            if(first.data!=second.data){
                System.out.println("Not pallindrome");
                return;

            }
                second=second.next;
                first=first.next;
        }
        System.out.println("LinkedList is Pallindrome");
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        SinglyLinkedList obj=new SinglyLinkedList();

        int choice=0,data,key;

        do{

            System.out.println("-----LinkedList Menu-------");
            System.out.println("1.Insert left");
            System.out.println("2.Insert right");
            System.out.println("3.Delete left");
            System.out.println("4.Delete right");
            System.out.println("5.Search Element");
            System.out.println("6.Insert element in after ");
            System.out.println("7.Delete after");
            System.out.println("8.Print Reverse LinkedList");
            System.out.println("10.find length");
            System.out.println("9.PrintList");
            System.out.println("10.find length");
            System.out.println("11. Find middle");
            System.out.println("12.remove Nth element");
            System.out.println("13.Cycle detect");
            System.out.println("14.Check Pallindrome");
            System.out.println("15.Remove duplicates");

            System.out.println("Enter your choice");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println(("enter a Left number:"));
                    data=sc.nextInt();
                    obj.insertLeft(data);
                    break;
                case 2:
                    System.out.println(("enter a right number:"));
                    data=sc.nextInt();
                    obj.insertRight(data);
                    break;

                case 3:
                    obj.leftDelete();
                    break;

                case 4:
                    obj.rightDelete();
                    break;

                case 5:
                    System.out.println("enter element you want to search");
                    data=sc.nextInt();
                    obj.search(data);
                    break;

                case 6:
                    System.out.println("Enter element you want to inser:");
                    data= sc.nextInt();
                    System.out.println("Enter reference element:");
                    key= sc.nextInt();
                    obj.insertAfter(data,key);
                    break;

                case 7:
                    System.out.println("Enter element you want to delete:");
                    data= sc.nextInt();
                    obj.delete(data);
                    break;

                case 8:
                    obj.revprintList();
                    obj.print();
                    break;

                case 9:
                    obj.print();
                    break;

                case 10:
                    obj.length();
                    break;

                case 11:
                    obj.findMiddle();
                    break;

                case 12:
                    System.out.println("Enter element index from last you want to remove");
                    int n= sc.nextInt();
                    obj.removeLastN(n);
                    obj.print();
                    break;

                case 13:
                    obj.cycleDetect();
                    break;

                case 14:
                    obj.checkPallindrome();
                    break;

                case 15:
                    obj.removeDuplicates();
                    obj.print();
                    break;


                case 0:
                    System.out.print("\nExiting... Career Credentials Mode OFF 🚀");
                    break;

                default:
                    System.out.print("\nInvalid choice. Try again.");


            }

        }while(choice!=0);
    }
}
