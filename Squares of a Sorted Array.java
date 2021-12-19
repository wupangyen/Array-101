class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] newArr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            newArr[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(newArr);
        return newArr;
    }
}

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
*/


/*
Two Pointers 

a pointer points to the smallest element 

b pointer points to the largest element 

created a new array for result

loop from the last elem of the array int i = arr.len - 1; i > 0 ; i--

if (Math.abs(arr[a_pointer] > Math.abs(arr[b_pointer]))){
    result[i] = arr[a_pointer] * arr[a_pointer]
    a_pointer++;
}
else{
 // means elem at b_pointer is greater than a pointer 
 
 result[i] = arr[b_pointer] * arr[b_pointer]
 b_pointer--;
}


return result;

*/
