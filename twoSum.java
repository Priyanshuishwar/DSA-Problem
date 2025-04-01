import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans[] = twosum(arr,n,target);
        System.out.println(Arrays.toString(ans));
    }  
    public static int[] twosum(int arr[],int n,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            if(map.containsKey(target - arr[i])){
                return new int[]{map.get(target - arr[i]),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    } 
}    
              /*1. Using Nested Loop */
    // public static int[] twosum(int arr[],int n,int target){
    //     int p[] = new int[2];
    //     p[0] =-1;
    //     p[1] = -1;
    //     for(int i =0;i<n-1;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i] + arr[j] == target){
    //                 p[0] = i;
    //                 p[1] = j;
    //             }
    //         }
    //     }
    //     return p;
    // }
    /*2. Using HashMap */
