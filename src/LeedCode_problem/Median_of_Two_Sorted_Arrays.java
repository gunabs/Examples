package LeedCode_problem;

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		
		

	}
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        
	        
	        int[]c=new int[nums1.length+nums2.length];
			
			for(int i=0;i<nums1.length;i++)
			{
				
				c[i]=nums1[i];
			}
			
			for(int i=0;i<nums2.length;i++)
			{
				c[nums1.length+i]=nums2[i];
			}
			
			int temp=0;
			for(int j=0;j<c.length-1;j++)
			{
			for(int i=0;i<c.length-1;i++)
			{
				if(c[j]<c[i+1])
				{
					c[i]=c[i];
				}
				else if(c[i]>c[i+1])
				
				{	
					temp=c[i];
					c[i]=c[i+1];
					c[i+1]=temp;
					
				}
			}
			}
			
			int mini=0; int max=c.length;
			int mid=mini+max/2;
			
			if(c.length%2==0)
			{
				
	double sum =c[mid]+c[mid-1];
				
				double  median=sum/2;
			
		return	median;
			}
			else
			{
				 mid=mini+max/2;
				 
				 int median=c[mid];
				return median;
			}
	        
	        
	 }

}
