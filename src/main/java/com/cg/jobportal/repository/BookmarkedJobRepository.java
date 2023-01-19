package com.cg.jobportal.repository;

<<<<<<< HEAD
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.jobportal.entity.BookmarkedJob;
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.jobportal.entity.BookmarkedJob;
@Repository
public interface BookmarkedJobRepository extends JpaRepository<BookmarkedJob, Long> {
	
	
	
	
>>>>>>> 776633c4ccacd1fd31533e1914bbdfbaadda2e20

@Repository
public interface BookmarkedJobRepository extends JpaRepository<BookmarkedJob, Long>{
	
	BookmarkedJob save(BookmarkedJob book);
	
	List<BookmarkedJob> findAll();
	
	
}






