class Solution {
    public String addStrings(String num1, String num2) {
        
        String res = "";
        int sum = 0;
        int lenNum1 = num1.length()-1;
        int lenNum2 = num2.length()-1;

        while(lenNum1 >= 0 || lenNum2 >= 0 || sum ==1) {

            sum += ((lenNum1 >= 0)? num1.charAt(lenNum1) - '0': 0);
            sum += ((lenNum2 >= 0)? num2.charAt(lenNum2) - '0': 0);

            res = (char)(sum % 10 + '0') + res;

            sum /= 10;

            lenNum1--;lenNum2--;
        }

        return res;
    }
}