package lv2;

import java.util.Iterator;

public class target_num {
	
	static int result_num=0;
	
	public static void main(String[] args) {
		
//		int number[] = {1, 1, 1, 1, 1};
//		int target = 3;
		
		int number[] = {4, 1, 2, 1};
		int target = 4;
		
		
		solution(number,target);
		
		System.out.println("answer is ="+result_num);
	}
	
    public static int solution(int[] numbers, int target) {
        int answer = 0;
               
        
        dfs(0,numbers,target);
        
        return answer;
    }

	private static void dfs(int i, int[] numbers, int target) {
		// TODO Auto-generated method stub
		
		if(i==numbers.length) {
			int result=0;
			for(int sum : numbers)
				result+=sum;
			
			if(result==target) {
				//showarr(numbers);				
				result_num++;
			}
			
		}else {
			//i번째 행을 양수로 재귀호출
			dfs(i+1,numbers,target);			
			
			//i번째 행을 음수로 재귀호출
			numbers[i]=-numbers[i];
			dfs(i+1,numbers,target);
		}
		
		
	}

	private static void showarr(int[] numbers) {
		System.out.print("arr is\t");
		for(int re : numbers) {
			System.out.print(re+", " );
		}
		System.out.println("\n\n");
			
		
	}

}
