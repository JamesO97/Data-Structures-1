
package cop3530_project1;

public class Fibonacci {
    public int fib1(int n) {
		if (n == 1) {
			return 1;
		}
                else if (n == 2) {
			return 1;
		}
                else  {
		        return fib1(n-1) + fib1(n-2);
	}
   } 
    
    
    public int fib2(int n){
       int  num1 = 1, num2 = 1, sum = 0;
    
    for(int i = 3; i <= n; i++){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    
       if(sum != 0){
         return sum;
       } 
       return 1;
    
  }
}