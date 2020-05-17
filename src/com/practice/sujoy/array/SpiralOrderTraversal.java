package com.practice.sujoy.array;

public class SpiralOrderTraversal {
	public static void main(String[] args) {
		int arr[][]={{1,2,3,4},
					 {5,6,7,8},
					 {9,10,11,12},
					 {13,14,15,16}
		};
		int col = 4;
		int row =4;
		traverseInSpriralOrder(arr,row-1 ,col-1 );
	}

	private static void traverseInSpriralOrder(int[][] arr, int row_max, int col_max) {

		int row_min = 0;
		int col_min = 0;
		while(row_max>row_min ||col_max>col_min){
			for(int i=col_min;i<=col_max;i++){
				System.out.println(arr[row_min][i]);
			}
			row_min ++;
			for(int i=row_min;i<=row_max;i++){
				System.out.println(arr[i][col_max]);
			}
			col_max--;
			for(int i= col_max;i>=col_min;i--){
				System.out.println(arr[row_max][i]);
			}
			row_max--;
			for(int i=row_max;i>=row_min;i--){
				System.out.println(arr[i][col_min]);
			}
			col_min++;
		}
	}
}
