class Solution:
    def myPow(self, x: float, n: int) -> float:
        if(n == 0):
            return float(1)
        elif(n > 0):
            if(n == 1):
                return x
            else:
                return x**n
        else:
            return x**n
