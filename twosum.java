public class twosum {
    public static void main(String[] saif) {
        int[] a = {2,7,11,15};
        int[] ans = twoSum(a, 9);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }







    public static int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        for (int j = 0; j < nums.length; j++) {
            for (int k = j+1; k < nums.length; k++) {
                if((nums[j]+nums[k]) == target){
                    a[0] = j;
                    a[1]= k;
                    break;
                }
            }
        }
        return a;
    }



}
