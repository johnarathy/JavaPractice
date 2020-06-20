package interviewQnsSol;

import java.util.HashMap;
/**
 * WAP to convert date: 21st March 2022 to 2022-03-21 
 * 
 * @author Arathy John
 *
 */
public class ChangeDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String date = "3rd December 2022";
			
			HashMap<String,String> monthMap = new HashMap<String,String>();
			monthMap.put("January","01");
			monthMap.put("February","02");
			monthMap.put("March","03");
			monthMap.put("April","04");
			monthMap.put("May","05");
			monthMap.put("June","06");
			monthMap.put("July","07");
			monthMap.put("August","08");
			monthMap.put("September","09");
			monthMap.put("October","10");
			monthMap.put("November","11");
			monthMap.put("December","12");
			
			String[] newDate = new String[3];
			String[] dateArr = date.split(" ");
			newDate[0] = dateArr[2];
			if(monthMap.containsKey(dateArr[1])){
				newDate[1] = monthMap.get(dateArr[1]);
			}
			if(dateArr[0].length() == 3){
			newDate[2] = dateArr[0].substring(0, 1);
			}
			else if(dateArr[0].length()==4){
			newDate[2] = dateArr[0].substring(0,2);
			}
			String newDateVal = newDate[0] + "-"+newDate[1]+"-"+newDate[2];
			System.out.println(newDateVal);
			}
}
