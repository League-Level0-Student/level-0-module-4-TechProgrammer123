package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday = false, isVacation = false;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
       int Ans = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
int Ans2 = JOptionPane.showConfirmDialog(null, "Is it a Vacation", "Sleepy Head", JOptionPane.YES_NO_OPTION);
       if(Ans == 1) {
    	   isWeekday=false;
       //System.out.println("sleep in");
       }
       else  if(Ans == 0) {
    	   isWeekday=true;
    	  // System.out.println(Get up lazybones!);
    	   
       }
       if(Ans2 == 1) {
    	   isVacation=false;
    	  
    	   //System.out.println();
       }
       else if(Ans2 == 0) {
	  isVacation=true;
    	  
    	  // System.out.println("sleep in");
       }
  if(isVacation == true || isWeekday == false) {
	  System.out.println("sleep in?");
	  
  }
  else if (isWeekday == true) {
	System.out.println("get up lazybones!");
	
}
  else if (isWeekday == true && isVacation == true) {
	System.out.println("sleep in?");
}
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
