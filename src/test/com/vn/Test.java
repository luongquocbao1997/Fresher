/*
 * (C) Copyright 2020 Fresher Academy.All Rights Reserved.
 *
 * @author Admin
 * @Date 29 thg 9, 2020
 * @version
*/
package test.com.vn;

import java.util.ArrayList;
import java.util.List;

public  class Test {
	
	public static void main(String[] args) {
    String[] strs ={"flower","flow","flight"};		
    String[] str  = {"dog","racecar","car"};
    int[] nums= {1, 2, 3};
    Test t = new Test();
    String result1 = t.test1(strs);
    String result2 = t.test1(str);
    System.out.println("Final 1");
    System.out.println("result1: " + result1);
    System.out.println("result2: " + result2);
    System.out.println("Final 2");
    System.out.println(t.example(nums));
	
	}
	 public String test1(String[] strs) {
		 
		 if (strs.length == 0) return "";
		    String s1 = strs[0];
		    for (int i = 1; i < strs.length; i++)
		        while (strs[i].indexOf(s1) != 0) {
		        	
		            s1 = s1.substring(0, s1.length() - 1);
		            if (s1.isEmpty()) return "";
		        }        
		    
		    return s1;
		}
	  public List<List<Integer>> example(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        result.add(new ArrayList<>());
	        if(nums == null || nums.length == 0){
	            return result;
	        }
	        int s = 0;
	        for(int n:nums){
	            s = result.size();
	            for(int i = 0;i<s;i++){
	                List<Integer> set = new ArrayList<>(result.get(i));
	                set.add(n);
	                result.add(set);
	            }
	        }
	        return result;
}
}
