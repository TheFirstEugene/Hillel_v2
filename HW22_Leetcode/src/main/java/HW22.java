public class HW22 {
    public int[] twoSum(int[] nums, int target) {
        int a;
        int b = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                a = nums[i] + nums[j];
                if (a != target) {
                    continue;
                } else {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Not found");
    }
}
class Main{
    public static void main(String[] args) {
        HW22 hw  = new HW22();
        System.out.println(hw.twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 9));

    }
}
