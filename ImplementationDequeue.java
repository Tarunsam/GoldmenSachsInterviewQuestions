package com.gs.ownpractice;

import java.util.Arrays;

public class ImplementationDequeue {

	 public static class MyDeque
	  {
	    int front;
	    int rear;
	    String[] dequeue;
	    
	    public MyDeque(int limit)
	    {
	      front=-1;
	      rear=-1;
	      dequeue=new String[limit];
	    }
	    
	    public void enqueueatfront(String x) {
	    	
	    	if((front==0 && rear==dequeue.length-1)|| front==rear+1) {
	    		System.out.println("Queue is full");
	    	}
	    	else if (front==-1 && rear==-1)
	    	{
	    		front=rear=0;
	    		dequeue[front]=x;
	    	}
	    	else if(front==0) {
	    		front=dequeue.length-1;
	    		dequeue[front]=x;
	    	}
	    	else {
	    		front--;
	    		dequeue[front]=x;
	    	}
	    }
	    
	    public void enqueueatrear(String x) {
	    	
	    	if((front==0 && rear==dequeue.length-1)|| front==rear+1) {
	    		System.out.println("Queue is full");
	    	}
	    	else if (front==-1 && rear==-1)
	    	{
	    		front=rear=0;
	    		dequeue[rear]=x;
	    	}
	    	else if(rear==dequeue.length-1) {
	    		rear=0;
	    		dequeue[rear]=x;
	    	}
	    	else {
	    		rear++;
	    		dequeue[rear]=x;
	    	}
	    }
	    
	    public void dequeueatfront() {
	    	
	    	if((front==-1 && rear==-1)) {
	    		System.out.println("Queue is empty");
	    	}
	    	else if (front==rear)
	    	{
	    		System.out.println("DequeueFrom Front:"+dequeue[front]);
	    		front=rear=-1;
	    	}
	    	else if(front==dequeue.length-1) {
	    		System.out.println("DequeueFrom Front:"+dequeue[front]);
	    		front=0;
	    		
	    	}
	    	else {
	    		System.out.println("DequeueFrom Front:"+dequeue[front]);
	    		front++;
	    		
	    	}
	    }

	    public void dequeueatrear() {
	    	
	    	if((front==-1 && rear==-1)) {
	    		System.out.println("Queue is empty");
	    	}
	    	else if (front==rear)
	    	{
	    		System.out.println("DequeueFrom rear:"+dequeue[rear]);
	    		front=rear=-1;
	    	}
	    	else if(rear==0) {
	    		System.out.println("DequeueFrom rear:"+dequeue[rear]);
	    		rear=dequeue.length-1;
	    		
	    	}
	    	else {
	    		System.out.println("DequeueFrom rear:"+dequeue[rear]);
	    		rear--;
	    	}
	    }
	    
	    public void display() {
	    	int i=front;
	    	if(front==-1 && rear==-1)
	    		System.out.println("Queue is empty");
	    	else
	    	{
	    		while(i!=rear) {
	    			System.out.println(dequeue[i]);
	    			i=(i+1)%dequeue.length;
	    		}
	    	System.out.println(dequeue[i]);
	    	}
	    }
	  }
	    public static void main(String[] args)
	    {
	      MyDeque deque=new MyDeque(5);
	      deque.enqueueatfront("Hell");
	      deque.enqueueatfront("Is");
	      deque.enqueueatfront("Late");
	      
	      deque.enqueueatrear("The");
	      deque.enqueueatrear("Heaven");
	      
	      deque.dequeueatfront();
	      
	      
	      System.out.println(Arrays.toString(deque.dequeue));
	      
	      deque.display();
	    }
}
