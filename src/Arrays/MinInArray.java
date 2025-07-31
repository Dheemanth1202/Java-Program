package Arrays;

public class MinInArray {
    public static void main(String[] args) {
        int [] arr = {10,8,43,12,5,56,3};
        int n = arr.length;
        int mn = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i]<mn) mn = arr[i];
        }
        System.out.println(mn);
    }
}
