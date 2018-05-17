
public class FrogJmp {
	public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int result = 0 ;
        int distance = Y-X;
        result = distance/D;
        if(distance%D > 0)
            result++;
        
        return result;
    }
}
