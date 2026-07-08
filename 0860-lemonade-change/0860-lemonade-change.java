class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        int i=0;
        while(i<bills.length){
            if(bills[i]==5) {
                five++;
                i++;
            }
            else if(bills[i]==10){
                if(five>0){
                five--;
                ten++;
                i++;
                }else{
                    return false;
                }
            }else{
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                    i++;
                } else if (five >= 3) {
                    five -= 3;
                    i++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}