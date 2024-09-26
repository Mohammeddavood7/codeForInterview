
public class PrimeNumbers 
{
    public static void findPrimes(int n)
    {
        System.out.print("Prime numbers up to " + n + ": ");
        
        for (int i = 2; i <= n; i++)
        {
            boolean isPrime = true;
            
            for (int j = 2; j < i ; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime)
            {
                System.out.print(i + " ");
            }
            
        }
        System.out.println();
        
    }

    
    public static void main(String[] args)
    {
        int n = 20;
        findPrimes(n);
    }
}
