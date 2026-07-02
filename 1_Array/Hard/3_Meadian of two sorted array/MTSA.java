//https://leetcode.com/problems/median-of-two-sorted-arrays/description/

public class MTSA {
     /* public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]= new int [nums1.length + nums2.length];
        int j=0;
        for(int i= 0; i< nums1.length; i++){
             ans[j]= nums1[i];
            j++;
        }
        for(int i= 0; i< nums2.length; i++){
             ans[j]= nums2[i];
             j++;
        }
        Arrays.sort(ans);
        int k= ans.length / 2;
        if( n % 2 == 0){
            return (double)(ans[k]+ans[k-1]) / 2;
        }
        else {
            return  (double) ans[k];
        }
        
    }
    */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]= new int [nums1.length + nums2.length];
        int i=0,
            j=0,
            k=0;
        while(i < nums1.length && j < nums2.length ){
            if(nums1[i] < nums2[j]){
                ans[k]=nums1[i];
                k++;
                i++;
            }
            else{
                ans[k]=nums2[j];
                k++;
                j++;
                
            }
        }
        while(i < nums1.length){
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        int n = ans.length;
        int a = ans.length / 2;
        if( n % 2 == 0){
            return (double)(ans[a]+ans[a-1]) / 2;
        }
        else {
            return  (double) ans[a];
        }
        
    }
    public static void main(String[] args) {
        
    }
}
