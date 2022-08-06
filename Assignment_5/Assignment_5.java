public class Assignment_5 {

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
        
        System.out.println("The last node of the list is: " + list.get_back() + "\n");
        list.insert_back(4);
        list.display();
        list.delete_back();
        list.display();

        if(list.search(2))
            System.out.println("Target is found!\n");
        else
            System.out.println("Target NOT found!\n");
    
        list.insert(2, 9);
        list.display();
        list.remove(9);
        list.display();
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
        for(temp=head; temp!=null; temp=temp.next)
            System.out.println("->" + temp.data);
        System.out.println();
    }

    // ********************** NEW CODE **********************

    // f        *method n that returns last item in list*
    public int get_back()
    {
        Node last = head;
        while(last.next!=null)
            last = head.next;
        return last.data;
    }
    // g        *method that inserts insert_me as the last item in the list*
    public void insert_back(int insert_me)
    {
        Node newNode = new Node(insert_me);
        Node temp = head;
        newNode.next = null;
        while(temp.next!=null)
            temp=temp.next;
        temp.next = newNode;
        size++;
    }
    // h        *method that deletes the last item in the list*
    public void delete_back()
    {
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
        size--;
    }
    // i        *method that returns true if target is in the list and false otherwise*
    public boolean search(int target)
    {
        Node temp;
        boolean i = false;
        for(temp=head; temp!=null; temp=temp.next)
            if(temp.data==target)
                i = true;
        return i;
    }
    // j        *method that inserts insert_me behind after_me item in the list (assume no duplicates in the linked list)*
    public void insert(int after_me, int insert_me)
    {
        Node temp = head;
        Node newNode = new Node(insert_me);
        while(temp.data!=after_me)
            temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // k        *method that removes the delete_me item in the list*
    public void remove(int delete_me)
    {
        Node temp = head;
        while (temp.data != delete_me)
            temp = temp.next;
        head.next = temp.next;

    }

    // ********************** END NEW CODE **********************
}