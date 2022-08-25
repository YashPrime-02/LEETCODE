class Solution {
public boolean areAlmostEqual(String s1, String s2) {

   if(s1.equals(s2))
      return true;
  
   float count =0 ;
  
  HashMap<Character,Integer> h1 = new HashMap<>();
  HashMap<Character,Integer> h2 = new HashMap<>();
  
  for(int i =0 ;i< s1.length() ;i++){
    h1.put(s1.charAt(i),h1.getOrDefault(s1.charAt(i),0)+1);
    h2.put(s2.charAt(i),h2.getOrDefault(s2.charAt(i),0)+1);
  }
  if(!h1.equals(h2))
    return false;
  
   

  for(int i =0 ;i< s1.length() ;i++){
    if(s1.charAt(i) != s2.charAt(i))
      count++;
  }
  count /= 2;
  
  if(count==1  || count==0)
    return true;
  
  return false;
}
}