class Solution {
    public int maxProduct(int n) {
        String numberStr = Integer.toString(n);
        int maximum= 0;
        for(int i = 0; i<numberStr.length(); i++){
            for(int j = i+1; j<numberStr.length(); j++){
                int digit1 = numberStr.charAt(i) - '0';
                int digit2 = numberStr.charAt(j) - '0';
                int currentmaximum = digit1*digit2;
                if(currentmaximum>maximum){
                    maximum = currentmaximum;
                }
            }
        }
        return maximum;
    }
}
