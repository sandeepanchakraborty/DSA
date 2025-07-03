import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> temp=new ArrayList<>();
        int i=0,j=0;
        int n=nums1.length;
        int m=nums2.length;

        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums2[j]<nums1[i]){
                j++;
            }else{
               if(temp.isEmpty() || temp.get(temp.size() - 1) != nums1[i]){
                temp.add(nums1[i]);
               }
               i++;
               j++;
            }

        }

        int[] ans=new int[temp.size()];
        for(int k=0;k<temp.size();k++){
            ans[k]=temp.get(k);
        }

        return ans;
    }
}