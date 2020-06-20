package javabasics;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcometojava";
		int n = 5;
		System.out.println(getSmallestAndLargest(n));
	}
	public static int getSmallestAndLargest(int k) {

        String s = Integer.toBinaryString(k);
        String compl = "";
        for(int i=0; i<s.length();i++) {
        	compl += (s.charAt(i) == '0' ? '1' : '0');
        }
        int dec = Integer.parseInt(compl,2);
        return dec;
    }

}
