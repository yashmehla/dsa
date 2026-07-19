class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder countY = new StringBuilder();
        StringBuilder countX = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch == y){
                countY.append(ch);
            }
            else if(ch==x){
                countX.append(ch);
            }
            else{
                others.append(ch);
            }
        }
        return countY.append(others.append(countX)).toString();
    }
}
