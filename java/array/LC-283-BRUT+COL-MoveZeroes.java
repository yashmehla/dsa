//Faster Solution
class Solution {
    public void moveZeroes(int[] nums) {
        int numsmoved[] = new int[nums.length];
        int zeroCount=0;
        for(int i = 0; i <nums.length ; i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else{
                numsmoved[i-zeroCount]=nums[i];
            }
        }
        for(int i=0;i<=zeroCount-1;i++){
            numsmoved[nums.length-zeroCount+i]=0;
        }
        for(int i = 0; i<nums.length; i++){
            nums[i]=numsmoved[i];
        }
    }
}
//Slower solution, uses Collections.
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> moveZero= new ArrayList<Integer>();
        int zeroCount=0;
        for(int i = 0; i <nums.length ; i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else{
                moveZero.add(nums[i]);
            }
        }
        for(int i=0;i<=zeroCount;i++){
            moveZero.add(0);
        }
        for(int i = 0; i<nums.length; i++){
            nums[i]=moveZero.get(i);
        }
    }
}
