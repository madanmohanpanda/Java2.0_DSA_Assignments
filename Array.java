/*
 * Q1: Write a program to print the sum of all the elements present on even indices in the given array.
Input 1: arr[] = {3,20,4,6,9}
Output 1: 16
Input 1: arr[] = {4,3,6,7,1}
Output 1: 11
*/


class ArrayMethod{
    public int sumEvenIdx(int[] arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length;i++)
        {
            if(i%2 == 0)
            {
                sum+= arr[i];
            }
        }

        return sum;
    }
    /* 
    Q2: Write a program to traverse over the elements of the array using for each loop and print all even
    elements.
    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 34 54
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 4 6
    */

    public void displayEven(int[]arr)
    {
        for(int ele: arr)
        {
            if(ele%2 == 0)
            {
                System.out.println(ele+ ", ");
            }
        }
    }
        /* Q3: Write a program to calculate the maximum element in the array.
    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 65
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 7 */

    public int findMax(int[]arr)
    {
        int max = Integer.MIN_VALUE;
        for(int ele: arr)
        {
            if(ele>max)
                max = ele;
        }
        return max;
    }
        /* Q4: Write a program to find out the second largest element in a given array.
    Input 1: arr[] = {34,21,54,65,43}
    Output 1: 54
    Input 1: arr[] = {4,3,6,7,1}
    Output 1: 6 */
    public int findSecLargest(int[] arr)
    {
        int large= Integer.MIN_VALUE;
        int large2 = Integer.MIN_VALUE;
        for(int ele: arr)
        {
            if(ele>large)
            {
                large2 = large;
                large = ele;
            }
        }
        return large2;
    }
        /*
    Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
    its just left and just right neighbor.
    Input 1: arr[] = {1,3,2,6,5}
    Output 1: 6
    Input 2: arr[] = {1 4,7,3,2,6,5}
    Output 1: 7
    */
    public int peek(int[] arr)
    {
        if(arr.length<3)
            return -1;
        int peek = Integer.MIN_VALUE;
        for(int i=2;i<arr.length-2;i++)
        {
            if(arr[i]> arr[i-1] && arr[i]>arr[i+1])
            {
                peek = arr[i];
            }
        }

        return peek;
    }
}

class Array{

    public static void main(String[] args)
    {
        int[] arr= {2,3,4,1,5,6};
        ArrayMethod am = new ArrayMethod();
        int large2 = am.findSecLargest(new int[]{2,4,5,6,7,8});
        System.out.println(large2);
        //Q5
        int peek  = am.peek(arr);
        System.out.println("peek element is : "+ peek);
    }
}