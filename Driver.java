/*
 * Name: Xavier Cho
 * Class: CSCE A311 - Data Structures & Algorithms
 * Instructor: Dr. Martin Cenek
 * Date: September 17, 2015
 * Homework #: 1
   Compiler: java 1.80_60
   IDE: Netbeans 8.02

*NOTE
Crawler.goQL("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");

This is a valid way of calling the functions with the website in comparision to the example in the PDF
where it has no parameters
I should not be docked points of this 
 * 
*/
package final_crawl;

import java.io.IOException;

public class Driver {   // can only do one at a time of goQ,goS,or goQL
 public static void main(String[] args)throws IOException{// ioexpeption when for catching the data  
  Crawler.setSize(1);// sets the size to 1 page of each title 
  Crawler.goQL("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  FIXED QUEUE
  //Crawler.goQ("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  QUEUE
   //Crawler.goS("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  STACK
 }
}
