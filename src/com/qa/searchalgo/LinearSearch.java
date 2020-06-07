package com.qa.searchalgo;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr = {3,6,1,9,5,8,20};
		int search = 15;
		boolean flag = false;
		for(int i=0; i<iArr.length;i++) {
			if(iArr[i]==search) {
				flag=true;
			}
		}
		if(flag == true) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}

}
