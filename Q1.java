package labreport2;
import java.util.Random;

/**
 *
 * @author T_T
 */
public class Q1 {

    public static void main(String[] args) {
    
        Random r = new Random();
        
        int[] num = {r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101), r.nextInt(101)};
        
        System.out.print("Unsorted Int Array : ");
        for (int i : num) {
            System.out.print(i+" ");
        }
        
        System.out.println("Median = " +median(num));
            
    
    }
    
    
    
    
   static double median (int[] n){
       
       int temp;
       int n1,n2;
       double median;
       
       
       //sort array first (bubble sort)
       for (int i = 0; i < n.length-1; i++) {
           for (int j = 0; j < n.length-1; j++) {
               if(n[j]> n[j+1]){
               temp = n[j];
               n[j]= n[j+1];
               n[j+1] = temp;
               }
           }
       }
       //Display sorted array
       System.out.print("\nSorted Int Array: ");
       for (int i : n) {
           System.out.print(i +" ");
       }
       System.out.println("");
       
       //calc median if num. elements = even
        if (n.length%2 == 0){
            
            n1 = n.length/2-1;
            n2 = n.length/2;
            
            System.out.println("index of median : "+n1+", "+n2);
            median = (n[n1]+n[n2])/2.0;
            return median;
            
        //if num. elements = odd
        } else{
            n1 = n.length/2 ;
            System.out.println("index of median : "+n1);
            median = n[n1];
            return median;
        }
   }
    
}

 