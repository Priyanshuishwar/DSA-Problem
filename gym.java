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
