
package problemsolving;

import java.util.Random;
import java.util.Scanner;

public class ProblemSolving {

   
    public static void main(String[] args) {
        
        //---Q1---//
       Scanner input = new Scanner(System.in);
       
        
        /*System.out.println("Enter coordinate X and Y: ");
        int x= input.nextInt();
        int y= input.nextInt();
        
        input.nextLine();
        
        System.out.println("Enter move: ");
        String move = input.nextLine();
        
        System.out.printf("Initial Coordinate (%d,%d) ",x,y);
        
        for (int i=0;i<move.length();i++) {
            char letter = move.charAt(i);
            switch(letter){
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;      
            }
            
        }
        
        System.out.printf("Final Coordinate (%d,%d)",x,y);*/
       
       //--Q2--//
       
       /*String ans;
       int total = 0;
     
       do{
           
           System.out.println("Enter the type of dutian [QUIT] to terminate: ");
           ans = input.nextLine();
           if(ans.equalsIgnoreCase("Quit"))
               break;
           
           System.out.println("Enter sales in kg: ");
           float sales = input.nextFloat();
           input.nextLine();
           
           if(ans.equals("MK")){
               total += sales*25;
           }
           else if (ans.equals("HL")){
               total += sales*22;
           
           }
           else if (ans.equals("D24")){
               total += sales*20;
           
           }
           else if (ans.equals("UM")){
               total += sales*18;
           }
             
           
       } while(!ans.equalsIgnoreCase("QUIT"));
       
        System.out.println("Total Sales: "+ total);*/
       
       //---Q3---//
       
        /*Random r = new Random();
       
        System.out.println("Enter the number of staff [N] : ");
        int staff = input.nextInt();
        int count;
        
        for (int i=0; i<staff; i++){
            int SID = r.nextInt(99999-10000+1)-10000;
            if ( (SID%10000/1000)%2==1 && (SID%100/10)%2==0 ) {
                System.out.println("Weekend Duty");
                count++;
            }
            else {
                System.out.println("Weekend Off");
            }
            
            
        }
         System.out.println("The number of staffs work during weekend is " + count);*/
        
        //---Q2--//
        
        int num,factor;
        int correct = 0;
        int count = 0;
        
        do{
            
            System.out.println("Enter a number(-1 to quit) : ");
            num = input.nextInt();
            
            if (num==-1)
                break;
            
            System.out.println("Enter a factor: ");
            factor = input.nextInt();
            
            System.out.println(factor + " is a factor of " + num +"?");
            boolean ans = input.nextBoolean();
            
            if ((num%factor ==0)==ans) {
                System.out.println("Your answer is correct");
                correct++;
            }
            else {
                System.out.println("Your answer is incorrect");
            }
            count++;
            
 
        }while(!(num==-1));
        
        System.out.println("The final score is "+correct+"/"+count);
         
         
        
       
    
    }
}       
      
                   
            
                           
                           
                   
                   
                   
                   
      
                   
        
  