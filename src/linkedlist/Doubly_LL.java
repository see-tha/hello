package linkedlist;



public class Doubly_LL {
	

	class Node{
		int data;
		Node previous;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			
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
			head.previous=null;
			tail.next=null;
		}
	
	else
	{
		tail.next=newNode;
		newNode.previous=tail;
		tail=newNode;
		tail.next=null;
		
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
		System.out.println("nodes of double linked list");
		while(current!=null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Doubly_LL dlist = new Doubly_LL();
		dlist.addNode(1);
		dlist.addNode(7);
		dlist.addNode(5);
		dlist.addNode(3);
		dlist.addNode(2);
		
		dlist.display();
	}
		
	
}
