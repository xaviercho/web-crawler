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

public class Link { // creates the links for the linked list
 public String Webpage;//
 public Link next;// creates the next link
 public Link(String dataIN){//
  Webpage = dataIN;
 } 
 public String toString(){
  return "[" + Webpage + "]" + "\n"; // changes the url into a string 
 } 
}
