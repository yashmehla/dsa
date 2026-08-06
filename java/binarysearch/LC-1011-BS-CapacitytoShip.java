class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int maxelement = weights[0];
        for(int i = 0; i<weights.length; i++){
            sum+=weights[i];
            if(weights[i]>maxelement){
                maxelement = weights[i];
            }
        }
        int left = maxelement;
        int right = sum;
        while(left<=right){
            int mid = left + (right-left)/2;
            int daysreq = daysreqfunction(weights,mid);
            if(daysreq > days){
                left = mid +1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
    int daysreqfunction(int[] wt, int cap){
        int day=1;
        int load=0;
        for(int i=0; i<wt.length; i++){
            if(load+wt[i]>cap){
                day+=1;
                load=wt[i];
            }
            else{
                load+=wt[i];
            }
        }
        return day;
    }
}
