/*
 * Name: Xavier Cho
 * Class: CSCE A311 - Data Structures & Algorithms
 * Instructor: Dr. Martin Cenek
 * Date: September 17, 2015
 * Homework #: 1
   Compiler: java 1.80_60
   IDE: Netbeans 8.02
*/
package final_crawl;
//jsoup things to grabs the documents and see each element
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawler {
 static int countQ= 0;//counts how many times the goQ is recursed
 static int countQL= 0;//counts how many times the goQL is recursed
 static int countS= 0;//counts how many times the goS is recursed
 static int datsize ;//part of setSize() and helps manipulate the size from what is intended because computers start index is 0 not 1
 static int countsize = 0;//counts how many pages under the title, of each layer for example 
 
 public static  String setStart(String URL,Document doc)throws IOException{
  String title = doc.title();         //get page's title from  HTML DOM 
  return title;
  }

public static void setSize( int size){
 if (size<0){
 System.out.println("not a valid input for size, setting size to 1");
 datsize = 0;
}

 if(size==1){
  datsize = 0;
  }
  else{
   datsize = size-1;
   }     
}

public static void goQ(String URL)throws IOException{ //can modulate to goQ1 but for each anchor... AHHHH?!?!?!?! GAHHHHH!?!?!
 String page;
 countQ++;
 LLQueue theQueue = new LLQueue();
 Document doc = Jsoup.connect(URL).get();//get URL page
 setStart(URL,doc);
 if(!doc.title().equals("")){
 if("Start Page".equals(doc.title())){
  System.out.println(doc.title());
  }
 else
  System.out.println(doc.title());//get all link titles from the web 
  Elements links2follow = doc.select("a[href]");//go through all links and print them out
  for(Element link: links2follow){
   if(link.attr("href").contains("alaska.edu")){	
    page = link.attr("abs:href").substring(46, 53);//iterates and stores the 
    theQueue.enqueue(page);   
    }
   } 
System.out.println(theQueue);// prints out the queue when being called recursivly 
if(countQ ==1){// count 1 is for the top pages to be dequeued until empty 
 do{
  theQueue.dequeue();
  }while(!theQueue.isEmpty()); 
 }      
}
 
Elements links2follow = doc.select("a[href]");  //global for the rest of the for loops
 for(Element link: links2follow){
  if(link.attr("href").contains("page01.html")){// processes the pages only under page 01
   goQ(link.attr("abs:href"));
   theQueue.enqueue(link.attr("abs:href"));
   }
}
 
if(countQ ==2){ // count 2 is for the top pages to be dequeued until empty 
 do{
  theQueue.dequeue();
  }while(!theQueue.isEmpty());
}
        
for(Element link: links2follow){
 if(link.attr("href").contains("page11.html")){// processes the pages only under page 11
  goQ(link.attr("abs:href"));
  theQueue.enqueue(link.attr("abs:href"));
 }
}

if(countQ ==3){// count 3 is for the top pages to be dequeued until empty 
 do{
  theQueue.dequeue();
  }while(!theQueue.isEmpty());
}
        
for(Element link: links2follow){
 if(link.attr("href").contains("page21.html")){// processes the pages only under page 21
  goQ(link.attr("abs:href"));
  theQueue.enqueue(link.attr("abs:href"));
  }
}

if(countQ ==4){// count 4 is for the top pages to be dequeued until empty 
 do{
 theQueue.dequeue();
 }while(!theQueue.isEmpty());
}
         
for(Element link: links2follow){
 if(link.attr("href").contains("page31.html")){// processes the pages only under page 31
 goQ(link.attr("abs:href"));//recurses through the process
 theQueue.enqueue(link.attr("abs:href"));
 }
}
         
 if(countQ ==5){// count 5 is for the top pages to be dequeued until empty 
  do{
  theQueue.dequeue();
  }while(!theQueue.isEmpty());
  if(theQueue.isEmpty() && countQ ==5){
  countQ = 0;
  }
 }
}


public static void goQL(String URL)throws IOException{
 String page;
 countQL++;
 LLQueue theQueue = new LLQueue();
 LLStack theStack = new LLStack();
 Document doc = Jsoup.connect(URL).get();//get URL page
 setStart(URL,doc);
 if(!doc.title().equals("")){
  if ("Start Page".equals(doc.title())){
  System.out.println(doc.title());
  }
  else
  System.out.println(doc.title());
  Elements links2follow = doc.select("a[href]");//get all links from the page 
   for(Element link: links2follow){
    if(link.attr("href").contains("alaska.edu") ){
     page = link.attr("abs:href").substring(46, 53);//cuts the string as just page # (example: page01)
      if (countsize<= datsize){//if the iteration is les than or qual to the index/ fixed size it inserts into the queue
       theQueue.enqueue(page);
       }
       else{
        theStack.push(page);// pushes what we dont want into the stack 
        }
   }
    countsize++;//
   }
   System.out.println(theQueue); 
   
   if(countQL ==1){// dequeues what's  in the queue till empty via counter when equal to 1
    do{
     theQueue.dequeue();
    }while(!theQueue.isEmpty());
    }
    countsize = 0;
    }
 Elements links2follow = doc.select("a[href]");  //global for the rest of the for loops
 for(Element link: links2follow){
  if(link.attr("href").contains("page01.html")){// grabs and processes/inserts whats under page01
   goQL(link.attr("abs:href"));
   theQueue.enqueue(link.attr("abs:href"));
   }
 }
 
 if(countQL == 2){// dequeues what's  in the queue till empty via counter when equal to 2
  do{
   theQueue.dequeue();
   }while(!theQueue.isEmpty());
   countsize = 0;
 }
        
 for(Element link: links2follow){
  if(link.attr("href").contains("page11.html")){// grabs and processes/inserts whats under page11
   goQL(link.attr("abs:href"));//recursive process to crawl only whats under page 11
   theQueue.enqueue(link.attr("abs:href"));//inserts into the queue
   }
  }
        
 if(countQL ==3){// dequeues what's  in the queue till empty via counter when equal to 3
  do{
   theQueue.dequeue();
   }while(!theQueue.isEmpty());
   countsize = 0;
  }
        
 for(Element link: links2follow){// dequeues what's  in the queue till empty via counter when equal to 21
  if(link.attr("href").contains("page21.html")){
   goQL(link.attr("abs:href"));//recursive process to crawl only whats under page 21
   theQueue.enqueue(link.attr("abs:href"));//inserts into the queue
   }
}

 if(countQL ==4){// dequeues what's  in the queue till empty via counter when equal to 4
  do{
    theQueue.dequeue();
    }while(!theQueue.isEmpty());
  countsize = 0;
 }
         
for(Element link: links2follow){// dequeues what's  in the queue till empty via counter when equal to 31
 if(link.attr("href").contains("page31.html")){
  goQL(link.attr("abs:href"));
 }
}
         
if(countQL ==5){// dequeues what's  in the queue till empty via counter when equal to 5
 do{
  theQueue.dequeue();
  }while(!theQueue.isEmpty());
  if(theQueue.isEmpty() && countQL ==5){
  countQL = 0;
  }
   countsize = 0;
  }

}

public static void goS(String URL)throws IOException{
 String page;
 countS++;
 LLStack theStack = new LLStack();
 Document doc = Jsoup.connect(URL).get();//get URL page
 String title = doc.title(); //get page's title from  HTML DOM 
if(!title.equals("")){
 System.out.println(doc.title());
 Elements links2follow = doc.select("a[href]");//get all links from the page 
 for(Element link: links2follow){//grabs the pages and pushes them 
  if(link.attr("href").contains("alaska.edu")){//if it only has alaska.edu
  page = link.attr("abs:href").substring(46, 53);//
  theStack.push(page);//pushes the pages length only to where it says "page" then the number
  }
 }
}
if(countS ==1){// pops what's  in the queue till empty via counter when equal to 1
 do{
  theStack.pop();
 }while(!theStack.isEmpty());
}
System.out.println(theStack);
Elements links2follow = doc.select("a[href]");  //global for the rest of the for loops
for(Element link: links2follow){//pushes whats below page31
 if(link.attr("href").contains("page31.html")){
  goS(link.attr("abs:href"));//recurrsivly calls  to keep crawling 
  theStack.push(link.attr("abs:href"));//pushing the strings into the stack 
  }
}
        
if(countS ==2){// pops what's  in the queue till empty via counter when equal to 2
 do{
  theStack.pop();
  }while(!theStack.isEmpty());
}
        
for(Element link: links2follow){//pushes whats below page21
 if(link.attr("href").contains("page21.html")){
  goS(link.attr("abs:href"));//recurrsivly calls  to keep crawling the things under page21
  theStack.push(link.attr("abs:href"));//pushing the strings into the stack 
  }
}
  
if(countS ==3){// pops what's  in the queue till empty via counter when equal to 3
 do{
  theStack.pop();
 }while(!theStack.isEmpty());
}
        
for(Element link: links2follow){//pushes whats below page11
 if(link.attr("href").contains("page11.html")){
  goS(link.attr("abs:href"));//recurrsivly calls  to keep crawling the things under page11
   theStack.push(link.attr("abs:href"));//pushing the strings into the stack 
   }
}

if(countS ==4){// pops what's  in the queue till empty via counter when equal to 4
 do{
  theStack.pop();
  }while(!theStack.isEmpty());
}
        
for(Element link: links2follow){//pushes whats below page01
 if(link.attr("href").contains("page01.html")){
  goS(link.attr("abs:href"));//recurrsivly calls  to keep crawling the things under page01
   theStack.push(link.attr("abs:href"));//pushing the strings into the stack 
   }
}
         
if(countS ==5){// pops what's  in the queue till empty via counter when equal to 3
do{
 theStack.pop();
 }while(!theStack.isEmpty());

 if(theStack.isEmpty() && countS ==5){
   countS = 0;
   }
  }
 }
}
