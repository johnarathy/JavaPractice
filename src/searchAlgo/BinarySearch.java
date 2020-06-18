package searchAlgo;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inArr = {1,2,3,4,5,6,7,8,9};
		int search = 90;
		int start = 0;
		int  end = inArr.length -1;
		int mid = (end+start)/2;
		boolean found = false;
		System.out.println("start of while");
		while(!found && start<=end) {
			System.out.println("in while : " + start+":"+mid+":"+end);
			if(inArr[mid] == search) {
				found = true;
				break;
			}
			else if(search < inArr[mid]) {
				end = mid;
			}
			else if(search > inArr[mid]) {
				start = mid+1;
			}
			mid = (end + start)/2;
		}
		if(found == true) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}

}
