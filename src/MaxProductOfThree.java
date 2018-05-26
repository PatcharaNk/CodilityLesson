import java.util.*;

public class MaxProductOfThree {
	public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length == 3){
            return A[0]*A[1]*A[2];
        }
        
        Arrays.sort(A);
        
        int length = A.length;
        int right = A[length-1]*A[length-2]*A[length-3];
        int left = A[length-1]*A[1]*A[0];
        
        return Math.max(right,left);
    }
}
