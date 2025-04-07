package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] arr){
       
        //메소드 내용작성
    	String temp="";
    	
    	for(int i=0; i<arr.length; i++) {
    		temp += arr[i];
    	}
    	
        return temp;
    }

}