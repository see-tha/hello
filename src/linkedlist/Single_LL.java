package linkedlist;

public class Single_LL {
	class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next=null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head =newNode;
			tail=newNode;
		}
	
	else
	{
		tail.next=newNode;
		tail=newNode;
		
	}
}
	public void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("lis is empty");
			return;
		}
		System.out.println("nodes of single linked list");
		while(current!=null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Single_LL slist = new Single_LL();
		slist.addNode(1);
		slist.addNode(7);
		slist.addNode(5);
		slist.addNode(3);
		slist.addNode(2);
		
		slist.display();
	}
		
		
	}
	