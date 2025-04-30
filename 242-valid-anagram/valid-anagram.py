class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        dic={}
        for i in s:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        dic1={}
        for i in t:
            if i in dic1:
                dic1[i]+=1
            else:
                dic1[i]=1
        for i in dic:
            if dic.get(i)!= dic1.get(i):
                return False
        return True
        