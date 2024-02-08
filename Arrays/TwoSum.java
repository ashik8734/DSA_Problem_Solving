class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j]==target){
                   int[] solution={nums[i],nums[j]};
                   return new int[]{i,j};
                }
            }
        }  
        return null;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5,7};
        int target=9;
        int[] ans=twoSum(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}