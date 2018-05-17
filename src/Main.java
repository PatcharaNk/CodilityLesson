import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//test CyclicRotation
		int[] A = new int[]{3, 8, 9, 7, 6};
		int K = 5;
		//end
		BinaryGap BinaryGapSolve  = new BinaryGap();
		CyclicRotation CyclicRotationSolve = new CyclicRotation(); 
		
		System.out.println(BinaryGapSolve.solution(561892));
		System.out.println(Arrays.toString(CyclicRotationSolve.solution(A, K)));


	}
}
