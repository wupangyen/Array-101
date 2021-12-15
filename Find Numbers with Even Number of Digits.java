class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        int currentNum = 0;
        int count = 0;
        
        for(int num: nums){
            currentNum = num;
            while(currentNum != 0){
                currentNum = currentNum / 10;
                count += 1;
            }
            if(count % 2 == 0){
                res += 1;
                
            }
            count = 0;
            
        }
        return res;
        
    }
}
