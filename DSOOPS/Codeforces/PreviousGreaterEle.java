//previous greater element
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {10, 4, 2, 20, 40, 12};
		   ArrayList<Integer> list = new ArrayList<>();
		   Stack<Integer> stack = new Stack<>();
		   
		   for(int num : arr) {
		       while(!stack.empty() && stack.peek() <= num) {
		           stack.pop();
		       }
		       if(stack.empty()) {
		           list.add(-1);
		       }
		       else{
		           list.add(stack.peek());
		       }
		       stack.push(num);
		   }
		   System.out.print(list);
	}
}