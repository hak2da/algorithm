package test;

import java.util.Iterator;

public class hang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int[][] calc = new int [n][n];
		
		int pointx= 0;
		int pointy= 0;
		int value=0;
		
		calc = makehang(n,pointx,pointy , calc,value);
		n=n-1;
		pointx=n;
		pointy++;
		value=10;
		calc = makeyeol(n-1,pointx,pointy , calc,value);
		
		showarr(calc);

	}

	private static int[][] makeyeol(int n, int pointx, int pointy, int[][] calc,int value) {
//		int [][] harr =new int [n][n];
		int i=0;
		for (i = 0; i < n; i++) {
			calc[pointx][pointy+i] = ++value;
//			starty=starty+i;
		}
		pointy=pointy+i;
				
		return calc;
	}


	private static int[][] makehang(int n, int pointx, int pointy, int[][] calc, int value) {
//		int [][] harr =new int [n][n];
		int i = 0;
		for (i = 0; i < n; i++) {
			calc[pointx+i][pointy] = ++value;
//			pointx=i;
		}
		pointy=pointy+i;
				
		return calc;
		
	}
	private static void showarr(int[][] calc) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < calc.length; i++) {
			for (int j = 0; j < calc[i].length; j++) {
				System.out.print(calc[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
;