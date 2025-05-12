//recursion

public class recur {
    public static void main(String[] args)
    {

          int i = 4;
          System.out.println(factorial(i));

    }

     static int factorial(int n)
     {
        // fact 0 = 1
        if(n ==0 || n==1)
        {
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
     }
}