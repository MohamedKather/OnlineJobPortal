package com.cg.jobportal.service;

import java.util.List;
import java.util.Optional;

import com.cg.jobportal.entity.BookmarkedFreelancer;
<<<<<<< HEAD
import com.cg.jobportal.exception.BookmarkedFreelancerAlreadyExistsException;
import com.cg.jobportal.exception.NoBookmarkedFreelancerExistsException;
=======
import com.cg.jobportal.exceptions.BookmarkedFreelancerAlreadyExistsException;
import com.cg.jobportal.exceptions.NoBookmarkedFreelancerExistsException;
>>>>>>> acc90fdbde20d16d7025d4de81a7c089b9c11b95

public interface BookmarkedFreelancerService {

	BookmarkedFreelancer saveBookmarkedFreelancer(BookmarkedFreelancer bmark)
			throws BookmarkedFreelancerAlreadyExistsException;

	List<BookmarkedFreelancer> getAllBookmarkedFreelancer();

	Optional<BookmarkedFreelancer> getBookmarkedFreelancerById(long id) throws NoBookmarkedFreelancerExistsException;

	String deleteBookmarkedFreelancerById(long id);

}
