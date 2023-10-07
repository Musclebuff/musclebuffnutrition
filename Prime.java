package musclebuffnutrition;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int i = 2;
        for(;i<n;i++)
        {
            if(n%i==0)
            {
                break;
            }
        }
        if(i==n)
        {
            System.out.println(n+" is a prime number.");
        }
        else
        {
            System.out.println(n+" is not a prime number.");
        }
    }
}
