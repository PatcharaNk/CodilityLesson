
public class CountDiv {
	public static int solution(int A, int B, int K) {
		return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
    }
}
