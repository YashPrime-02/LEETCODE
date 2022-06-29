class Solution {
			public boolean isPalindrome(String s) {
				if(s.length()==0)
					return true;
				StringBuilder sb=new StringBuilder();
				s=s.toLowerCase();
				for(int i=0;i<s.length();i++)
				{
					char ch=s.charAt(i);
					if(Character.isLetterOrDigit(ch))
					{
						sb.append(ch);
					}
				}
				return isPallindrome(sb);
			}
			public boolean isPallindrome(StringBuilder sb)
			{
				int i=0;
				int j=sb.length()-1;
				while(i<=j)
				{
					if(sb.charAt(i)==sb.charAt(j))
					{
						i++;
						j--;
					}
					else
					{
						return false;
					}
				}
				return true;
			}
		}