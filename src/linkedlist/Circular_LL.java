package linkedlist;

public class Circular_LL {

	
		

		class Node{
			int data;
			
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
				newNode.next=head;
			}
		
		else
		{
			tail.next=newNode;
			
			tail=newNode;
			tail.next=head;
			
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
			else
			{
			System.out.println("nodes of circular linked list");
			do
			{
				System.out.println(" "+current.data);
				current=current.next;
			}
			while(current!=head);
			
				
			
			System.out.println();
		}}
		public static void main(String args[])
		{
			Circular_LL cclist = new Circular_LL();
			cclist.addNode(1);
			cclist.addNode(7);
			cclist.addNode(5);
			cclist.addNode(3);
			cclist.addNode(2);
			
			cclist.display();
		}
			
		
	}



