package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class wordChanger {
	
	public static Boolean res = false;
	public static ArrayList arr = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String begin= "hit";		
//		String target = "cog";
//		String words[] = {"hot", "dot", "dog", "lot", "log"};
		
		
		
		String begin= "hit";		
		String target = "cog";
		String words[] = {"hot", "dot", "dog", "lot", "log", "cog"};
		
		solution(begin,target,words);
//		System.out.println("num is "+solution(begin,target,words));

	}
	
    public static int solution(String begin, String target, String[] words) {
        int answer = 1;
        
        
        int result = 0;
        for (int i = 0; i < words.length; i++) {
			if(words[i].equals(target)) {
				result=1;				
				break;
			}
		}
        
        //words배열안에 target이 없으면 0제출
        if(result!=1) {
        	return 0;
        }
        
        result = findTarget(begin,target,words, 0, new ArrayList());
        
        System.out.println("result = "+result);
        
        
        return result;
    }

	private static int findTarget(String begin, String target, String[] words , int result ,ArrayList history) {

		for (int i = 0; i < words.length; i++) {
			String next= words[i];
			
//			System.out.println("hi");
			
			//next가 target과 동일하면 정답 반환
			
			//다음 단어를 찾는함수
			if(findOnenext(begin,next)) {
				
				if(next.equals(target)) {
					result++;
					System.out.println("result "+result);
					
					System.out.println("history is ="+history+" "+next);
					
					res =true;
//					return ++result;
					return result;
				}
				
//				System.out.println(begin+" next is ="+next);
//				++result;
			
				int del =i;
				//배열 재생성
				history.add(next);
				String[] newArray = IntStream.range(0, words.length)
	                    .filter(i2 -> i2 != del)
	                    .mapToObj(i2 -> words[i2])
	                    .toArray(String[]::new);
				
				
//				System.out.println(Arrays.toString(newArray) );
				System.out.println("next = "+next+"\ttarget = "+target);
				
				result = findTarget(next,target,newArray,++result , history);
				
//				if(res) {
//					res=false;
//					return result;
//				}else {
//					return -1;
//				}
				
//				if(res) {
//					return result;
////					break;
//				}
			}
		}
		
		return result;
		
	}

	
	//다음 단어 찾기
	private static Boolean findOnenext(String begin, String next) {
		// TODO Auto-generated method stub
		int result=0;
		for (int i = 0; i < begin.length(); i++) {
			if(begin.charAt(i) != next.charAt(i)) {
				result++;
			}
			
			//안맞는 횟수가 1이상이면 못찻는걸로 넘어감
			if(result>1) {
				return false;
			}
		}
		//안맞는 횟수가 0이어도 못찻는걸로 넘어감
		if(result==0)
			return false;
		
		//맞는횟수가 1이면 찾는걸로 넘어감
		return true;
	}

}

