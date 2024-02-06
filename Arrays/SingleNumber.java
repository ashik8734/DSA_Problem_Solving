class SingleNumber {
    public static int singleNumber(int[] nums) {
       //Brute Force:
       for(int i=0;i<nums.length;i++){
           int count=0;
           for(int j=0;j<nums.length;j++){
               if(nums[j]==nums[i]){
                   count++;
               }
           }

           if(count==1){
               return nums[i];
           }
       }
       return -1;

    //   //Optimal 
    //    int xor=0;

    //    for(int i=0;i<nums.length;i++){
    //        xor=xor^nums[i];
    //    }

    //    return xor;

    }

    public static void main(String[] args) {
        int[] arr={1,1,3,2,2,3,4,5,5};
        int ans=singleNumber(arr);
        System.out.println(ans);
    }
}