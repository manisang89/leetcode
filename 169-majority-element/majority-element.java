class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>m=new HashMap<>();
    for(int i:nums)
    {
        m.put(i,m.getOrDefault(i,0)+1);
    }

    int k=nums.length/2;
    for(int i:m.keySet())
    {
        if(m.get(i)>k)
        return i;
    }
    return 0;
    }
}