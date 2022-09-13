class Solution {
    public boolean validUtf8(int[] data) {
        int oneByteUTF = 0;    //0xxxxxxx
        int twoByteUTF = 6;    //110xxxxx
        int threeByteUTF = 14;    //1110xxxx
        int fourByteUTF = 30;    //11110xxx
        int nextValidByte = 2;  //10xxxxxx (to check occurence of n-1 next bytes starts with [10]xxxxxx)
        
        int expectedNextByteCountToUtfValidate = 0;
        for(int num : data){
            if(expectedNextByteCountToUtfValidate == 0){
                if(num >> 7 == oneByteUTF){    //1 Byte, so we can cotinue
                    continue;
                }
                else if(num >> 5 == twoByteUTF){   //2 Byte utf, so we need 1(2-1) more byte to match pattern like extValidByte
                    expectedNextByteCountToUtfValidate = 1;
                }
                else if(num >> 4 == threeByteUTF){//3 Byte utf, so we need 2(3-1) more byte to match pattern like extValidByte
                    expectedNextByteCountToUtfValidate = 2;
                }
                else if(num >> 3 == fourByteUTF){//4 Byte utf, so we need 3(4-1) more byte to match pattern like extValidByte
                    expectedNextByteCountToUtfValidate = 3;
                }else{  //if any other number or we can say num has more than 8 bits so return false as utf-8 should have 8 bits number.
                    return false;
                }
            }else{
                if((num >> 6) != nextValidByte){    //checking all remaing byte match with pattern
                    return false;
                }
                expectedNextByteCountToUtfValidate--;
            }
        }
        return expectedNextByteCountToUtfValidate == 0; //if all matched with pattern of nextValidByte it return true
    }
}