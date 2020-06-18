package sortAlgo;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {20,12,-30,5,-1,8,35,-2};
		insertionSrt(intArr);
	}
	
	public static void insertionSrt(int[] intArr) {
		int lenSortedArr;
		for(int i = 1;i<intArr.length;i++) {
			int temp = intArr[i];
			lenSortedArr = i-1;
			while(lenSortedArr>=0 && temp<intArr[lenSortedArr]) {
				intArr[lenSortedArr+1]=intArr[lenSortedArr];
				lenSortedArr--;
			}
			intArr[lenSortedArr+1]=temp;
		}
			
			
		for(int val : intArr)
			System.out.print(val+" ");
	}

}
