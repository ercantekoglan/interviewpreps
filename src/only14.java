
public class only14 {

	public static void main(String[] args) {
		
		int[] a = {1, 4, 2, 4};
		
		only14(a);
		
		powerN(3,3);

	}
	
	
	public static boolean only14(int[] nums) {
		  
		  boolean a = false;
		  
		  for(int i = 0; i < nums.length; i++){
		    
		    if(nums[i] == 1 || nums[i] == 4){
		      a = true;
		    }else{
		      a = false;
		    }
		    
		    
		  }
		  
		  return a;
		  
		}
	
	
	public static int powerN(int base, int n) {
		   if (n == 0) return 1;
		 
		  
		  return base * powerN(base, n-1);
		}


}
