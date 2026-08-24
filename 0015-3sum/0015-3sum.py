class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        n = len(nums)
        my_set = set()
        for i in range (0 ,n):
            our_set = set()
            for j in range (i+1,n):
                third = -(nums[i] + nums[j])
                if third in our_set:
                    temp = [nums[i] , nums[j], third]
                    temp.sort()
                    my_set.add(tuple(temp))
                our_set.add(nums[j])

        return [list (ans) for ans in my_set]