class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
    HashMap<Integer,Integer>m=new HashMap<>();
    for(int i:nums)
    {
        m.put(i,m.getOrDefault(i,0)+1);
    }
    List<Integer>l=new ArrayList<>();
    int k=nums.length/3;
    for(int i:m.keySet())
    {
        if(m.get(i)>k)
        l.add(i);
    }
    return l;
    }
}