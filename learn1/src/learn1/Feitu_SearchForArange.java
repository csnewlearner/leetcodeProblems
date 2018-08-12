package learn1;

public class Feitu_SearchForArange {
	  public int[] solution(int[] nums, int target) {
	      int lo=0,hi=nums.length-1;  
	      int mid;
	      int[] res = {-1,-1};
	      while(lo<hi) {
	    	  
	    	  mid=lo+hi/2;
	    	  if(nums[mid]<target) {
	    		  lo=mid+1;
	    	  }else {hi=mid;}
	    	 
	    	  
	      }
	     if(nums[lo]!=target)return res;
	     else {res[0]=lo;}
          while(lo<hi) {
	    	  
	    	  mid=lo+hi/2;
	    	  if(nums[mid]>target) {
	    		  hi=mid-1;
	    	  }else {lo=mid;}
	    	 
	    	  
	      }
          if(nums[hi]!=target)return res;
 	     else {res[1]=hi;}
	   return res;
	  
	  }
}
