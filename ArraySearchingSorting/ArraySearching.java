package ArraySearchingSorting;

import java.util.Scanner;

class ArrayOperation{
        /* Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
    else print “Element not found in array”. Input the size of array, array from user and the element X from user.
    Use Linear Search to find the element. */

    public int findEle(int[]arr, int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
        /* Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
    not present return -1.
    Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
    Output 1: 6
    Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
    Output 2: -1 */
    public int findLastOcc(int[]arr, int target)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }

        return -1;
    }
    /*
        * Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
    Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
    Output 1: 6
    Input 2: arr = [ 0 0 0 0 0 1 1]
    Output 2: 2
     */
    public int calOnes(int[] arr)
    {
        int count=0;

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] == 0)
            {
                break;
                
            }
            else{
                count++;
            }
        }


        return count;
    }
    /*
     * Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
        is not found in the array, report that as well.
        Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
        target = 5
        Output: Target 5 occurs 3 times
        Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
        target = 6
        Output: Target 6 occurs 2 times
     */
    public int countOcc(int[]arr, int key)
    {
        boolean flag = false;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key && flag)
            {
                count++;
            }
            else if(flag && arr[i]!= key)
            {
                break;
            }
        }
        return count;

    }
    
    /*
     * Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
        A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer
        with itself.
        Example 1:
        Input: num = 16
        Output: true
        Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
        Example 2:
        Input: num = 14
        Output: false
        Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
     */
    public boolean isPerfectSq(int num)
    {
        int high = num/2;
        int low = 2;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(mid * mid == num)
                return true;
            else if(mid*mid> num)
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}



//Driver code for the whole program

class ArraySearching{
    public static void main(String[] args) {
        int num = 225;
        ArrayOperation ao = new ArrayOperation();
        System.out.println(ao.isPerfectSq(num));
        System.out.println("Enter size of the array.");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements manually");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("No of one present in the above array is: "+ (ao.calOnes(arr)));

        System.out.println("Last occurance : " + ao.countOcc(arr, 23));
        sc.close();
    }
}