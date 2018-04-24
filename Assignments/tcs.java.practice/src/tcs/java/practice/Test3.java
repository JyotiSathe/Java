package tcs.java.practice;


//Java program toto generate all possible subarrays/subArrays
//Complexity- O(n^3) */
/*
 * Problem Summary:
 * Raja loves Strings.In Strings he specially loves palindromes.
 *  Palindromes are strings that read the same when read forward or backwards. 
 *  Here Palindromes considered are only of even length(maybe 0). 
 *  His Teacher gave me him a long string consisting of only digits as a gift on his birthday. 
 *  Now Raja wants to know the longest sub-array whose elements (i.e digits) can be rearranged 
 *  to form a palindrome of even length. 
 *  Raja is unable to figure out the solution to the problem so he asks for your help.

Input: 12345354987 Output: 6
 * 
 * */

/*
https://stackoverflow.com/questions/29329381/check-if-sub-array-is-palindrome-with-pointers
http://www.geeksforgeeks.org/subarraysubstring-vs-subsequence-and-programs-to-generate-them/
http://www.geeksforgeeks.org/subarraysubstring-vs-subsequence-and-programs-to-generate-them/
http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/

 */

public class Test3
{
	static int arr[] = new int[]{1, 2, 3, 4, 4, 5, 5, 3};

	// Prints all subarrays in arr[0..n-1]
	static void subArray( int n)
	{
		String temp="";
		// Pick starting point
		for (int i=0; i <n; i++)
		{
			// Pick ending point
			for (int j=i; j<n; j++)
			{
				// Print subarray between current starting
				// and ending points
				for (int k=i; k<=j; k++){
					//System.out.print(arr[k]+" ");
					temp+=arr[k]+"";
					//System.out.print(temp);						
				}
			}
		}
		performOp(temp);
	}

	static void performOp(String str){
		if(str.length()>1){
			//String temp[]=str.split("");
			permute(str,0,str.length()-1);
			//printSubsequences(temp.length,temp);

			//System.out.println(isPaindrome(str));
		}
	}

	public static boolean isPalindrome(String str){
		String revString=strReverse(str);
		return str.equals(revString);
	}

	/*static void printSubsequences(int n,String[] a)
    {
         Number of subsequences is (2**n -1)
        int opsize = (int)Math.pow(2, n);

         Run from counter 000..1 to 111..1
        for (int counter = 1; counter < opsize; counter++)
        {
            for (int j = 0; j < n; j++)
            {
                 Check if jth bit in the counter is set
                    If set then print jth element from arr[] 

                if (BigInteger.valueOf(counter).testBit(j))
                    System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }*/

	private static String strReverse(String str) {
		// TODO Auto-generated method stub
		char strArr[]=str.toCharArray();
		for(int i=0,j=str.length()-1;i<j;i++,j--){
			char temp=strArr[i];
			strArr[i]=strArr[j];
			strArr[j]=temp;
		}
		return new String(strArr);

	}

	static void permute(String str, int l, int r){
		if (l == r){
			System.out.println(str);
			System.out.println("in permute");
			/*if(isPalindrome(str)){
				System.out.println(str);
			}*/
		}
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}

	static String swap(String a, int i, int j){
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	// Driver method to test the above function
	public static void main(String[] args) 
	{
		System.out.println("All Non-empty Subarrays");
		subArray(arr.length);
		//performOp("345453");
		//permute("123",0,2);
	}
}