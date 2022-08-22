class Solution {
    public double average(int[] salary) {
        int min=salary[0];
        int max=0;
        for(int i:salary){//find max and min element
            if(i<min) min=i;
            if(i>max) max=i;
        }
        int avg=0;
        int n=salary.length-2;//number of elements removing max and min element
        for(int i:salary){
            if(i!=max && i!=min){
                avg+=i;
            }
        }
        return avg*1.0/n;//float/int gives float value
        
    }
}