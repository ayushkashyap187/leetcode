class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] ans=new int[intervals.length][2];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] temp=new int[]{intervals[0][0],intervals[0][1]};
        int a=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] <= temp[1]){
                temp[1] = Math.max(temp[1], intervals[i][1]);
            }else{
                ans[a++]=temp;
                temp = new int[]{intervals[i][0], intervals[i][1]};
            }
        }
        ans[a++]=temp;
        return Arrays.copyOf(ans, a);
    }
}