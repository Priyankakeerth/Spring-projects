package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	void method1(Libraray lib )
	{
		Pattern p=Pattern.compile("([a-zA-Z])");
		Pattern p1=Pattern.compile(("[0-9]"));
		String an=lib.getAuthorName();
		String bn=lib.getBookName();
		//int page=lib.getPage();
	//	Matcher mmm=p1.matcher(();
		Matcher m=p.matcher(an);
		Matcher mm=p.matcher(bn);
		
		
		
		boolean result=m.matches();
		boolean result2=mm.matches();
		
		
		//System.out.println(result);
	
		
	}
	
}
