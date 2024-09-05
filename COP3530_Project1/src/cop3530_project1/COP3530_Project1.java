package cop3530_project1;
import cop3530_project1.Timer;
import cop3530_project1.Fibonacci;

public class COP3530_Project1 {

   
    public static void main(String[] args) {
        Timer timer = new Timer();
        Fibonacci fib = new Fibonacci();
        
        
        System.out.println("Recursive fibonacci");
       for(int i = 1; i <= 55; i++) {
                
                timer.start();
                System.out.print(i + " " + fib.fib1(i) + " ");
                timer.end();
                System.out.println(timer.millSeconds() + " seconds");
	     }
       
//        System.out.println("\n");
//        System.out.println("For loop fibonacci");
//       for(int i = 1; i <= 55; i++){
//                timer.start();
//                System.out.print(i + " " + fib.fib2(i) + " ");
//                timer.end();
//                System.out.println(timer.nanoSeconds() + " seconds");
//	     }
       }
}
 