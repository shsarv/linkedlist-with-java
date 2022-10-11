/**
 * Singly Linked list implementation in Java
 * 
 *  Copy the 3 classes in Node.java, LinkedList.java and Main.java in order to run the implementation
 * 
 *  Sarvesh Kumar Sharma
 * 
 *   ____________	    _____________       ______________
 *  |item "test1"|	   | item "test2"|      | item "test3" |
 *  |      next  |-------->|        next |----->|        next  |------>null	
 *  |____________|	   |_____________|	|______________| 	
 * 
 * */
 
 /**
  * Node.java
  class
  * 
  * */
  

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class linklist {
    public static node head;
     public static node tail;
    public static int size=0;
    
    public static class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void size()
    {
        System.out.println("    "+ size+"    ");
    }
    public static void add(int data){
        node temp = new node(data);
        if(size==0)
        {
          head=tail= temp;
          size=1;
          return;
        }
    
        tail.next=temp;
        tail=temp;
        size++;
    }
     public static void addfirst(int data){
        node temp = new node(data);
        if(size==0)
        {
          head=tail= temp;
          size=1;
          return;
        }
        temp.next=head;
        head=temp;
        size++;
    }
    public static void addlast(int data){
        node temp = new node(data);
        if(size==0)
        {
          head=tail= temp;
          size=1;
          return;
        }
        tail.next=temp;
        tail=temp;
        size++;
    }
     public static void addati(int idx,int data){
        
        if(idx==0)
        {
          addfirst(data);
        }
        else if(idx==size-1)
        {
          addlast(data);
        }
        else{
                  node temp = new node(data);
                  int k=idx-1;
                  node temp2=head;
                  while(k!=0){
                        temp2=temp2.next;
                        k--;
                  }
                  temp.next=temp2.next;
                  temp2.next=temp;
                  size++;
        }
       
    }
    public static void print(){
        node temp = head;
        if(size==0)
        {
          System.out.println("list is empty");
          return ;
        }
        while(temp != null){
           System.out.print(temp.data + "-->");
           temp=temp.next;

        }
         System.out.println("null");
    }
     public static int delete(){
         node temp=head;
         if(size==0){
             System.out.println("list is empty");
             return -1;
         }
         for(int i=0;i<size-2;i++)
         {
             temp=temp.next;
         }
         int data2 = temp.next.data;
         temp.next=null;
         tail=temp;
         size--;
         return data2;
         
     }
     public static int deletefirst(){
         if(size==0){
             System.out.println("list is empty");
             return -1;
         }
         int data2 = head.data;
         head=head.next;
          size--;
         return data2;
     }
     public static int deletelast(){
           node temp=head;
         if(size==0){
             System.out.println("list is empty");
             return -1;
         }
         for(int i=0;i<size-2;i++)
         {
             temp=temp.next;
         }
         int data2 = temp.next.data;
                  temp.next=null;
         tail=temp;
         size--;
         return data2;
     }
      public static int deleteati(int idx){
           node temp=head;
         if(idx>size){
             System.out.println("error!!!!!");
             return -1;
         }
         for(int i=0;i<idx-1;i++)
         {
             temp=temp.next;
         }
         int data2 = temp.next.data;
         temp.next=temp.next.next;
         size--;
         return data2;
     }
    
    public static void main(String[] args) {
        linklist l=new linklist();
        l.print();l.size();
        l.add(1); 
        l.print(); l.size();
        l.add(2);
        l.print();l.size();
        l.add(3);
        l.print();l.size();
        l.add(4);
        l.print();l.size();
        l.add(5);
        l.print();l.size();
        l.addfirst(0);
        l.print();l.size();
        l.addlast(6);
        l.print();l.size();
        l.addati(2,6);
        l.print();l.size();
        l.delete();
        l.print();l.size();
        l.deletefirst();
        l.print(); l.size();
        l.deletelast();
        l.print();l.size();
        l.deleteati(2);
        l.print();l.size();
    }
}

/**
 *  OUTPUT
 * 
 *  	Current Size of the list is: 0
	Node test1 is at location 0
	Node test2 is at location 1
	Node test3 is at location 2
	Node test4 is at location 3
	Node test5 is at location 4
	Node test6 is at location 5
	Node test7 is at location 6
	
	Finding item test2 in the Linked list
	Item test2 was found at location 1 in the linked list
	Finding item nonExist in the Lineked list
	Item nonExist was not found in the Linked list
	
	Finding item at location 4
	Node item at location 4 is test5
	
	Finding item at last location 
	Node item at last location is test7
	
	Current Size of the list is: 7
	Adding test1st at start of the Node
	Node test1st is at location 0
	Node test1 is at location 1
	Node test2 is at location 2
	Node test3 is at location 3
	Node test4 is at location 4
	Node test5 is at location 5
	Node test6 is at location 6
	Node test7 is at location 7
	
	Current Size of the list is: 8
	Adding testNth at 2nd Location
	Node test1st is at location 0
	Node test1 is at location 1
	Node testNth is at location 2
	Node test2 is at location 3
	Node test3 is at location 4
	Node test4 is at location 5
	Node test5 is at location 6
	Node test6 is at location 7
	Node test7 is at location 8
	
	Current Size of the list is: 9
	Deleting first node
	Node test1 is at location 0
	Node testNth is at location 1
	Node test2 is at location 2
	Node test3 is at location 3
	Node test4 is at location 4
	Node test5 is at location 5
	Node test6 is at location 6
	Node test7 is at location 7
	
	Current Size of the list is: 8
	Deleting last node
	Node test1 is at location 0
	Node testNth is at location 1
	Node test2 is at location 2
	Node test3 is at location 3
	Node test4 is at location 4
	Node test5 is at location 5
	Node test6 is at location 6
	
	Current Size of the list is: 7
	Deleting node from 4th location
	Node test1 is at location 0
	Node testNth is at location 1
	Node test2 is at location 2
	Node test3 is at location 3
	Node test5 is at location 4
	Node test6 is at location 5

 * 
 **/
 
