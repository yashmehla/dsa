import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> uniqueList= new ArrayList<>();
        if(nums.length == 0){
            return 0;
        }
        uniqueList.add(nums[0]);
        for (int i = 0; i < nums.length; i++){
            int lastAdded = uniqueList.get(uniqueList.size() - 1);
            int currentNum= nums[i];
            if(currentNum!=lastAdded){
                uniqueList.add(currentNum);
            }
        }
        int k = uniqueList.size();
        for(int i=0;i<k;i++){
            nums[i]=uniqueList.get(i);
        }
        return k;
    }
}
