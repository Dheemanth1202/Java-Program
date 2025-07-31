package Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr; // Shallow copy
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
