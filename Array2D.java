import java.util.*;
class Solution {
    /*
     * Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
        number of positive numbers
        number of negative numbers
        number of odd numbers
        number of even numbers
        number of 0.
     */
    public int[][] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array row size : ");
        int row = sc.nextInt();
        System.out.println("Enter col size: ");
        int col = sc.nextInt();

        System.out.println("Now enter the elements");
        int arr[][] = new int[row][col];
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }

        }
        int zero = 0;
        int pn=0; 
        int nn=0;
        int en = 0;
        int on=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j] > 0 )
                {
                    pn++;
                }
                else if(arr[i][j] == 0)
                {
                    zero++;
                }
                else
                    nn++;
                if(arr[i][j] %2 == 0)
                {
                    en ++;
                }
                else    
                    on++;
                
            }
            
        }
        System.out.println("No of Even elements : "+en+"\nNo of Odd Elemets : "+on+"\nNo of Negative Elements : "+nn+"\nNo of Positive no : "+pn+"\nNo of Zeros : "+zero);

        sc.close();
        return arr;
    }
    /* Q2: write a program to print the elements above the secondary diagonal in a user inputted
    square matrix. */
    public void displayUppDiog(int[][] arr)
    {
        System.out.print("Upper ele of Secondary diagonal is : ");
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0; j<arr[0].length-1-i;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
    /* Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
in any order. */
    public void printDiagonal(int[][] arr)
    {
        System.out.print("\nPrimery Diagonal is : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i == j)
                {
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
        System.out.print("\nSecondary diagonal is : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i+ j == arr.length-1)
                {
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
        System.out.println();
    }
    //finding largest element of Q4: Write a program to find the largest element of a given 2D array of integers.
    public int findMax(int[][]arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j] > max ) 
                    max = arr[i][j];
            }
        }

        return max;
    }

    /*     Q5: Write a function which accepts a 2D array of integers and its size as arguments and
    displays the elements of middle row and the elements of middle column. Printing can
    be done in any order.
    [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...] */

    public void findMidEles(int[][]arr, int size)
    {
        int mid = size/2;
        System.out.print("Vertical mid elements are : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(j==mid)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            
        }
        System.out.println();
        System.out.print("Horizontal mid elements  :");
        for(int i=0;i<size;i++)
        {
            
            for(int j=0;j<size;j++)
            {
                if(i==mid)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();

    }

}


public class Array2D {
    public static void main(String[] args) {
       Solution s = new Solution();
       int[][] arr = s.inputArray();
       int size = arr.length;
       int max  = s.findMax(arr);
       s.displayUppDiog(arr);
       s.findMidEles(arr,size);
       s.printDiagonal(arr);
       System.out.println("max element of the array is : "+ max);
    }    
}
