// OLD SOLUTION
// import java.util.Scanner;
// class Solution {
//     public int getSecondLargest(int[] arr) {
//         int largest=arr[0];
//         int[] arr2 = new int[arr.length];
//         for (int m = 0; m < arr2.length; m++) {
//             arr2[m] = -1;
//         }
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 largest=arr[i];
//             }
//         }
//         for(int j=0;j<arr.length;j++){
//             if(arr[j]<largest){
//                     arr2[j]=arr[j];
//                 }
//             else if(arr[j]==largest){
//                 continue;
//             }
//         }
//         int secondlargest=arr2[0];
//         for(int k=1; k<arr2.length;k++){
//             if(arr2[k]>secondlargest){
//                 secondlargest=arr2[k];
//             }
//         }
//         if(secondlargest==0){
//             return -1;
//         }
//         return secondlargest;
//     }
// }
// --------------------------------------------------------------------------------------
// NEW SOLUTION
import java.util.Scanner;
class Solution {
    public int getSecondLargest(int[] arr) {
        int largest=-1;
        int secondlargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
}
