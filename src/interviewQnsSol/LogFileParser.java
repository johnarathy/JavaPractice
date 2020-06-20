package interviewQnsSol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import searchAlgo.LinearSearch;

public class LogFileParser {

	public static void main(String[] args) throws IOException {
		String[] sFind = {"Database","Connection", "Failure"};
		String[] sSrch;
		int countError=0;
		LinearSearch ls = new LinearSearch();
		File f= new File("logs.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String s;
		while ((s = br.readLine()) != null) { 
			String[] sArr = s.split(",");
			if(sArr[0].equals("ERROR")){
				sSrch = sArr[2].split(" ");
				int i = ls.linearSrch(sSrch,sFind[0]);
				if(i == -1){
					continue;
				}
				else{
					if(i<sSrch.length-2)
						if(sSrch[i+1].equals(sFind[1]))
							if(sSrch[i+2].equals(sFind[2])) {
								System.out.println(s);
								countError++;
							}
				}
		}
	}
System.out.println(countError);
br.close();
}
}

