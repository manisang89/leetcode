class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        sets=set();
        for i in nums:
            if i>0:
                sets.add(i)
        
        for i in range(1,len(nums)+2):
            if i not in sets:
                return i
