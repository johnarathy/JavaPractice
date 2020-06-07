package com.qa.sortingalgos;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {20,12,-30,5,-1,8,35,-2};
		bubbleSrt(intArr);
	}
	
	public static void bubbleSrt(int[] intArr) {
		for(int j=0;j<intArr.length-1;j++) {
		for(int i=0;i<intArr.length-1;i++) {
			if(intArr[i]>intArr[i+1]) {
				int temp = intArr[i];
				intArr[i] = intArr[i+1];
				intArr[i+1]=temp;
			}
		}
		}
		for(int val : intArr)
			System.out.print(val+" ");
	}

}
