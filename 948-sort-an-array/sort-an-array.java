class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public void mergesort(int []nums,int l,int r){
        if(l>=r)
        return;
    
            int mid=l+(r-l)/2;
            mergesort(nums,l,mid);
            mergesort(nums,mid+1,r);
            merge(nums,l,r);
        }
    
    public void merge(int nums[],int l,int r){
        int p1=l,mid=(l+r)/2;
        int p2=mid+1;
        int c[]=new int[r-l+1];
        int i=0;
        while(p1<=mid&&p2<=r)
        {
            if(nums[p1]<=nums[p2])
            c[i++]=nums[p1++];
            else
            c[i++]=nums[p2++];
        }
        while(p1<=mid)
        {
            c[i++]=nums[p1++];
        }
        while(p2<=r)
        {
            c[i++]=nums[p2++];
        }
        for(i=0;i<c.length;i++)
        nums[l+i]=c[i];
    }
}