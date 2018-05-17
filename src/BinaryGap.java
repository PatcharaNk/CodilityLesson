
public class BinaryGap {
	
	public BinaryGap() {
	}
	
	public int solution(int N ) {
		int gap = 0;
		int num = N;
		int tmp = 0;
		//skip tail
		while(num%2 == 0 && num!=0) {
			num /= 2;
		}
		while(num/2 != 0) {
			if(num%2 == 1) {
				if(tmp > gap) 
				    gap = tmp;
				tmp = 0;
			}
			else 	
				tmp++;
			num/=2;
		}
		if(tmp > gap) 
			gap = tmp;
		return gap;
		
	}
	
	public int solution1(int n) {
		//RichardKavanagh
		int longestSeq = 0;
		int currentSeq = 0;
		boolean oneFlag = false;

		String binaryN = Integer.toBinaryString(n);
		for (char ch : binaryN.toCharArray()) {

			if (oneFlag && ch == '0') {
				currentSeq++;
			}
			else if (ch == '1') {

				if (oneFlag) {
					if (currentSeq > longestSeq) {
						longestSeq = currentSeq;
					}
					currentSeq = 0;
				}
				oneFlag = true;
			}
		}
		return longestSeq;
	}
}

