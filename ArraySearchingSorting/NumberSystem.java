package ArraySearchingSorting;

import java.util.Scanner;
import java.util.Stack;

/*
 * Problem 1: given a number, print its binary representation. [easy]
        Input 1: number = 5
        Output 1: 101
        Input 2: number = 10
        Output 2: 1010
 */

public class NumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        //close the connection
        sc.close();
        int tempNum = num;

        int binary=0;
        Stack<Integer> s = new Stack<>();

        while(tempNum !=0)
        {
            s.add(tempNum%2);
            tempNum/=2;
        }
        while(! s.isEmpty())
            binary = binary*10+ s.pop();

        System.out.println(binary);
        NumberSol ns = new NumberSol();
        System.out.println("is power of two : "+(ns.isPower(33)));
        System.out.println("is even : "+ns.isEven(32));

        System.out.println("Find odd occurance in an array :  "+ ns.findDuplicate(new int[]{2,2,3,4,5,5,4}));


    }
}

/*
 * Problem 2: given a number ‘n’, predict whether it is a power of two or not. [medium]
    Input 1: n = 15
    Output 1: False
    Input 2: n = 32
    Output 2: True
 */

class NumberSol{
    public boolean isPower(int num)
    {
        if(num == 0)
        {
            return false;
        }
        while(num!=1)
        {
            if(num%2 == 1) return false;
            num/=2;
        }
        return true;
    }
    /*
     * Q3. Problem 1: Given a number. Using bit manipulation, check whether it is odd or even.
        Input 8, Even
        3, False
     */
    public boolean isEven(int num){
        String binary = Integer.toBinaryString(num);
        
        if(binary.charAt(binary.length()-1) == '0')
        {
            return true;
        }
        return false;
    }
    /*
     * Q4. Given a number, count the number of set bits in that number without using an extra space.
        Note : bit ‘1’ is also known as set bit.
            */
    public int countSetBit(int num)
    {
        int temp = num;
        int count=0;
        while(temp!=0)
        {
            if(temp%2 == 1)
            {
                count++;
            }
            temp/=2;

        }
        return count;
    }
  /*   Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even
        number of times except one which appears an odd number of times. Find that odd appearing
        element in linear time and without using any extra memory.
        For example,
        Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
        Output : The odd occurring element is 4. 
    */
    public int findDuplicate(int[]arr)
    {
        int xor = 0;
        for(int i : arr )
        {
            xor = xor ^ i;

        }
        return xor;
    }

}