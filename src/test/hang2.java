package test;

import java.util.ArrayList;
import java.util.Iterator;

public class hang2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		int[][] calc = new int [n][n];
		
		int pointx= 0;
		int pointy= 0;
		int value=0;
		int chasu=0;
		
		for (int i = 0; 0 < n; i++) {
			int i2=0;
			
			switch (chasu%3) {
			case 0:
				
				for (i2 = 0; i2 < n; i2++) {
					calc[pointx+i2][pointy] = ++value;
				}
				pointx=pointx+i2-1;
				++pointy;
				
				--n;				
				chasu++;
				showarr(calc);
				
				break;
			case 1:
				
				for (i2 = 0; i2 < n; i2++) {
					calc[pointx][pointy+i2] = ++value;
				}
				pointy=pointy+i2-2;
				--pointx;
				--n;
				chasu++;
				showarr(calc);
				break;
			case 2:
				
				for (i2 = 0; i2 < n; i2++) {
					calc[pointx-i2][pointy-i2] = ++value;
				}
				
				showarr(calc);
				
				pointx=pointx-i2+2;
				pointy=pointy-i2+1;
				
				--n;
				chasu++;
				showarr(calc);
				
				break;

			default:
				
				break;
			}
			
		}
		
		ArrayList<Integer> a= new ArrayList<>();
		int result[] = new int[value];
		n=0;
		for (int i = 0; i < calc.length; i++) {
			for (int j = 0; j < i+1; j++) {

				
				result[n]=calc[i][j];
				n++;
			}
		}
		
//		int result[] = a.toArray(new int[a.size()]);
		
		
		
		
//		System.out.println("\narray=\t"+a);
		System.out.println("\narray=\t"+result);
		
//		showarr(calc);

	}

	private static void showarr(int[][] calc) {
		// TODO Auto-generated method stub
		System.out.println();
		for (int i = 0; i < calc.length; i++) {
			for (int j = 0; j < calc[i].length; j++) {
				System.out.print(calc[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
;