class Solution 
{
    public String pushDominoes(String dominoes) 
    {
        StringBuilder ans=new StringBuilder("");
        int i=0;
        while(i<dominoes.length())
        {
            char ch=dominoes.charAt(i);
            if(ch=='.')
            {
                int j=i+1;
                while(j<dominoes.length() && dominoes.charAt(j)!='L' && dominoes.charAt(j)!='R') j++;
                if(j<dominoes.length() && dominoes.charAt(j)=='L' )
                {
                    for(int k=i;k<=j;k++)  ans.append("L");
                    i=j+1;
                }
                else if(j<dominoes.length() && dominoes.charAt(j)=='R')
                {
                    for(int k=i;k<j;k++)  ans.append(".");
                    i=j;
                }
                else if(j>=dominoes.length())
                {
                    for(int k=i;k<j;k++)  ans.append(".");
                    i=j;
                }
            }
            else if(ch=='R')
            {
                int j=i+1;
                while(j<dominoes.length() && dominoes.charAt(j)!='L' && dominoes.charAt(j)!='R') j++;
                if(j<dominoes.length() && dominoes.charAt(j)=='R')
                {
                    for(int k=i;k<j;k++)  ans.append("R");
                    i=j;
                }
                else if(j<dominoes.length() && dominoes.charAt(j)=='L')
                {
                    int len=j-i+1;
                if(len%2==0)
                {
                    int half=len/2;
                    for(int k=0;k<half;k++)  ans.append("R");
                    for(int k=0;k<half;k++)  ans.append("L");
                }
                else
                {
                    int half=((len+1)/2)-1;
                    for(int k=0;k<half;k++)  ans.append("R");
                    ans.append(".");
                    for(int k=0;k<half;k++)  ans.append("L");
                }
                i=j+1;
                }
                else if(j>=dominoes.length())
                {
                    for(int k=i;k<j;k++)  ans.append("R");
                    i=j;
                }
            }
            else if(ch=='L') 
            {
                ans.append("L");
                i++;
            }
        }
        return ans.toString();
    }
}