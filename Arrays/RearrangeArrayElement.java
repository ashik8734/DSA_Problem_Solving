class RearrangeArrayElement {
    public static int[] rearrangeArray(int[] nums) {
  // optimal ssoution

  int n=nums.length;
        int[] newnum= new int[n];
        int pos=0;
        int neg=1;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                newnum[pos]=nums[i];
                pos=pos+2;
            }
            if(nums[i]<0){
                newnum[neg]=nums[i];
                neg=neg+2;
            }

        }
        return newnum;

    }

    public static void main(String[] args) {
        int[] nums={1,-4,3,4,-5,7,-8};
        int[] ans=rearrangeArray(nums);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}