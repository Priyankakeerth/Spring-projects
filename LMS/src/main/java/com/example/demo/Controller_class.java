package com.example.demo;

import java.util.Iterator;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class Controller_class {
	
	@Autowired
	private LibraryDB libra;

	
	@GetMapping("Login")
	public ModelAndView first()
	{
		ModelAndView mm=new ModelAndView();
		
		mm.setViewName("htmlpage.html");
		return mm;
		
	}
	@GetMapping("LMS")
	public ModelAndView first1()
	{
		ModelAndView mm=new ModelAndView();
		
		mm.setViewName("login.html");
		return mm;
		
	}
	@GetMapping("Add")
	public ModelAndView first1(Libraray lib)
	{
		//have to do pattern class for validation
		
		
		ModelAndView mm=new ModelAndView();
			mm.setViewName("add.jsp");
			
		return mm;
		
	}
	
	@GetMapping("Get")
	public ModelAndView first2(Libraray lib)
	{
		
		ModelAndView mm=new ModelAndView();
		
		mm.addObject("lib_details", lib);
		mm.setViewName("get.jsp");
		return mm;
		
	}
	@GetMapping("Update")
	public ModelAndView first3(Libraray lib)
	{
		ModelAndView mm=new ModelAndView();
		
		mm.setViewName("update.jsp");
		return mm;
		
	}
	
	@GetMapping("Delete")
	public ModelAndView first4(Libraray lib)
	{
		ModelAndView mm=new ModelAndView();
		
		mm.setViewName("delete.jsp");
		return mm;
		
	}
	
	@GetMapping("info")
	public ModelAndView second(Libraray lib)
	{
		
		ModelAndView mm=new ModelAndView();
		mm.addObject("lib_details", lib);
		 //save in database 
		libra.save(lib);
		mm.setViewName("details.jsp");
		return mm;
		
	}
	@GetMapping("informa_get")
	public ModelAndView se(Libraray lib)
	{
		
		ModelAndView mm=new ModelAndView();
		
		Optional<Libraray> li= libra.findById(lib.getPage());
		Libraray l  =     li.get();
		/*System.out.println( l.getBookName());
		System.out.println(  l.getAuthorName());
		System.out.println( l.getPage());
		System.out.println(  l.getPrice()); */
		mm.addObject("informations", l);
		mm.setViewName("retrive.jsp");
		return mm;

		  
		/*Iterable<Libraray> it=libra.findAll();
		Iterator i=it.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		 	
		}
	*/
		
		//mm.addObject("informations", l);
			
		
	}
	@GetMapping("updation")
	public ModelAndView method(Libraray lib)
	{
		ModelAndView mm=new ModelAndView();
	mm.addObject("lib_details", lib);
	libra.updateLibraray(lib.getBookName(), lib.getAuthorName(),lib.getPrice(),lib.getPage());
		mm.setViewName("updations.jsp");
		return mm;
		
	}
	@GetMapping("deletions")
	public ModelAndView funs(Libraray lib)
	{
		
		ModelAndView mm=new ModelAndView();
		mm.addObject("lib_details", lib);
		 //save in database 

		libra.deleteById(lib.getPage());
		mm.setViewName("deleted.jsp");
		return mm;
		
	}
	
}
