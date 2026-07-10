class Solution {
    public int differenceOfSum(int[] nums) {
        int a=0,b=0;
        for(int num:nums){
            a+=num;
            while(num>0){
                b+=num%10;
                num/=10;
            }
        }
        return a-b;
    }
}