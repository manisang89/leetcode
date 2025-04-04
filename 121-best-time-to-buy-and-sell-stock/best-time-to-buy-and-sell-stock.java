class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=0;
        for(int i=0;i<prices.length;i++)
        {
            if(min>prices[i])
            {
                min=prices[i];
            }
            max=Math.max(max,prices[i]-min);
        }
        return max;
    }
}