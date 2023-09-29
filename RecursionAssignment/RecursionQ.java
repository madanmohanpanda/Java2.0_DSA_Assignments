
package RecursionAssignment;

class AllMethods{ 
        /* Q1 : Given an integer, find out the sum of its digits using recursion.
        Input: n= 1234
        Output: 10
        Explanation: 1+2+3+4=10
        */
    public int findSum(int n){
        if(n == 0)
        {
            return 0;
        }
        return n%10+ findSum(n/10);
    }
    /*
     * Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
        That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
        Constraints : 0<=n<=1e6
        Input1 : n = 10
        Output 1 : -5
        Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
        Input 2 : n = 5
        Output 2 : 3
     */
    public int alternateSum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n % 2 == 0)
        {
            return alternateSum(n-1) - n;
        }
        else{
            return alternateSum(n-1) +n;
        }
    }
    /*
     * Q3: Print the max value of the array [ 13, 1, -3, 22, 5].
     */
    public int findMax(int[] arr, int i, int max)
    {
        if(i == arr.length)
            retrun;
        max = max<arr[i]? arr[i]:max;
        findMax(arr, i+1, max);

        return max;

    }
    /*
     * Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10].
     */
    public int findSumArray(int[]arr, int i)
    {
        if(i == arr.length)
        {
            return 0;
        }
        return arr[i] + findSumArray(arr, ++i);
    }
     /* 
        Q5. Given a number n. Print if it is an armstrong number or not. An armstrong number is a number if the sum
        of every digit in that number raised to the power of total digits in that number is equal to the number.
        Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
        Input1 : 153
        Output1 : Yes
        Input 2 : 134
        Output2 : No */
        public int sum(int num, double sum, int n)
        {
            if(num == 0)
            {
                return 0;
            }
            sum = Math.pow(num%10, n) + sum(num/10, sum, n);
            return sum;
        }
        public boolean isAmstrong(int num, int temp,int n)
        {
            double sum = sum(num, num, n);
            if(sum = num)
            {
                retrun true;
            }

            return false;
            
        }
}

class RecursionQ{
    public static void main(String[] args) {
       
       
    }
}