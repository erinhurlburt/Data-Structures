/*
*  File name: CircularStack.java
*  Purpose  : Demonstrates a stack
*  Author  : Erin Hurlburt and Connor Savage
*  Date    : 2021-10-13
*/

class CircularStack {

    static class Node {
        int data;
        Node next;
        Node() {}
        Node(int data) {
          this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int  size;
    

    public CircularStack() {
    	this.head = null;
        this.tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public void push( int itemToPush ) {
    	Node currentHead = head;
        head = new Node( itemToPush );
        head.next = currentHead;
        size++;


        
    }

    public int peek() {
        if (!isEmpty()) {
        	return head.data;
        } else {
        	System.out.println("Stack is empty");
        	return 0;
        }
    }



    public void pop() {
    	head = head.next;
    }

    


    public void display() {
        Node temp = head;
        if (head == null) {
        	System.out.println("Stack is empty");
        	return;
        }
        while(temp != null) {
        	System.out.printf(temp.data + " ");
        	temp = temp.next;
        }

        System.out.printf("\n");
        
    }
     

    public static void main( String[] args ) {
        CircularStack testStack = new CircularStack();
        testStack.push( 19 );
        testStack.push( 23 );
        testStack.push( 29 );
        testStack.push( 55 );

        testStack.pop();

        testStack.push( 68 );
        testStack.push( 70 );


        testStack.display();

        testStack.pop();
        testStack.display();


        System.out.println( "The top of the stack: " + testStack.peek() );

        testStack.push(88);
        testStack.display();

        System.out.println( "The top of the stack: " + testStack.peek() );  
        
    }


}


