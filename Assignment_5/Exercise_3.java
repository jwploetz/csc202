public class Exercise_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyList list=new MyList();
        list.insert_head(3);
        list.display();
        list.insert_head(2);
        list.display();
        list.insert_head(1);
        list.display();
        list.delete_head();
        list.display();

        System.out.println("The first node is: " + list.front());
        System.out.println("The size of the list is: " + list.size());
    }

}

class Node{
    // data fields
    public int data;
    public Node next;
    // methods
    public Node(int data)
    {
        this.data=data;
        next=null;
    }
    public Node(int data, Node nodeRef)
    {
        this.data=data;
        next=nodeRef;
    }
}

class MyList{
    // data fields
    Node head;
    int size;

    MyList()
    {
        head=null;
        size=0;
    }

    // methods
    // a
    public int front()
    {
        return head.data;
    }
    // b
    public int size()
    {
        return size;
    }
    // c
    public void insert_head(int insert_me)
    {
        Node temp = new Node(insert_me);
        temp.next=head;
        head=temp;

        size++;
    }
    // d
    public void delete_head()
    {
        head=head.next;
        size--;
    }
    // e
    public void display()
    {
        Node temp;
        for(temp=head; temp!=null ; temp=temp.next)
            System.out.println("->" + temp.data);
        System.out.println();
    }
}