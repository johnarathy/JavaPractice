package sortAlgo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {20,12,-30,5,-1,8,35,-2};
		selectionSrt(intArr);
	}
	
	public static void selectionSrt(int[] intArr) {
		int minPos = 0;
		while(minPos<intArr.length) {
			for(int i=minPos;i<intArr.length;i++) {
				if(intArr[minPos]>intArr[i]) {
					int temp = intArr[minPos];
					intArr[minPos] = intArr[i];
					intArr[i] = temp;
				}
			}
			minPos++;
		}
		for(int val : intArr)
			System.out.print(val+" ");
	}
}
