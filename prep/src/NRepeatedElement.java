public class NRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {5,1,5,2,5,3,5,4};

        System.out.println(repeatedNTimes(arr));
    }

    static int repeatedNTimes(int[] nums) {
        int count = 0;
        int num = 0;

        for(int i=0;i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(i!=j) {
                    if(nums[i] == nums[j]) {
                        System.out.println("Num[" + i + "] " + nums[i] + "Num[" + j + "]" + nums[j]);
                        num = nums[i];
                    }
                }
                count++;
            }
        }
        return num;
    }
}
