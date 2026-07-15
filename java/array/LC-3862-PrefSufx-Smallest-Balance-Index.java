class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;
        long leftSum=0;
        long largest = 0;
        long[] leftsumArray= new long[n];
        for(int i=0; i<n;i++){
            leftsumArray[i]=leftSum;
            leftSum+=nums[i];
            if(leftsumArray[i]>largest){
                largest=leftsumArray[i];
            }
        }
        long[] rightprodArray= new long[n];
        long rightProd=1;
        for (int i = nums.length - 1; i >= 0; i--){
            rightprodArray[i]=rightProd;
            if(rightProd>largest/nums[i]){
            rightProd = largest +1;
            }
            else{
                rightProd*=nums[i];
            }
        }
        for(int i = 0; i <nums.length; i++){
            if(leftsumArray[i]==rightprodArray[i]){
                return i;
            }
            leftSum+=nums[i];

        }
        return -1;
    }
}
