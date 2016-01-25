/*
 * Name: Xavier Cho
 * Class: CSCE A311 - Data Structures & Algorithms
 * Instructor: Dr. Martin Cenek
 * Date: September 17, 2015
 * Homework #: 1
   Compiler: java 1.80_60
   IDE: Netbeans 8.02
 * 
 * 
*/
package final_crawl;

public class LLStack{
 
private LinkList theList; // creates the linked list from Linklist for LLstack

 public class LinkList{
  private Link Head;//makes the starter node
  
   public LinkList(){
    Head = null;// initializes  the linked list
   }
   
 public boolean isEmpty(){
  return (Head == null);// checks to see if the stack is empty 
  }
    
 public String peek(){//see's the first webpages 
  return Head.Webpage;
 }
   
 public void insertHead (String data){//inserts data in the head of the list
  Link newLink = new Link (data); //creates a new link to attach onto the list
  newLink.next = Head;
  Head = newLink;// inserts the data as new head
 }
    
 public String deleteFirst(){// top and pop
  Link temp = Head;// puts the head into a temp
  Head = Head.next;// makes the head as a new head s
  return temp.Webpage;
  }
    
 public String toString(){//converts the data to string
  String str = "";
  Link present = Head;
  while(present != null){
   str += present.toString();// ad the current string to the str                                                                    ///delete later 
   present = present.next;// make the current to  the next node 
   }
    return str;// returns the next node 
  }
}
 
 public LLStack(){
  theList = new LinkList();// creates the new list for the Linked list stack (hence LLstack)
 }

 public boolean isEmpty(){// checks to see of the list is empty
  return theList.isEmpty();
  }
    
 public String peek(){
  return theList.peek();//checks the top of the list
 }

 public void push(String thisPage){
  theList.insertHead(thisPage);// inserts the newdata at the top of the stack 
  }

public void pop(){//pops the data on the top of the stack //topand pop
 if(theList.isEmpty()){
  System.out.println("sorry but the stack is empty");
  }
  else{
   theList.deleteFirst();
   }
}

public String toString(){// converts the list into all strings 
 return theList.toString();
 }
}
    

