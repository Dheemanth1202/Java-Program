package Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int [] arr = {10,8,43,12,5,56,3};
        int n = arr.length;
        int mx = arr[0];
        for (int i = 1; i < n; i++) {
            // if (arr[i]>mx) mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if(arr[i] != mx)
                smx = Math.max(smx,arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
