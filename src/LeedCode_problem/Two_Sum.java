package LeedCode_problem;

public class Two_Sum {

	public static void main(String[] args) {
		Two_Sum obj=new Two_Sum();
		
		int nums[]= {2,7,11,15}; 
		
		int target=7;
		
		obj.twoSum(nums, target);
		

	}
	
	 public int[] twoSum(int[] nums, int target) {
			
		  
			for(int i = 0;i<nums.length;i++){ 
				for(int j = i+1;j<nums.length;j++){
        
					 if(nums[i] + nums[j] == target){
           
                      return new int[]{i,j};
                     }
                 
				}

			
         }
     
     return new int[]{};
		
 
 }

}
