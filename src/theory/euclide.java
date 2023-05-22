package theory;

import test.sout;

public class euclide {
	
	public static void main(String[] args) {
		
		int numa = 615146;
		int numb = 310232;
				
		euclide(numa,numb);
		
		System.out.println(numb/4);
		System.out.println(numa/4);
	}

	private static void euclide(int bigNum, int smallNum) {
		
		int remain=0;
		remain = bigNum>smallNum ? bigNum%smallNum : smallNum%bigNum; 
		
		if(remain>0) {
			euclide(smallNum,remain);
		}else {
			System.out.println("최대공약수는 "+smallNum);
			System.out.println("remain"+remain);
			System.out.println("bignum"+bigNum);
			
			
		}
	}

}
