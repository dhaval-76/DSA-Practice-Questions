// https://leetcode.com/problems/4sum/

class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        long target_3, target_2, two_sum;
        int front, back;
        int n = num.length;
    
        Arrays.sort(num); 
    
        for (int i = 0; i < n; i++) {
        
            target_3 = (long)target - (long)num[i];
        
            for (int j = i + 1; j < n; j++) {
            
                target_2 = target_3 - (long)num[j];
            
                front = j + 1;
                back = n - 1;
            
                while(front < back) {
                
                    two_sum = (long)num[front] + (long)num[back];
                
                    if (two_sum < target_2) front++;
                
                    else if (two_sum > target_2) back--;
                
                    else {
                    
                        List<Integer> quad = new ArrayList<>(); 
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[front]);
                        quad.add(num[back]);
                        res.add(quad);
                    
                        while (front < back && num[front] == quad.get(2)) ++front;
                    
                        while (front < back && num[back] == quad.get(3)) --back;
                
                    }
                }
                
                while(j + 1 < n && num[j + 1] == num[j]) ++j;
            }
        
            while (i + 1 < n && num[i + 1] == num[i]) ++i;
        
        }
        
    
        return res;
    }
}
