import java.util.Stack;

public class _26_TrappingRainWater {

	 public int trap(int[] height) {
	        
	        if(height.length == 0){
	            return 0;
	        }
	        
	        Stack<Integer> stack = new Stack<>();
	        int totalWaterTrapped = 0;
	        
	        int i = 0;
	        
	        while(i < height.length){
	            
	            while(!stack.isEmpty() && height[stack.peek()] < height[i]){
	                
	                int top = stack.pop();
	                
	                if(stack.isEmpty()){
	                    break;
	                }
	                
	                int currWidth = i - stack.peek() - 1;
	                int currHeight = Math.min(height[i], height[stack.peek()]) - height[top];
	                
	                totalWaterTrapped += (currWidth * currHeight);
	                
	            }
	            
	            stack.push(i);
	            i++;
	        }
	        
	        
	        return totalWaterTrapped;
	    }
}
