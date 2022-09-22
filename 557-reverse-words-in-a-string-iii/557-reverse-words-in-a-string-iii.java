class Solution {
    public String reverseWords(String s) {
        StringBuilder Stb=new StringBuilder(s);
        StringBuilder Rev=Stb.reverse();  
        String str=Rev.toString(); 
        str=" "+str;
        str+=" ";
        String[] arr=str.split(" ");
        String st="";
        for(int i=0;i<arr.length;i++) 
        {
            st=arr[i]+" "+st;
            
        }
    return st.trim();
    }
}