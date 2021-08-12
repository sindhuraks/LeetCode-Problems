class Solution:
    
    def first(self,nums,target,n):
        low,high,res = 0,n-1,-1
        while(low <= high):
            mid = (low + high)//2
            if(nums[mid] > target):
                high = mid - 1
            elif(nums[mid] < target):
                low = mid + 1
            else:
                res = mid
                high = mid - 1
        return res

    def last(self,nums,target,n):
        low,high,res = 0,n-1,-1
        while(low <= high):
            mid = (low + high)//2
            if(nums[mid] > target):
                high = mid - 1
            elif(nums[mid] < target):
                low = mid + 1
            else:
                res = mid
                low = mid + 1
        return res
    
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        pos = []
        n = len(nums)
        pos.append(self.first(nums,target,n))
        pos.append(self.last(nums,target,n))
        return pos
        