//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length];       // Creating integer array from input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            ArrayList<Integer> result =
                new Solution().findSubarray(arr); // Change List to ArrayList

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> maxlist = new ArrayList<>();
        
        int sum = 0;
        int maxSum = 0;
        
        for(int i=0; i<n; i++) {
            if(arr[i] >= 0) {
                sum += arr[i];
                list.add(arr[i]);
            } else {
                if(maxSum < sum) {
                    maxSum = sum;
                    maxlist = new ArrayList<>(list);
                }
                list.clear();
                sum = 0;
            }
        }
        
        //for last subarray - not added to maxList due to else condition
        if(maxSum < sum) {
            maxSum = sum;
            maxlist = new ArrayList<>(list);
        }
        
        if (maxSum == 0 && maxlist.isEmpty()) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            return result;
        }
        
        return maxlist;
        
    }
}