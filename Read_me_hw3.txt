/*
 * Name: Xavier Cho
 * Class: CSCE A311 - Data Structures & Algorithms
 * Instructor: Dr. Martin Cenek
 * Date: September 17, 2015
 * Homework #: 3
   Compiler: java 1.80_60
   IDE: Netbeans 8.02
*/

-In the Driver.java,
right at the moment you can put what size you want in  "Crawler.setSize(1);"
just change the size to any size >1.
*if you put a variable other than an int it will crash
*if you put a number <1 in the set size it will prompt and set the default size to 1 website under the title 

example:
right input :
Crawler.setSize(1);

wrong input:
Crawler.setSize(-2);
Crawler.setSize(bruh);
Crawler.setSize(a);


-you can try one function of the "go" functions at a time 
 run 1 of the type "go" functions and comment out the others




- for Crawler.goQL funciton you also want to uncomment out 
     Crawler.setSize(1);
     for it to work properly

right way to use the Driver.java :
Crawler.setSize(1);// sets the size to 1 page of each title 
  Crawler.goQL("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  FIXED QUEUE
  //Crawler.goQ("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  QUEUE
   //Crawler.goS("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  STACK

OR

//Crawler.setSize(1);// sets the size to 1 page of each title 
 // Crawler.goQL("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  FIXED QUEUE
  Crawler.goQ("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  QUEUE
   //Crawler.goS("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  STACK

wrong way to use the Driver.java :
//Crawler.setSize(1);// sets the size to 1 page of each title 
  Crawler.goQL("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  FIXED QUEUE
  //Crawler.goQ("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  QUEUE
   //Crawler.goS("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  STACK


OR

Crawler.setSize(1);// sets the size to 1 page of each title 
  Crawler.goQL("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  FIXED QUEUE
  Crawler.goQ("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  QUEUE
   Crawler.goS("http://www.cse.uaa.alaska.edu/~mcenek/csce311/");// grabs the website and all the contents & processes it throught the way of the  STACK

       