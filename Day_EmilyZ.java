/*
Emily Zastenchik
Assignment 1

 */
package project;
import java.util.Scanner;
public class Day_EmilyZ{
    
    public static void main(String[] args){
        //create new scanner to read int value
        Scanner readMe = new Scanner(System.in);
        String[] Week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
       
       for(int i = 0; i < Week.length; ++i)
           System.out.println(i+1 + "\t" + Week[i] +"\n");

       
        System.out.println("Enter integer from menu to select a day: " + '\n');
        int digit = readMe.nextInt();
        System.out.println("You selected " );
        findWeekDay(digit);
        /*
        System.out.println("Find another day? " + "\n" + 
                "Enter 'y' for yesterday" + "\n" + "'t' for tomorrow" + "\n"
                + "or an integer");
        int daysAway = readMe.nextInt();
        char letter = readMe.next(".").charAt(0);
        */
        
        
     readMe.close();
        
    }
    
    public static void findWeekDay(int num){   
//creates a switch to output name of day from menu int value
        String day = " ";
        switch(num)
        {
            case 1: day = "Sunday";
            break;
            
            case 2: day = "Monday";
            break;
            
            case 3: day = "Tuesday";
            break;
            
            case 4: day = "Wednesday";
            break;
            
            case 5: day = "Thursday";
            break;
            
            case 6: day = "Friday";
            break;
            
            case 7: day = "Saturday";
            break;  
            
        }
        System.out.println(day);
        
    }
}
 /*

    private String currentDay;
    private int numDays;
    
	 default constructor (no arguments)
	
    public Day_EmilyZ(){       
	 currentDay = " "; 
	 numDays = 0;   
    }
	 //constructor with parameters (default set constructor)
    public Day_EmilyZ(String currentDay, int numDays){   
        this.currentDay = currentDay;
        this.numDays = numDays;
    }
   }
   
    public String getDay(){	//returns current day 
        return currentDay;
    }
    public String getDay(int num){	//returns day by add/subtract number of days (int num) to/from currentDay
	   return currentDay + num;									      
    }
    public String getTomorrow(){
        return currentDay + 1;	
    }
    */

    