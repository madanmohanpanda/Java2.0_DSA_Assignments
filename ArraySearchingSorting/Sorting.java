package ArraySearchingSorting;


class SortingMethod{
    /* Q1. Write a program to sort an array in descending order using bubble sort.
        Input Array {3,5,1,6,0}
        Output Array: {6, 5, 3, 1, 0}. */
    public void bubbleSort(int[] arr)
    {
        int size = arr.length;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //Code for display-->
    public void display(int[]arr)
    {
        for(int ele:arr) System.out.print(ele+ " ");
        System.out.println();
    }
    /*
     * Q2. WAP to sort an array in descending order using selection sort
        Input Array {3,5,1,6,0}
        Output Array: {6, 5, 3, 1, 0}
     */

    public void selectionSort(int[]arr)
    {
        int size = arr.length;
        for(int i=0;i<size;i++)
        {
            int highInd = i;
            for(int j =i+1;j<size;j++)
            {
                if(arr[j]>arr[highInd])
                {
                    highInd = j;
                }

            }
            int temp = arr[highInd];
            arr[highInd] = arr[i];
            arr[i] = temp;
        }

    }
    /*
     * Q3. WAP to sort an array in decreasing order using insertion sort
        Input Array {3,5,1,6,0}
        Output Array: {6, 5, 3, 1, 0}
     */
    public void insertionSort(int[] arr)
    {
        int size= arr.length;


        for(int i=1;i<size;i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && key>arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }
    }

}

//Driver code -->
class Sorting{
    public static void main(String[] args)
    {
        int[] arr = {4,3,5,45,2,6,4,2,5,7,1};
        SortingMethod sm = new SortingMethod();
        // sm.bubbleSort(arr);
        // sm.selectionSort(arr);
        sm.insertionSort(arr);
        sm.display(arr);
        
    }
}
/*
 * Q4. Find out how many pass would be required to sort the following array in decreasing order
    using bubble sort
    Input Array {3,5,1,6,0}

    ans:
        To sort the above arraay using bubble sort we need to perform n-1 passes which is 4 in this case.
 */


 /*
  * Q5. Find out the number of iterations to sort the array in descending order using selection sort.
    Input Array {3,5,1,6,0} 

        ans: 
            in four iteration the abouve array will be sorted.
  */