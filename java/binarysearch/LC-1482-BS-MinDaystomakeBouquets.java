class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int max = 0;
        int min = bloomDay[0];
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]>max){
                max = bloomDay[i];
            }
            if(bloomDay[i]<min){
                min = bloomDay[i];
            }
        }
    // BRUT Solution (Gives TLE)
    //     for(int i = min; i<=max; i++){
    //         if(possible(bloomDay, i , m, k) == 1){
    //             return i;
    //         }
    //     }
    // return -1;
    
    int left = min;
    int right = max;
    int ans = 0;
    while(left<=right){
        int mid = left+(right-left)/2;
        if(possible(bloomDay,mid,m,k)==1){
            ans = mid;
            right  = mid-1;
        }
        else{
            left = mid +1;
        }
    }
    return left;
    }
    public int possible(int array[], int day,int m,int k){
        int count = 0;
        int noofB = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]<=day){
                count++;
            }
            else{
                noofB+=count/k;
                count = 0;
            }
        }
        noofB+=count/k;
        if(noofB>=m){ 
            return 1;
        }
        else{
            return 0;
        }
    }
}
