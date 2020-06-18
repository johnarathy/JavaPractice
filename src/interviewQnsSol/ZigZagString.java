package interviewQnsSol;

/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
*/

public class ZigZagString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = convert("AB",1);
		System.out.println(s);
	}
	
	public static String convert(String s, int numRows) {
        char[] cArr = s.toCharArray();
        boolean down = true;
        int len = s.length();
        String zzStr = "";
        //if the length of the string is less than the number of rows then return the input string
        if(len<=numRows || numRows==1){
            return s;
        }
        //create a new String array to hold the strings of each row
        String[] strArr = new String[numRows];
        //initialize the strings in the array to empty string.  else null will be available
        for(int i=0;i<numRows;i++){
            strArr[i] = "";
        }

        //get the strings for each row
        int index=0;
        for(int k=0;k<len;k++) {
        	strArr[index]=strArr[index]+cArr[k];
        	//if index matches the end of rows-1 then we need to go upwards
        	if(index==numRows-1) {
        		down = false;
        	}
        	//or if index becomes 0 - then we need to go downwards
        	else if(index == 0) {
        		down=true;
        	}
        	//if down flag is true, increase the index
        	if(down)
        		index++;
        	else
        		index--;
        }
        //append all the row strings to a single string
        for(int j=0;j<numRows;j++) {
        	zzStr=zzStr+strArr[j];
        }
        return zzStr;
	}

}
