package test;

public class sout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] solution(int n) {
        int[] answer = {};
        
        
        int[][] calc =new int[n][n];
        
        int goal = n;
        int startx = 0;
        int starty = 0;
        for (int i = 0; i < n; i++) {
			int chasu = i%3;
			calc = putnum(calc,chasu,goal);
			goal--;
		}
        
        return answer;
    }

	private int[][] putnum(int[][] calc, int chasu, int goal) {
		// TODO Auto-generated method stub
		
		switch (chasu) {
		case 0://행이 +1 goal의 갯수만큼
			
			for (int i = 0; i < calc.length; i++) {
				
			}
			
			break;
		case 1://렬이 +1 goal의 갯수만큼
			
			break;
		case 2://행렬이 -1 goal의 갯수만큼
			
			break;
		

		default:
			break;
		}
		
		return calc;
	}
    
    

}
