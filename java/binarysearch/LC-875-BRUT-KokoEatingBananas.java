class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long k = 1;
        long totalhours = 0;
        long close = 0;
        while(close==0){
            totalhours=0;
            for(int i = 0; i<piles.length; i++){
                if(piles[i]%k!=0){
                    totalhours+=(piles[i]/k)+1;
                }
                else{
                    totalhours+=(piles[i]/k);
                }
            }
            if(totalhours>h){
                k++;
            }
            else{
                close = 1;
            }
        }
        return (int)k;
    }
}
