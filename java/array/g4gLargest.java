import java.util.Scanner;
class Solution {
    public static int largest(int[] arr) {
        Scanner scanner = new Scanner(System.in);  

        int largest=arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]>largest){
                largest=arr[j];
            }
        }
        return largest;
        
    }
}
