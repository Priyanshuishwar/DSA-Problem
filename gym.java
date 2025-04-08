Question
// Today you decided to go to the gym. You currently have E energy. 
// There are N exercises in the gym. Each of these exercises drains Ai 
// amount of energy from your body. 
// You feel tired if your energy reaches 0 or below. Calculate the 
// minimum number of exercises you have to perform such that you 
// become tired. Every unique exercise can only be performed at 
// most 2 times as others also have to use the machines. 
// If performing all the exercises does not make you feel tired, return -1. 
// Parameters: 
// E :: INTEGER 
// The first line contains an integer, E, denoting the Energy. 
// E :: 1 -> 10^5 
// N :: INTEGER 
// The next line contains an integer, N, denoting the number of 
// exercises. 
// N :: 1 -> 10^5 
// A :: INTEGER ARRAY 
// Each line i of the N subsequent lines (where 0 ≤ i < N) contains an 
// integer describing the amount of energy drained by ith exercise. 
// A[i] :: 1 -> 10^5 
// Case#: 1 
// Input: 
// 6 
// 2 
// 1 2
// Output: 
// 4 

// CODE

import java.util.Scanner;
import java.util.*;
public class gym {
    public static int helper(int energy,int arr[]){
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);

        for(int i = n-1;i>=0;i--){
            if(energy <= 0){
                break;
            }
            energy = energy - arr[i];
            count++;
            if(energy <= 0){
                break;
            }
            energy = energy - arr[i];
            count++;
        }
        if(energy > 0){
            return -1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int energy = sc.nextInt();
        int n = sc.nextInt();
        
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println(helper(energy,n));
        int ans = helper(energy, arr);
        System.out.println(ans);
    }
}
