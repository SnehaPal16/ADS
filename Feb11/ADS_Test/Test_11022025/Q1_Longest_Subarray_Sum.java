import java.util.*;

class Q1_Longest_Subarray_Sum{
    public static int getSubarrayLength(int[] arr , int k){
        Map<Integer , Integer> mp = new HashMap<>();
        int n = arr.length;
        int maxLen = -1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if(sum == k){
                maxLen = Math.max(maxLen , i+1);
            }

            int rem = sum - k;

            if(mp.containsKey(rem)){
                int len = i -  mp.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum , i);
            }
        }


        return maxLen;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter array elements : ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter target sum : ");
        int k = sc.nextInt();


        int ans = getSubarrayLength(arr, k);

        System.out.print("Maximum Length of the Subarray with sum "+k+" is "+ans);
    }
}