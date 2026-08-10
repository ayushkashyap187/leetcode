class Solution {
    public int singleNumber(int[] nums) {
        //  int result = 0;

        // for (int num : nums) {
        //     result ^= num;
        // }

        // return result;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)) set.remove(num);
            else set.add(num);
        }
        return set.iterator().next();
    }
}