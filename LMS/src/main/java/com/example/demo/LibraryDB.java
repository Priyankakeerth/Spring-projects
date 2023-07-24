package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface LibraryDB extends CrudRepository<Libraray, Integer>{
	
	@Transactional
	  @Modifying
	  @Query("update Libraray lib set lib.bookName=?1,lib.authorName=?2,lib.price=?3 where lib.page=?4")

	
	    void updateLibraray(String bookName, String authorName,int price,int pages);
		// TODO Auto-generated method stub
		
	
}
