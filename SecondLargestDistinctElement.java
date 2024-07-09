//Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

class Solution {
    public int print2largest(List<Integer> arr) {
        if(arr == null || arr.size()<2){
            return -1;
        }
        Integer max= Integer.MIN_VALUE;
        Integer secMax = Integer.MIN_VALUE;
        for(Integer i: arr){
            if(i>max){
                secMax= max;
                max = i;
            }
           else if(i>secMax && !i.equals(max)){
                secMax = i;
            }
        }
        if(secMax == Integer.MIN_VALUE){
            return -1;
        }
        return secMax;
        
    }
}
