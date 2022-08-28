package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean found = false;
        int n = 1;
        while (!found)
        {
            if ((n % 387 == 0) && (n % 6381 == 0))
            {
                found = true;
                System.out.println(n);
            }
            n++;
        }
    }
}
