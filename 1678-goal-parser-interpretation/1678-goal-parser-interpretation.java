class Solution {
    public String interpret(String command) {
        String ans = "";
        for(int i = 0; i < command.length() ; i ++){
            if(command.charAt(i) == 'G'){
                ans = ans + "G";
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                ans = ans + "o";
                i++;
            }else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' ){
                ans = ans + "al";
                i+=3;
            }
        }
        return ans;
    }
}